def solution(p):
    if p == '': return p
    balScore = 0
    isRight = True
    for i in range(len(p)):
        if p[i] == '(':
            balScore += 1
        else:
            balScore -= 1
        if balScore < 0:
            isRight = False
        if balScore == 0:
            if isRight:
                return p[:i+1] + solution(p[i+1:])
            else:
                return "(" + solution(p[i+1:]) + ")" + ''.join(list(map(lambda x: '(' if x == ')' else ')', p[1:i])))


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