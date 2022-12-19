def gcd(n,m) : #유클리드 알고리즘
    if n%m ==0 : return m
    else : return gcd(m,n%m)
    
def solution(arr):
    answer = arr[0]
    for i in range(1,len(arr)) :
        answer = arr[i]*answer / gcd(max(arr[i],answer),min(arr[i],answer))
    return answer
