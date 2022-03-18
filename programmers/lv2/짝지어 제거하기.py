# 문제: https://programmers.co.kr/learn/courses/30/lessons/12973
# 블로그: https://teching.tistory.com/

def solution(s):
    stack = []
    for i in s:
        if stack and stack[-1]==i:
            stack.pop()
        else:
            stack.append(i)

    answer = 0 if stack else 1
    return answer