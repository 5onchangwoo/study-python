#https://teching.tistory.com/57문제풀이
import sys,math
A,B,V = map(int,sys.stdin.readline().split())
print(math.ceil((V-A)/(A-B)) + 1)
