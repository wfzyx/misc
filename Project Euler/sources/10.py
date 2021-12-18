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

    r = [2] + [i for i in range(3, x, 2)]
    p = prim()
    b = ceil(x ** (1 / 2))
    next(p)
    for i in p:
        if i > b:
            break
        r = r[: r.index(i) + 1] + [j for j in r[r.index(i) + 1 :] if j % i != 0]
    return sum(r)


print(sum_prim(2000000))
