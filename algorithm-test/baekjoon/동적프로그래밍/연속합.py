# 문제: https://www.acmicpc.net/problem/1912
# 해설: https://teching.tistory.com/106
n = int(input())
nums = list(map(int, input().split()))
cache = [nums[0]] + [0] * (n - 1)
for i in range(1, n):
    if nums[i] < cache[i - 1] + nums[i]:
        cache[i] = cache[i - 1] + nums[i]
    else:
        cache[i] = nums[i]
print(max(cache))
