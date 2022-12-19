#https://teching.tistory.com/
#https://www.acmicpc.net/problem/11651
import sys
dots = [tuple(map(int,sys.stdin.readline().split())) for _ in range(int(sys.stdin.readline().rstrip()))]
dots.sort(key= lambda x : (x[1], x[0]))
for i in dots:
    print(i[0], i[1])