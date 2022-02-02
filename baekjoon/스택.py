# https://teching.tistory.com/
#문제 : https://www.acmicpc.net/problem/10828
import sys

stack = []
for _ in range(int(sys.stdin.readline().rstrip())):
    line = sys.stdin.readline().split()
    if "push" in line:
        stack.append(line[1])
    elif "pop" in line:
        if stack == []: print(-1)
        else: print(stack.pop())
    elif "size" in line:
        print(len(stack))
    elif "empty" in line:
        if stack == []: print(1)
        else : print(0)
    elif "top" in line:
        if stack == []: print(-1)
        else : print(stack[-1])