cache = {
    0: 0,
    1: 1
}


def fibonacci_tabul(n):
    if n in cache:
        return cache[n]
    for i in range(2, n + 1):
        cache[i] = cache[i - 1] + cache[i - 2]
    return cache[n]


print(fibonacci_tabul(10))
