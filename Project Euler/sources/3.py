def prim():
    n = 2
    while 1:
        flag = 1
        for i in range(2, n):
            if n % i == 0:
                flag = 0
                break
        if flag:
            yield n
        n += 1


p = prim()
x = 600851475143
fac = []
for n in p:
    while x % n == 0:
        x /= n
        fac.append(n)
    if x == 1:
        break

print(fac[-1])
