#문제: https://programmers.co.kr/learn/courses/30/lessons/42586
#블로그: https://teching.tistory.com/
def solution(progresses, speeds):
    answer = []
    day = 1
    progresses.reverse()
    speeds.reverse()
    while progresses:
        cnt = 0
        while progresses and (progresses[-1]+speeds[-1]*day) >= 100:
            progresses.pop()
            speeds.pop()
            cnt += 1
        if cnt > 0:
            answer.append(cnt)
        day += 1
    return answer


#테스트를 위한 코드
testCases = [[[93, 30, 55],[1, 30, 5], [2, 1]],
            [[95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1], [1, 3, 2]]
            ]

for tc in testCases:
    res = solution(tc[0], tc[1])
    print(res == tc[2], res)

