import sys
import win32gui, win32api, win32con
from dataclasses import dataclass
from time import sleep
from pynput.keyboard import Controller, Key

@dataclass
class MMM:
    x: int
    y: int
    w: int
    h: int
    hwnd: None

dummy = []
def callback(hwnd, extra):
    rect = win32gui.GetWindowRect(hwnd)
    window_name = win32gui.GetWindowText(hwnd)
    if 'Mega Man Maker' in window_name:
        x = rect[0]
        y = rect[1]
        w = rect[2] - x
        h = rect[3] - y
        dummy.append(MMM(x, y, w, h, hwnd))
    

def main(blocks, load_stage=4, quit_stage=3):
    win32gui.EnumWindows(callback, None)
    if not dummy:
        print('Mega Man Maker window not found... Is the game open?')
        return
    game = dummy[0]
    win32gui.SetForegroundWindow(game.hwnd)
    kb = Controller()
    for i in range(blocks):
        for i in range(50):
            kb.press(Key.right)
            kb.release(Key.right)
            sleep(0.25)
        sleep(0.75)      
        kb.press(Key.enter)
        kb.release(Key.enter)
        sleep(1)
        kb.press(Key.esc)
        kb.release(Key.esc)
        sleep(1.5)      

if __name__ == '__main__':
    try:
        if len(sys.argv) < 2:
            print('How many blocks of stages to skip? Each block = 500 stages')
            print('Like: "mawino.exe 2" will skip 1000 stages (more or less)')
            print('--------------------------------------------------------')
            print('You can also specify the pauses using extra values')
            print('Example: mawino.exe 3 4 3')
            print('Will skip 3 blocks of 500 (stage 1500+/-)')
            print('will wait for 4 seconds to load a stage and prevent the error')
            print('will wait for 3 secs when leaving the stage to go back to the list before starting next block')
        elif len(sys.argv) == 2:
            main(int(sys.argv[1]))
        elif len(sys.argv) == 3:
            print('Dude, cmon. Either specify both pauses, or none at all')
        elif len(sys.argv) == 4:
            main(int(sys.argv[1]), int(sys.argv[2]), int(sys.argv[3]))
        else:
            print('wtf are you doing?')
    except Exception as e:
        print('Mawinom, I have no idea of what happened. Send me this error on Discord')
        raise e
