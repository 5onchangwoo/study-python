# 문제 : https://www.acmicpc.net/problem/1463
# 해설 : https://teching.tistory.com/98
num = int(input())
#배열은은 0부터 시작
memo = {}
def f(n):
    if n <= 1:
        return 0
    if not n in memo:
        memo[n] = min(f(n//2)+n%2, f(n//3)+n%3)+1
    return memo[n]
print(f(num))