# noqa
from PIL import Image, ImageColor, ImageOps  # type: ignore


def GIF_Load(file):
    from ctypes import CDLL, CFUNCTYPE
    from ctypes import POINTER as PT
    from ctypes import Structure
    from ctypes import c_long as cl
    from ctypes import c_ubyte, pointer, py_object, string_at
    from platform import system

    class GIF_WHDR(Structure):
        _fields_ = [
            ("xdim", cl),
            ("ydim", cl),
            ("clrs", cl),
            ("bkgd", cl),
            ("tran", cl),
            ("intr", cl),
            ("mode", cl),
            ("frxd", cl),
            ("fryd", cl),
            ("frxo", cl),
            ("fryo", cl),
            ("time", cl),
            ("ifrm", cl),
            ("nfrm", cl),
            ("bptr", PT(c_ubyte)),
            ("cpal", PT(c_ubyte)),
        ]

    def intr(y, x, w, base, tran):
        base.paste(tran.crop((0, y, x, y + 1)), w)

    def skew(i, r):
        return r >> ((7 - (i & 2)) >> (1 + (i & 1)))

    def fill(w, d, p):
        retn = Image.new("L", d, w.bkgd) if (w.tran < 0) else Image.new("RGBA", d)
        if w.tran < 0:
            retn.putpalette(p)
        return retn

    def WriteFunc(d, w):
        cpal = string_at(w[0].cpal, w[0].clrs * 3)
        list = d.contents.value[0]
        if len(list) == 0:
            list.append(Image.new("RGBA", (w[0].xdim, w[0].ydim)))
        tail = len(list) - 1
        base = Image.frombytes(
            "L", (w[0].frxd, w[0].fryd), string_at(w[0].bptr, w[0].frxd * w[0].fryd)
        )
        if w[0].intr != 0:
            tran = base.copy()
            [
                intr(
                    skew(y, y) + (skew(y, w[0].fryd - 1) + 1, 0)[(y & 7) == 0],
                    w[0].frxd,
                    (0, y),
                    base,
                    tran,
                )
                for y in range(w[0].fryd)
            ]
        tran = Image.eval(base, lambda indx: (255, 0)[indx == w[0].tran])
        base.putpalette(cpal)
        list[tail].paste(base, (w[0].frxo, w[0].fryo), tran)
        list[tail].info = {"delay": w[0].time}
        if w[0].ifrm != (w[0].nfrm - 1):
            trgt = (tail, d.contents.value[1])[w[0].mode == 3]
            list.append(
                list[trgt].copy()
                if (trgt >= 0)
                else fill(w[0], (w[0].xdim, w[0].ydim), cpal)
            )
            if w[0].mode != 3:
                d.contents.value[1] = w[0].ifrm
            if w[0].mode == 2:
                list[tail + 1].paste(
                    fill(w[0], (w[0].frxd, w[0].fryd), cpal), (w[0].frxo, w[0].fryo)
                )

    try:
        file = open(file, "rb")
    except IOError:
        print(file)
        return []
    file.seek(0, 2)
    size = file.tell()
    file.seek(0, 0)
    list = [[], -1]
    CDLL(("%s.so", "%s.dll")[system() == "Windows"] % "./gif_load").GIF_Load(
        file.read(),
        size,
        CFUNCTYPE(None, PT(py_object), PT(GIF_WHDR))(WriteFunc),
        None,
        pointer(py_object(list)),
        0,
    )
    file.close()
    return list[0]


def gen_color():
    rainbow = ["violet", "indigo", "blue", "green", "yellow", "orange", "red"]
    i = 0
    while True:
        i += 1
        i %= len(rainbow)
        yield ImageColor.colormap[rainbow[i]] + "64"


def GIF_Save(file, fext):
    frames = GIF_Load("%s.gif" % file)
    frames = frames[::-1] + frames[:-1]
    color = gen_color()
    for i, frame in enumerate(frames):
        if i % 2 == 0:
            ov = Image.new("RGBA", frame.size, next(color))
        frame.paste(ov, (0, 0), ov)
    frames[0].save(
        "/tmp/Downloads/test.gif", save_all=True, append_images=frames, loop=0
    )


if __name__ == "__main__":
    GIF_Save("/tmp/Downloads/REAL_DANCE", "png")
