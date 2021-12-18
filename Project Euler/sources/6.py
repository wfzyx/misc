v = []
for n in range(1, 100 + 1):
    v.append(n)

sq = 0
qs = 0
for n in v:
    qs += n
    sq += n ** 2

qs **= 2

print(qs - sq)
