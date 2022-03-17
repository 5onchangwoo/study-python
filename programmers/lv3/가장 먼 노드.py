# 문제: https://programmers.co.kr/learn/courses/30/lessons/49189
# 블로그: https://teching.tistory.com/
import heapq
from collections import deque

def solution(n, edge):
    graph = {i:[] for i in range(1,n+1)}
    for i in edge:
        heapq.heappush(graph[i[0]], i[1])
        heapq.heappush(graph[i[1]], i[0])
    dis = [int(1e9)] * (n+1)
    visited = [0] * (n+1)
    dis[1] = 0
    que = deque([1])
    while que:
        now = que.popleft()
        visited[now] = True
        for next in graph[now]:
            if  not visited[next]:
                que.append(next)
                if dis[next] > dis[now]+1:
                    dis[next] = dis[now]+1
    answer = dis[1:]
    max_dis = max(answer)
    return answer.count(max_dis)


#######################
########테스트##########
#######################
testCases = [
    #n, vertex, return
    [6, [[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]], 3]
]
for tc in testCases:
    res = solution(tc[0], tc[1])
    print(res, res==tc[2])

print(solution(6, [[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]), 3)
print(solution(4, [[1, 2], [2, 3], [3, 4]]), 1)
print(solution(2, [[1, 2]]), 1)
print(solution(5, [[4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]), 2)
print(solution(4, [[1, 2], [1, 3], [2, 3], [2, 4], [3, 4]]), 1)
print(solution(4, [[1, 4], [1, 3], [2, 3], [2, 1]]), 3)
print(solution(4, [[3, 4], [1, 3], [2, 3], [2, 1]]), 1)
print(solution(4, [[4, 3], [1, 3], [2, 3]]), 2)