# 문제: https://programmers.co.kr/learn/courses/30/lessons/77485
# 블로그: https://teching.tistory.com/
def solution(rows, columns, queries):
    answer = []
    pro = [[i+(j*columns) for i in range(1,columns+1)] for j in range(rows)]
    for q in queries:
        new = [i.copy() for i in pro]
        tmpList =[]
        #위 테두리
        for i in range(q[1],q[3]):
            new[q[0]-1][i] = pro[q[0]-1][i-1]
            tmpList.append(pro[q[0]-1][i-1])
        #오른쪽 테두리
        for i in range(q[0],q[2]):
            new[i][q[3]-1] = pro[i-1][q[3]-1]
            tmpList.append(pro[i-1][q[3]-1])
        #아래 테두리
        for i in range(q[3]-2,q[1]-2,-1):
            new[q[2]-1][i] = pro[q[2]-1][i+1]
            tmpList.append(pro[q[2]-1][i+1])
        #왼쪽 테두리
        for i in range(q[2]-2,q[0]-2,-1):
            new[i][q[1]-1] = pro[i+1][q[1]-1]
            tmpList.append(pro[i+1][q[1]-1])
        pro = new
        answer.append(min(tmpList))
    return answer
#테스트
testCases = [
    #rows, columns, queries, result
    [6, 6, [[2,2,5,4],[3,3,6,6],[5,1,6,3]], [8, 10, 25]]
]

for tc in testCases:
    res = solution(tc[0], tc[1], tc[2])