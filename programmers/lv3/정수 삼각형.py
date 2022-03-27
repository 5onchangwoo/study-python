# 문제: https://programmers.co.kr/learn/courses/30/lessons/43105
# 블로그: https://teching.tistory.com/

def solution(triangle):
    cache = {}
    high = len(triangle)
    cache[0] = triangle[0]
    for i in range(1, high):
        cache[i] = []
        # 가장 왼쪽 요소
        cache[i].append(cache[i-1][0]+triangle[i][0])
        # 가운데 값
        for j in range(1,len(triangle[i])-1):
            cache[i].append(max(cache[i-1][j-1]+triangle[i][j], cache[i-1][j]+triangle[i][j]))
        # 가장 오른쪽 요소
        cache[i].append(cache[i-1][-1]+triangle[i][-1])
    return max(cache[high-1])


###TEST###
print(solution([[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]), 30)
