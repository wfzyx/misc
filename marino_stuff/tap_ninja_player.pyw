import pynput.keyboard as pykb
import pynput.mouse as pyms
from time import sleep
import os


def main():
    kb = pykb.Controller()
    ms = pyms.Controller()
    yyyy = 2035
    mm = 1
    dd = 1
    while True:
        kb.type("q")
        sleep(1)
        kb.type("w")
        sleep(1)
        ms.click(pyms.Button.left)
        sleep(2)
        os.system(f"sudo date -s '{yyyy}-{mm}-{dd} 12:00:00'")
        dd += 1
        if dd > 28:
            dd = 1
            mm += 1
        if mm > 12:
            mm = 1
            yyyy += 1


if __name__ == "__main__":
    main()
