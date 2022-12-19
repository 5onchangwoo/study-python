def fibonacci_for(n):
    a, b = 0, 1
    for i in range(n):
        a, b = a + b, a
    return a


print(fibonacci_for(10))
