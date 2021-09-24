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
    for tag in page.find_all("td", "tc"):
        if tag.a:
            return tag.a.get("href").split(':')[-1][2:]
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
        sleep(0.2)
        kb.press(Key.right)
        kb.release(Key.right)
        sleep(0.2)
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
        for i in range(7):
            kb.press(Key.backspace)
            kb.release(Key.backspace)
            sleep(0.1)
        lvl_id = get_level_ids()
        if not lvl_id:
            return
        for e in lvl_id:
            kb.type(e)
            sleep(0.1)
        kb.press(Key.enter)
        kb.release(Key.enter)
        sleep(0.7)
        kb.press(Key.enter)
        kb.release(Key.enter)
    except Exception as e:
        print(e)
    
    
if __name__ == '__main__':
    main()
    os.remove('lock.db')
