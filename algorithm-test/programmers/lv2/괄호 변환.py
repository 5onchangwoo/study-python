# 문제: https://programmers.co.kr/learn/courses/30/lessons/60058
# 블로그: https://teching.tistory.com/
def isRight(p):
    score = 0
    res = True
    for i in p:
        if i == '(':
            score -= 1
        else:
            score += 1
        if score > 0:
            res = False
    if score == 0:
        return res
    else:
        return False


def splitPoint(p):
    score = 0
    for i in range(len(p)):
        if p[i] == "(":
            score += 1
        else:
            score -= 1
        if score == 0:
            return i + 1


def solution(p):
    if p == '': return p
    point = splitPoint(p)
    u = p[:point]
    v = p[point:]
    print("u = ", u, "v = ", v)
    if isRight(u):
        return u + solution(v)
    else:
        return "(" + solution(v) + ")" + ''.join(list(map(lambda x: '(' if x == ')' else ')', u[1:-1])))


print(solution("(()())()"), "(()())()")
print("###")
print(solution(")("), "()")
print("###")
print(solution("()))((()"), "()(())()")
print("###")
print(solution(""), "")
print("###")
print(solution(")))((("), "()(())")
print("###")
print(solution(")))(()(("), "()(())")
print("###")
print(solution(")("), "()")
