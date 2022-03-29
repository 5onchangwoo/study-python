# 문제: https://www.acmicpc.net/problem/1780
# 블로그: https://teching.tistory.com/
import sys
cnt = {
    -1 : 0,
    0 : 0,
    1 : 0
}
def check(x, y, n, paper):
    if n == 1 :
        return True
    plag = paper[y][x]
    for i in range(y,y+n):
        for j in range(x, x+n):
            if plag != paper[i][j]:
                return False
    return True

def paper_split(x, y, n, paper):
    global cnt
    if check(x, y, n, paper):
        cnt[paper[y][x]] += 1
        return
    paper_split(x, y, n//3, paper)
    paper_split(x+n//3, y, n//3, paper)
    paper_split(x+(n*2//3), y, n//3, paper)
    paper_split(x, y+n//3, n//3, paper)
    paper_split(x+n//3, y+n//3, n//3, paper)
    paper_split(x+(n*2//3), y+n//3, n//3, paper)
    paper_split(x, y+n*2//3, n//3, paper)
    paper_split(x+n//3, y+n*2//3, n//3, paper)
    paper_split(x+(n*2//3), y+n*2//3, n//3, paper)

n = int(sys.stdin.readline().rstrip())
inPaper = []
for _ in range(n):
    inPaper.append(list(map(int,sys.stdin.readline().split())))
paper_split(0, 0, n, inPaper)
for key in cnt:
    print(cnt[key])

