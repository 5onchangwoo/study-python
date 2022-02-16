#문제 : https://www.acmicpc.net/problem/11054
#해설 : https://teching.tistory.com/104
import sys

n = int(sys.stdin.readline().strip())
nums = list(map(int, sys.stdin.readline().split()))

cache1 = [0] * n
cache2 = [0] * n
answer = [0] * n
for i in range(n):
    for j in range(i):
        if nums[i] > nums[j]:
            if cache1[i] < cache1[j]:
                cache1[i] = cache1[j]
    cache1[i] += 1
for i in range(n-1, -1, -1):
    for j in range(i+1, n):
        if nums[i] > nums[j]:
            if cache2[i] < cache2[j]:
                cache2[i] = cache2[j]
    cache2[i] += 1
    answer[i] = cache1[i]+cache2[i] - 1
print(max(answer))