# 문제: https://www.acmicpc.net/problem/1676
# 블로그: https://teching.tistory.com/

n = int(input())
cnt = 0
f = 5
while f <= n:
    cnt += n//f
    f *= 5

print(cnt)

