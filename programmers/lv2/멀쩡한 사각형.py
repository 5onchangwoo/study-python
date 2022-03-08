def gcd(w,h) :
    if w%h== 0 : return h
    return gcd(h,w%h)

def solution(w,h):
    answer = 0
    g=gcd(w,h)
    gw = int(w/g)
    gh = int(h/g)
    for i in range(min(gw,gh)) : 
        answer += int(max(gw,gh)/min(gw,gh) * i)
    answer *=g
    answer += (gw*gh) * (g*(g-1))/2
    return 2*answer
