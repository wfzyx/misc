# import win32gui, win32api
from pynput.keyboard import Controller, Key
import requests
from bs4 import BeautifulSoup as Soup

def get_level_ids():
    url = 'https://megamaker.webmeka.io/stream-nextLevelToBeat.php?USEID=160646'
    response = requests.get(url=url)
    page = Soup(response.text, features='html.parser')
    ids = page.select("#level")
    ids = []
    for tag in page.find_all("td", "tc"):
        if tag.a and len(ids) < 5:
            ids.append(tag.a.get("href").split(':')[-1][2:])
    return ids

dummy = []
def callback(hwnd, extra):
    rect = win32gui.GetWindowRect(hwnd)
    window_name = win32gui.GetWindowText(hwnd)
    if 'Mega Man Maker' == window_name.strip():
        dummy.append(hwnd)

def main():
    win32gui.EnumWindows(callback, None)
    if not dummy:
        return
    game = dummy[0]
    win32gui.SetForegroundWindow(game.hwnd)
    #open('', ')
    kb = Controller()
    kb.write(ids)

if __name__ == '__main__':
    print(get_level_ids())
    main()
