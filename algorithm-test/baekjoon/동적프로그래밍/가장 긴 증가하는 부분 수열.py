#문제 : https://www.acmicpc.net/problem/11053
#해설 : https://teching.tistory.com/103
import sys
n = int(sys.stdin.readline().rstrip())
nums = list(map(int,sys.stdin.readline().split()))
lis = []
for i in range(len(nums)):
    for c in range(len(lis)):
        if lis[c] >= nums[i]:
            lis[c] = nums[i]
            break
    else:
        lis.append(nums[i])
print(len(lis))