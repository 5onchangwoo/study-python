# https://teching.tistory.com/89
memo =[0]+[1]+[False for _ in range(99)]
def fib(n):
    #계산된적 없는 n일 경우 계산해준다.
    if not memo[n]:
        for i in range(2, n+1):
            memo[i] = memo[i-1]+memo[i-2]
    return memo[n]