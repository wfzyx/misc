def prim():
    from math import ceil

    m = [2]
    yield 2
    p = 3
    while 1:
        flag = 1
        b = ceil(p ** (1 / 2))
        for i in m[1:]:
            if not i > b:
                if p % i == 0:
                    flag = 0
                    break
            else:
                break
        if flag:
            m.append(p)
            yield p
        p += 2


def sum_prim(x):
    from math import ceil

    r = [(True)] + [(True) for i in range(3, x)]
    p = prim()
    b = ceil(x ** (1 / 2))
    for i in p:
        if i > b:
            break
        for j in range(i ** 2, x, i):
            try:
                r[j - 2] = False
            except:
                pass
    r = [i + 2 for i in range(len(r)) if r[i] == True]
    return sum(r)


print(sum_prim(2000000))
