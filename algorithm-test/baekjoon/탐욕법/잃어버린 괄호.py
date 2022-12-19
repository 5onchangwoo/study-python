# 문제: https://www.acmicpc.net/problem/1541
# 해설: https://teching.tistory.com/

line = input().split('-')
# answer = sum(map(int,line[0].split('+')))
# for i in range(1,len(line)):
#     answer -= sum(map(int,line[i].split('+')))
tmp = [sum(map(int, line[i].split('+'))) for i in range(len(line))]
answer = tmp[0] - sum(tmp[1:])
print(answer)
