class BetterString:
    def __init__(self, string):
        self.string = string

    def replace(self, pattern, replace):
        import re

        return BetterString(re.sub(pattern, replace, self.string))

    def filter(self, pattern):
        return self.replace(pattern, "")

    def __str__(self):
        return str(self.string)

    def __repr__(self):
        return repr(self.string)


def main():

    text = open("output.txt", "r").read()

    text = (
        BetterString(text)
        .filter(r"\x0c")
        .filter(r"\n\d{1,3}\n")
        .replace(r",(\w)", r", \1")
        .replace(r"\nFig.[ ]?(\d{1,2})\n", r'\n\n<img src="fig\1.png">\n')
        .replace(r"(?!\d)\n", r" ")
        .replace(r"(\S)\n(\S)", r"\1 \2")
        .replace(r"\.(?!\.)", r".\n\n\n")
        .replace(r"\n ", r"\n")
        .replace(r"\n((\W))", r"\1")
        .replace(r"<(.*)?\n+(.*)>", r"\n<\1\2>\n\n")
        .replace(r"\n(\w)\.", r'\1.')
        .replace(r"Dra.\n", "Dra. ")
        .replace(r'\n(\w\.)\n+', '\1')
        .replace(r'\[(.*)?\n+(.*)?\]', r'[\1\2]')
        .replace(r'\((.*)?\n+(.*)?\)', r'(\1\2)')
        .replace(r'"(.*)?\n+(.*)?"', r'"\1\2"')
        .replace(r'.\n,', '.,')
        .replace(r'Fig.\n\n(\d)', r'Fig. \1')
        .replace(r'', ' ')
    )

    with open("book.md", "w") as f:
        f.write(str(text.replace(r"\. png", r".png")))


if __name__ == "__main__":
    main()
    # import os
    # image_list = os.listdir('./images')
    # image_list = filter(lambda x: not x.startswith('fig'), image_list)
    # for pos, old_file_name in enumerate(image_list):
    #     os.rename(f'./images/{old_file_name}', f'./images/fig{pos}.png')
