# https://teching.tistory.com/
import sys, itertools

n = int(sys.stdin.readline().rstrip())
stat = dict()
for i in range(n):
    stat[i] = list(map(int,sys.stdin.readline().split()))
team1 = set(itertools.combinations(stat.keys(),n//2))
answer = 20000
for t1 in team1:
    t2 = set(stat.keys()) - set(t1)
    s1 =0
    s2 =0
    for p in t1:
        for i in t1:
            s1 += stat[p][i]
    for p in t2:
        for i in t2:
            s2 += stat[p][i]
    answer = min(answer, abs(s1-s2))
print(answer)