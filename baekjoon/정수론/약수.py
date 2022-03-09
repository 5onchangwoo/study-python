# 문제: https://www.acmicpc.net/problem/1037
# 해설: https://teching.tistory.com/
input()
nums = sorted(list(map(int,input().split())))
print(nums[0]*nums[-1])