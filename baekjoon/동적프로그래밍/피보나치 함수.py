import sys

n = int(sys.stdin.readline().rstrip())
cntFibo = [[1,0], [0,1]]
cntFibo += [[0,0]] *39
def fibonacci(n):
    if cntFibo[n] != [0,0]:
        return cntFibo[n]
    tmp1 = fibonacci(n-1)
    tmp2 = fibonacci(n-2)
    cntFibo[n] = [x+y for x,y in zip(tmp1, tmp2)]
    return cntFibo[n]

num = []
for i in range(n):
    num = int(sys.stdin.readline().rstrip())
    fibonacci(num)
    print(*cntFibo[num])