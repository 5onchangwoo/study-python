# 문제: https://www.acmicpc.net/problem/1920
# 블로그: https://teching.tistory.com/
import sys


def find(a, list):
    left = 0
    right = len(list)
    while left < right:
        mid = (left + right) // 2
        if list[mid] > a:
            right = mid
        elif list[mid] < a:
            left = mid + 1
        else:
            return 1
    return 0


n = int(sys.stdin.readline().rstrip())
nums = list(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline().rstrip())
needs = list(map(int, sys.stdin.readline().split()))
nums.sort()

for i in needs:
    print(find(i,nums))