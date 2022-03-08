# 문제: https://www.acmicpc.net/problem/12865
# 해설: https://teching.tistory.com/
import sys

n, k = map(int,sys.stdin.readline().split())
bag = [[0]*(k+1) for _ in range(n+1)]

for i in range(1,n+1):
    w, v = map(int,sys.stdin.readline().split())
    for j in range(1,k+1):
        bag[i][j] = max(bag[i-1][j], bag[i][j-1])
        if j >= w:
            bag[i][j] = max(bag[i][j], bag[i-1][j-w]+v)

print(max(bag[-1]))
