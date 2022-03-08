# https://teching.tistory.com/
import sys
# 계수정렬
countingNum = [0] * 10001
for _ in range(int(sys.stdin.readline().rstrip())):
    countingNum[int(sys.stdin.readline().rstrip())] += 1
for i in range(10001):
    for _ in range(countingNum[i]):
        print(i)