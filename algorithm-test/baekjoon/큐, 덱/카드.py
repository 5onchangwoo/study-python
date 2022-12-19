# 문제: https://www.acmicpc.net/problem/2164
# 블로그: https://teching.tistory.com/
from collections import deque

card = deque([i for i in range(1,int(input())+1)])
while len(card)>1:
    card.popleft()
    card.append(card.popleft())
print(*card)






