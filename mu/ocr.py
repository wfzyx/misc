#!/usr/bin/python3

import pytesseract
import cv2
import re
import typing as t
import numpy as np
import multiprocessing as mp
from enum import Enum
import timeit

class IMGAREA(Enum):
    MSGLOG = 1
    XYCOORD = 2
    STATSTR = 3
    STATAGI = 4
    STATVIT = 5
    STATINT = 6
    STATLVL = 7

# Resizes a image and maintains aspect ratio
def maintain_aspect_ratio_resize(image, width=None, height=None, inter=None):
    # Grab the image size and initialize dimensions
    dim = None
    (h, w) = image.shape[:2]

    # Return original image if no need to resize
    if width is None and height is None:
        return image

    # We are resizing height if width is none
    if width is None:
        # Calculate the ratio of the height and construct the dimensions
        r = height / float(h)
        dim = (int(w * r), height)
    # We are resizing width if height is none
    else:
        # Calculate the ratio of the width and construct the dimensions
        r = width / float(w)
        dim = (width, int(h * r))

    # Return the resized image
    return cv2.resize(image, dim, interpolation=inter)

def get_crop_img(img: np.ndarray, imgarea) -> np.ndarray:
    if imgarea == IMGAREA.MSGLOG:
        y, h, hr = 30, 120, 400
        x, w, wr = 0, 120, None
        a = cv2.INTER_AREA
    elif imgarea == IMGAREA.XYCOORD:
        y, h, hr = 535, 30, 100
        x, w, wr = 15, 50, None
        a = cv2.INTER_AREA
    elif imgarea == IMGAREA.STATSTR:
        y, h, hr = 162, 12, None
        x, w, wr = 555, 30, 100
        a = cv2.INTER_AREA
    elif imgarea == IMGAREA.STATAGI:
        y, h, hr = 228, 12, None
        x, w, wr = 560, 30, 50
        a = cv2.INTER_AREA
    elif imgarea == IMGAREA.STATVIT:
        y, h, hr = 294, 12, None
        x, w, wr = 560, 30, 100
        a = cv2.INTER_AREA
    elif imgarea == IMGAREA.STATINT:
        y, h, hr = 360, 12, None
        x, w, wr = 555, 30, 100
        a = cv2.INTER_AREA
    elif imgarea == IMGAREA.STATLVL:
        y, h, hr = 96, 10, None
        x, w, wr = 562, 20, 100
        a = cv2.INTER_CUBIC
    else:
        pass
    return maintain_aspect_ratio_resize(img[y:y+h, x:x+w], width=wr, height=hr, inter=a)

def preproc(img: np.ndarray) -> np.ndarray:
    #stretch
    #img = cv2.resize(img, (0,0), fx=2, fy=2)
    #grayscale
    img = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
    #inverse -> black letters on white background
    img = cv2.bitwise_not(img)
    #threshold
    img = cv2.threshold(img, 0, 255, cv2.THRESH_BINARY | cv2.THRESH_OTSU)[1]
    #cv2.imshow("Output", img)
    #cv2.waitKey(0)
    return img

def preproc2(img: np.ndarray) -> np.ndarray:
    #stretch
    #img = cv2.resize(img, (0,0), fx=2, fy=2)
    #grayscale
    imgbase = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
    for i in range(3, 101, 2):
        for j in range(1, 100):
            print(i , j)
            img = imgbase
            img = cv2.adaptiveThreshold(img, 255, cv2.ADAPTIVE_THRESH_GAUSSIAN_C, cv2.THRESH_BINARY, i, j)
            #inverse -> black letters on white background
            img = cv2.bitwise_not(img)
            #threshold
            img = cv2.threshold(img, 0, 255, cv2.THRESH_BINARY | cv2.THRESH_OTSU)[1]
            #cv2.imshow("Output", img)
            #cv2.waitKey(0)
            aux = get_text(img)
            if len(aux) and '316' in aux[0]:
                print('AE')
                break
    return img

def get_text(img: np.ndarray) -> str:
#custom_config = r'-l por --psm 6'
    custom_config = r'-l por'
    return pytesseract.image_to_string(img, config=custom_config)

def check_in_lines(pattern: str, lines: t.List[str]) -> bool:
    p = re.compile(pattern, re.IGNORECASE)
    for line in lines:
        if re.search(p, line):
            return True
    return False

def get_msglog(img) -> t.List[str]:
    return get_text(preproc(get_crop_img(img, IMGAREA.MSGLOG))).splitlines()

def get_xycoord(img) -> t.List[str]:
    return get_text(preproc(get_crop_img(img, IMGAREA.XYCOORD))).splitlines()

def get_stats2(img) -> t.Dict[str, str]:
    pool = mp.Pool(processes = 5)
    return dict(zip(['str', 'agi', 'vit', 'int', 'lvl'],
            pool.map(
            get_text, [
                preproc(get_crop_img(img, e)) for e in [
                    IMGAREA.STATSTR,
                    IMGAREA.STATAGI,
                    IMGAREA.STATVIT,
                    IMGAREA.STATINT,
                    IMGAREA.STATLVL,
                ]
            ]
            )))

def get_stats(img) -> t.Dict[str, str]:
    stats = {}
    stats['str'] = get_text(preproc(get_crop_img(img, IMGAREA.STATSTR))).splitlines()[0]
    stats['agi'] = get_text(preproc(get_crop_img(img, IMGAREA.STATAGI))).splitlines()[0]
    stats['vit'] = get_text(preproc(get_crop_img(img, IMGAREA.STATVIT))).splitlines()[0]
    stats['int'] = get_text(preproc(get_crop_img(img, IMGAREA.STATINT))).splitlines()[0]
    stats['lvl'] = get_text(preproc(get_crop_img(img, IMGAREA.STATLVL))).splitlines()[0]
    return stats

def get_resets(img) -> str:
    y, h, hr = 6, 9, 100
    x, w, wr = 150, 140, None
    a = cv2.INTER_AREA
    return get_text(preproc2(maintain_aspect_ratio_resize(img[y:y+h, x:x+w], width=wr, height=hr, inter=a)))

def wrapper(func, *args, **kwargs):
     def wrapped():
         return func(*args, **kwargs)
     return wrapped

if __name__ == '__main__':
    img = cv2.imread('/home/victor/Coding/mu/input2.png')
    #n = 10; print(timeit.timeit(wrapper(get_stats2, img), number=n)/n)
    print(get_stats2(img))
    #img = cv2.imread('/home/victor/Coding/mu/input3.png')
    #print(get_resets(img))
    #cv2.imshow("Output", img)
    #cv2.waitKey(0)
    #print(check_in_lines('conecTado', get_msg_log(img)))
#img = cv2.imread('/home/victor/Coding/ocr_victor2.jpeg')
#img = cv2.imread('/home/victor/Coding/screen.png')

