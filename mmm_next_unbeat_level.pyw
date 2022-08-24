from bs4 import BeautifulSoup as Soup
from pynput.keyboard import Controller, Key
from time import sleep
import os
import requests
import win32gui, win32api
import asyncio
import sys
import multiprocessing

#
#
#
#
# WINDOWS SUCKS - BEGIN

import os
import sys

# Module multiprocessing is organized differently in Python 3.4+
try:
    # Python 3.4+
    if sys.platform.startswith('win'):
        import multiprocessing.popen_spawn_win32 as forking
    else:
        import multiprocessing.popen_fork as forking
except ImportError:
    import multiprocessing.forking as forking

if sys.platform.startswith('win'):
    # First define a modified version of Popen.
    class _Popen(forking.Popen):
        def __init__(self, *args, **kw):
            if hasattr(sys, 'frozen'):
                # We have to set original _MEIPASS2 value from sys._MEIPASS
                # to get --onefile mode working.
                os.putenv('_MEIPASS2', sys._MEIPASS)
            try:
                super(_Popen, self).__init__(*args, **kw)
            finally:
                if hasattr(sys, 'frozen'):
                    # On some platforms (e.g. AIX) 'os.unsetenv()' is not
                    # available. In those cases we cannot delete the variable
                    # but only set it to the empty string. The bootloader
                    # can handle this case.
                    if hasattr(os, 'unsetenv'):
                        os.unsetenv('_MEIPASS2')
                    else:
                        os.putenv('_MEIPASS2', '')

    # Second override 'Popen' class with our modified version.
    forking.Popen = _Popen

# WINDOWS SUCKS - END
#
#
#
#

def w_get_level_id(queue):    
    try:
        url = open('lvl_list.txt', 'r').readlines()[0].strip()
    except:
        url = 'https://megamaker.webmeka.io/stream-nextLevelToBeat.php?USEID=160646'
        
    while True:
        response = requests.get(url=url, cookies={'WMSESS_':'rrq4m62eafl4vc3ofrjp3dcg55', 'mmmSession': 'eyJpc1Rva2VuVmFsaWQiOjEsImRhdGEiOnsiaWQiOjE2MDY0NiwiaWNvbiI6NDQsInVzZXJuYW1lIjoibWVnYSBtYXJpbm8ifSwiZGF0YVNlYyI6eyJpZCI6ImUyZjY4NjI0MGM4YzA0OWYwODJjNzVkN2UwZTBjMThkOTVkMDkxMTkiLCJpY29uIjoiYjk2NTczNGYyNDU1Y2E0MTc5NDA4ZjRkMjNmYjVhNDgwMjUxYWQwOCIsInVzZXJuYW1lIjoiY2FjOWJiYTFlZWU4YWM4MmE1OGY0YjgwMWVkODhmYjE0ZTQ1YjZkZSJ9fQ=='})
        page = Soup(response.text, features='html.parser')
        ids = page.select("#level")
        ids = []
        if os.path.exists('skip.txt'):
            try:
                skip = [s.strip() for s in open('skip.txt', 'r').readlines()]
            except:
                skip = []
        else:
            skip = []
        for tag in page.find_all("td", "tc"):
            if tag.a:
                href = tag.a.get('href')
                if not href.startswith('megamaker://'):
                    continue
                if len(tag.parent.find_all("td")[1].find_all("img")) == 2:
                    continue
                level_id = href.split(':')[-1][2:]
                if level_id not in skip:
                    queue.put(level_id)
                    print(f'Found the level {level_id}')
                    return
        next_page = int(url[url.find('=')+1:url.find('&')]) + 1
        url = url[:url.find('=')] + f'={next_page}' + url[url.find('&'):]
        try:
            with open('lvl_list.txt', 'w') as f:
                f.write(url)
        except:
            pass

def w_get_window_handle(queue):
    if os.path.exists('wh.db'):
        with open('wh.db', 'r') as f:
            handle = int(f.read())
    else:
        ret = []
        def callback(hwnd, extra):
            rect = win32gui.GetWindowRect(hwnd)
            window_name = win32gui.GetWindowText(hwnd)
            if 'Mega Man Maker' == window_name.strip():
                ret.append(hwnd)
        win32gui.EnumWindows(callback, None)
        handle = ret[0]
        with open('wh.db', 'w') as f:
            f.write(str(handle))
    queue.put(handle)

def main():
    if os.path.exists('lock.db'):
        print('lock db was still there')
        return
    open('lock.db', 'w').close()

    qWinHandle = multiprocessing.Queue()
    pWinWorker = multiprocessing.Process(target=w_get_window_handle, args=(qWinHandle,))
    pWinWorker.start()

    qHttpData = multiprocessing.Queue()
    pHttpWorker = multiprocessing.Process(target=w_get_level_id, args=(qHttpData,))
    pHttpWorker.start()

    pWinWorker.join()
    game_window_handle = qWinHandle.get()
    if not game_window_handle:
        print('no game window handle found')
        return
    try:
        win32gui.SetForegroundWindow(game_window_handle)
    except:
        os.remove('wh.db')
        print('game handle was wrong')
        return
    kb = Controller()
    kb.type('x')
    sleep(1.2)
    kb.press(Key.right)
    kb.release(Key.right)
    sleep(0.3)
    kb.press(Key.up)
    kb.release(Key.up)
    sleep(0.1)
    kb.press(Key.right)
    kb.release(Key.right)
    sleep(0.1)
    kb.press(Key.right)
    kb.release(Key.right)
    sleep(0.1)
    kb.press(Key.enter)
    kb.release(Key.enter)
    sleep(0.1)
    for i in range(30):
        kb.press(Key.backspace)
        sleep(0.01)
        kb.release(Key.backspace)
        sleep(0.01)
    pHttpWorker.join()
    level_id = qHttpData.get()
    for e in level_id:
        kb.type(e)
        sleep(0.03)
    kb.press(Key.enter)
    kb.release(Key.enter)

if __name__ == '__main__':
    multiprocessing.freeze_support()
    main()
    try:
        os.remove('lock.db')
    except:
        pass
