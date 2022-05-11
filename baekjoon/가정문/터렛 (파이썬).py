#https://teching.tistory.com/70 해설
import sys
for _ in range(int(sys.stdin.readline().rstrip())) :
    x1,y1,r1, x2,y2,r2 = map(int,sys.stdin.readline().split())
    d = (abs(x1-x2)**2 + abs(y1-y2)**2)**.5
    #동심원
    if d == 0 :
        #두 반지름이 같을 때 (교점은 무한대)
        if r1==r2 : print(-1)
        #두 반지름이 다를 떄 (만나지 않음)
        else : print(0)
    #동심원이 아닐 때
    else :
        sum = r1+r2
        dif = abs(r1-r2)
        #내부
        if d < dif : print(0)
        #내접
        elif d == dif : print(1)
        #두점에서 만나는 경우
        elif dif < d and d < sum : print(2)
        #외접
        elif d == sum : print(1)
        #외부
        else : print(0)



