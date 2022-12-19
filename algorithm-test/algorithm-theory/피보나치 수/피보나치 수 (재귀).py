def fibonacci_recu(n):
    if n <= 1:
        return n
    return fibonacci_recu(n - 1) + fibonacci_recu(n - 2)


print(fibonacci_recu(10))