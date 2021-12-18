#!/usr/bin/python3

import os

import requests  # type: ignore
import multiprocessing as mp

def fetch_and_save(t):
    idx, link = t
    with open(f"./smilers_folder/{idx}.png", "wb") as file:
        file.write(requests.get(link).content)


def main():
    links = [y for y in [x.strip() for x in open("attachments.txt", "r").readlines()] if y.endswith('png')][::-1]
    with mp.Pool(8) as p:
        p.map(fetch_and_save, enumerate(links))


if __name__ == "__main__":
    try:
        os.mkdir("smilers_folder")
    except:
        pass
    main()
