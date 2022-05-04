# 문제: https://www.acmicpc.net/problem/11279
# 블로그: https://teching.tistory.com/
import heapq
import sys
n = int(sys.stdin.readline().rstrip())
h = []
for _ in range(n):
    input = -1 * int(sys.stdin.readline().rstrip())
    if input == 0:
        if h:
            print(-1 * heapq.heappop(h))
        else:
            print(0)
    else:
        heapq.heappush(h, input)




