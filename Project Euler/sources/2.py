def fib():
    x = 1
    y = 1
    z = x + y
    while not z > 4000000:
        yield z
        x = y + z
        y = z + x
        z = x + y


s = fib()
x = 0
for n in s:
    x += n

print(x)
