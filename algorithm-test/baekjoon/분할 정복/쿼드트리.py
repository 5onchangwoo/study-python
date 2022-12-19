# 문제: https://www.acmicpc.net/problem/1992
# 블로그: https://teching.tistory.com/

import sys
res = ""
def makeConftti(list):
    global res
    tmp = 0
    for line in list:
        tmp += sum(line)
    n = len(list)
    if tmp == n*n:
        res += "1"
        return
    elif tmp == 0:
        res += "0"
        return
    #가로 세로 쪼개기
    res += "("
    splitPaper1 =[]
    splitPaper2 =[]
    splitPaper3 =[]
    splitPaper4 =[]
    for i in range(n):
        if i <= n//2 - 1 :
            splitPaper1.append(list[i][:n // 2])
            splitPaper2.append(list[i][n // 2:])
        if i > n//2 - 1:
            splitPaper3.append(list[i][:n // 2])
            splitPaper4.append(list[i][n // 2:])
    makeConftti(splitPaper1)
    makeConftti(splitPaper2)
    makeConftti(splitPaper3)
    makeConftti(splitPaper4)
    res += ")"

n = int(sys.stdin.readline().rstrip())
input = []
for _ in range(n):
    input.append([int(i) for i in sys.stdin.readline().rstrip()])
makeConftti(input)
print(res)