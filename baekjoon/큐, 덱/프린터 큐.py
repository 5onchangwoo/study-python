# 문제: https://www.acmicpc.net/problem/
# 블로그: https://teching.tistory.com/
import sys
from collections import deque

t = int(sys.stdin.readline().rstrip())
for _ in range(t):
    n, m = map(int, sys.stdin.readline().split())
    priority = list(map(int, sys.stdin.readline().split()))
    printer = deque([i, j] for i, j in zip(range(n), reversed(priority)))
    cnt = 0
    while printer:
        print(printer)
        if printer[0][1] < priority[-1]:
            printer.rotate(-1)
        elif printer[0][1] == max(priority):
            cnt += 1
            tmp = printer.popleft()
            if m == tmp[1]:
                break
            priority.pop()

    print(cnt)
