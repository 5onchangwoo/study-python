# 문제: https://www.acmicpc.net/problem/1010
# 블로그: https://teching.tistory.com/
import sys
import math
t = int(sys.stdin.readline().rstrip())
for _ in range(t):
    n, m = map(int,sys.stdin.readline().split())
    print(math.comb(m,n))
