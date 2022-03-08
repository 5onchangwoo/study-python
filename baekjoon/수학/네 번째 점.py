X=[];Y=[]
for i in range(3):
    x,y =map(int,input().split())
    if x in X : X.remove(x)
    else : X.append(x)
    if y in Y : Y.remove(y)
    else : Y.append(y)
print(*X,*Y)

#x,y점 각각 한개만 있는 점 출력
