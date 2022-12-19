# 문제: https://www.acmicpc.net/problem/92335
# 블로그: https://teching.tistory.com/

def base(n, k):
    res = ''
    while n >= 1:
        n, r = divmod(n, k)
        res = str(r) + res
    return res

def isPrime(n):
    if n < 2: return False
    for i in range(2,int(n**.5)+1):
        if n%i == 0: return False
    return True

def solution(n, k):
    base_k = base(n, k)
    split_zero = list(map(lambda x: int(x) if x != '' else 0, base_k.split('0')))
    max_num = max(split_zero)
    cnt = 0
    for i in split_zero:
        if isPrime(i):
            cnt += 1
    return cnt


print(solution(437674, 3), 3)
print(solution(110011, 10), 2)
print(solution(9, 3), 0)
print(solution(101, 110))
print(solution(999999, 3))
print(solution(10100010, 3))
print(solution(1_000_000, 10))
print(solution(990_999, 10))
print(solution(524287,2))

