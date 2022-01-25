# https://teching.tistory.com/69 해설
import sys
nums=[]
#입력
for line in sys.stdin:
    if int(line.rstrip()) == 0 : break
    nums.append(int(line.rstrip()))
#에라토스테네스 체
isPrime = [True if i>1 else False for i in range(max(nums)*2+1) ]
for i in range(len(isPrime)) :
    if isPrime[i] :
        for multiple in range(i*2,len(isPrime),i) :
            isPrime[multiple] = False
#출력
for num in nums :
    print(sum(isPrime[num+1:num*2+1]))
