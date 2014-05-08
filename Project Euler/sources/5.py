def prim():
    n = 2
    while 1:
        flag = 1
        for i in range(2,n):
            if n % i == 0:
                flag = 0
                break
        if flag:
            yield n
        n += 1
        
p = prim()
m = 20
l = []
for n in range(1,m+1):
    l.append(n)
r = []

for n in p:
    flag = True
    while flag:
        flag = False
        for i in range(0,m):
            if l[i] % n == 0:
                flag = True
                l[i] /= n
        if flag:
            r.append(n)
            
    if l.count(1) == m: break

z = 1

for x in r:
    z *= x 
print(z)
