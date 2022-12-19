#문제: https://programmers.co.kr/learn/courses/30/lessons/42895
#블로그: https://teching.tistory.com/
def solution(N, number):
    cache = [set() for _ in range(10)]
    for i in range(1,10):
        cache[i].add(int(str(N)*(i)))
        for j in range(1,i//2+1):
            for c1 in cache[j]:
                for c2 in cache[i-j]:
                    cache[i].add(c2+c1)
                    cache[i].add(c2*c1)
                    if c2-c1 > 0:
                        cache[i].add(c2-c1)
                    if c1-c2 > 0:
                        cache[i].add(c1-c2)
                    if c2//c1 != 0:
                        cache[i].add(c2//c1)
                    if c1//c2 != 0:
                        cache[i].add(c1//c2)
        if number in cache[i]:
            return i
    return -1

#테스트
testCases = [
    # N, number,  return
    [5, 12, 4],
    [2, 11, 3],
    [5, 5, 1],
    [8, 5800, 8],
    [3, 4, 3],
    [1, 1121, 7],
    [3, 18, 3],
    [4, 17, 4],
    [5, 1010, 7],
    [5, 31168, -1],
    [8, 5800, 8],
    [5, 26, 4],
    [9, 10101, 8]
]

for tc in testCases:
    res = solution(tc[0],tc[1])
    print(tc[2] == res, res)