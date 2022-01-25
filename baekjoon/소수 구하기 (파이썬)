# https://teching.tistory.com/68 해설
m,n = map(int,input().split())
isPrime = [True for _ in range(n+1)]
isPrime[0]=isPrime[1]= False
for num in range(len(isPrime)) :
    if isPrime[num] :
        if m<=num and num<=n : print(num)
        for i in range(num*2,len(isPrime),num) :
            isPrime[i] = False
