# 문제: https://www.acmicpc.net/problem/1904
# 해설: https://teching.tistory.com/
n = int(input())
memo =[1]+[2]+[0 for i in range(n-1)]
def solve(n):
    if n >= 2:
        for i in range(2,n+1):
            memo[i] = (memo[i-1]+memo[i-2])%15746
    return memo[n]
print(solve(n-1))


#DP가 아니지만 더욱 간단하게 푸는 방법
# n = int(input())
# num1 = 1
# num2 = 1
# for i in range(n-1):
#     num1, num2 = num2, (num1+num2)
# print(num2)