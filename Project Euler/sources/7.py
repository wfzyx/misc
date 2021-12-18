def prim():
    m = [2]
    yield 2
    p = 3
    while 1:
        flag = 1
        b = p ** 1 / 2
        for i in m:
            if i < b:
                if p % i == 0:
                    flag = 0
                    break
            else:
                break
        if flag:
            m.append(p)
            yield p
        p += 2


p = prim()
i = 0
nth = 10001
for n in p:
    i += 1
    if i == nth:
        break

print(n)
