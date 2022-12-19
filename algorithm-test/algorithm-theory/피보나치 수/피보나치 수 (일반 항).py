def past_pow(a, b):
    if b == 0:
        return 1
    elif b == 1:
        return a
    else:
        div_con = past_pow(a, b // 2)
        if b % 2 == 0:
            return div_con * div_con
        else:
            return div_con * div_con * past_pow(a, 1)


def fibonacci_gen(n):
    root_5 = 5 ** .5
    alpha = (1 + root_5) / 2
    beta = (1 - root_5) / 2
    return int((1 / root_5) * (past_pow(alpha, n) - past_pow(beta, n)))


print(fibonacci_gen(0))
