# 문제: https://www.acmicpc.net/problem/5430
# 블로그: https://teching.tistory.com/
from collections import deque
import sys

t = int(sys.stdin.readline().rstrip())
for _ in range(t):
    ops = sys.stdin.readline().rstrip()
    sys.stdin.readline()
    # 큐 변환
    nums = sys.stdin.readline()[1:-2]
    reverse = -1
    if nums == '':
        que = deque()
    else:
        que = deque(nums.split(','))
    # 명령어 처리
    for op in ops:
        if op == 'R':
            reverse *= -1
        elif op == 'D':
            if que:
                if reverse == 1:
                    que.pop()
                else:
                    que.popleft()
            else:
                print('error')
                break
    # 출력
    else:
        if reverse == 1:
            que.reverse()
        print("[" + ",".join(que) + "]")
