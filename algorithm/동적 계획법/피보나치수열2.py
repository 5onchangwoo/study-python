# https://teching.tistory.com/89
memo = [0]+[1]+[False for _ in range(99)]
def fib(n):
    #계산된적 없는 n일 경우 계산해준다.
    if not memo[n] and n >= 2:
        memo[n] = fib(n-1) + fib(n-2)
    return memo[n]