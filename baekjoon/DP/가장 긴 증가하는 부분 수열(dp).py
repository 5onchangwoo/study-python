#문제 : https://www.acmicpc.net/problem/11053
#해설 : https://teching.tistory.com/103
import sys
n = int(sys.stdin.readline().rstrip())
nums = list(map(int,sys.stdin.readline().split()))
caches = [1]*n
for i in range(n):
    for j in range(i):
        if nums[i] > nums[j]:
            caches[i] = max(caches[i], caches[j]+1)
print(max(caches))