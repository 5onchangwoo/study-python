cache = {
    0: 0,
    1: 1
}
def fibonacci_memo(n):
    if n in cache:
        return cache[n]
    cache[n] = fibonacci_memo(n - 1) + fibonacci_memo(n - 2)
    return cache[n]


print(fibonacci_memo(10))
