# 문제: https://programmers.co.kr/learn/courses/30/lessons/43162

def dfs(node, n,  edge, visited):
    visited[node] = True
    for i in range(n):
        if edge[node][i]:
            if not visited[i]:
                dfs(i, n, edge, visited)

def solution(n, computers):
    answer = 0
    visited = [False] * n
    for i in range(n):
        if not visited[i]:
            dfs(i, n, computers, visited)
            answer += 1
    return answer




###TEST###
print(solution(3, [[1, 1, 0], [1, 1, 0], [0, 0, 1]]), 2)
print(solution(3, [[1, 1, 0], [1, 1, 1], [0, 1, 1]]), 1)
print(solution(4, [[1, 1, 0, 1], [1, 1, 0, 0], [0, 0, 1, 1], [1, 0, 1, 1]]), 1 )
print(solution(3, [[1, 1, 0], [1, 1, 0], [0, 0, 1]]), 2)
print(solution(3, [[1, 1, 0], [1, 1, 1], [0, 1, 1]]), 1)
print(solution(3, [[1, 0, 1], [0, 1, 0], [1, 0, 1]]), 2)
print(solution(4, [[1, 1, 0, 1], [1, 1, 0, 0], [0, 0, 1, 1], [1, 0, 1, 1]]), 1)
print(solution(4, [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]]), 4)