# 문제: https://programmers.co.kr/learn/courses/30/lessons/43238
# 블로그: https://teching.tistory.com/112

def solution(n, times):
    left = min(times)
    right = max(times) * n
    answer = 0
    while left <= right:
        mid = (left + right) // 2
        print(left, right,mid)
        total = 0
        for i in times:
            total += mid // i
            if total >= n:
                right = mid - 1
                answer = mid
                break
        if total < n:
            left = mid + 1
    return answer


# 확인
testCases = [
    # n, times, return
    [6, [7, 10], 28]
]

for tc in testCases:
    res = solution(tc[0], tc[1])
    print(res, tc[2] == res)
