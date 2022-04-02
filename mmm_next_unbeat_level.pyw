from bs4 import BeautifulSoup as Soup
from pynput.keyboard import Controller, Key
from time import sleep
import os
import requests
import win32gui, win32api

def get_level_ids():
    url = 'https://megamaker.webmeka.io/stream-nextLevelToBeat.php?USEID=160646'
    response = requests.get(url=url)
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
            print(href)
            if not href.startswith('megamaker://'):
                continue
            level_id = href.split(':')[-1][2:]
            if level_id not in skip:
                return level_id
    return None

dummy = []
def callback(hwnd, extra):
    rect = win32gui.GetWindowRect(hwnd)
    window_name = win32gui.GetWindowText(hwnd)
    if 'Mega Man Maker' == window_name.strip():
        dummy.append(hwnd)

def main():
    if os.path.exists('lock.db'):
        return
    open('lock.db', 'w').close()
    try:
        win32gui.EnumWindows(callback, None)
        if not dummy:
            return
        game = dummy[0]
        win32gui.SetForegroundWindow(game)
        kb = Controller()
        kb.type('x')
        sleep(1)
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
        lvl_id = get_level_ids()
        if not lvl_id:
            return
        for e in lvl_id:
            kb.type(e)
            sleep(0.05)
        kb.press(Key.enter)
        kb.release(Key.enter)
    except Exception as e:
        print(e)
    
    
if __name__ == '__main__':
    main()
    try:
        os.remove('lock.db')
    except:
        pass
