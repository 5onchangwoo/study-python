# 문제: https://programmers.co.kr/learn/courses/30/lessons/42627
# 블로그: https://teching.tistory.com/
import heapq
from collections import deque


def solution(jobs):
    n = len(jobs)
    jobs = deque(sorted([[jobs[i][1],jobs[i][0]] for i in range(n)], key= lambda x: (x[1],x[0])))
    wait = []
    heapq.heappush(wait, jobs.popleft())
    time = wait[0][1]
    answer = 0
    while wait:
        now = heapq.heappop(wait)
        time += now[0]
        answer += time-now[1]
        while jobs and time >= jobs[0][1]:
            heapq.heappush(wait, jobs.popleft())
        if not wait and jobs:
            heapq.heappush(wait, jobs.popleft())
            time = wait[0][1]
    return answer//n

#테스트케이스
print(solution([[0, 3], [1, 9], [2, 6]]), 9)
print(solution([[0, 4], [0, 2], [3, 5], [2, 6]]), 7)
print(solution([[1, 3], [4, 3]]), 3)
print(solution([[0, 3], [1, 9], [2, 6]]), 9)
print(solution([[24, 10], [28, 39], [43, 20], [37, 5], [47, 22], [20, 47], [15, 34], [15, 2], [35, 43], [26, 1]]), 72)