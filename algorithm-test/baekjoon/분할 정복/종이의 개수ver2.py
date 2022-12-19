# 문제: https://www.acmicpc.net/problem/1780
# 블로그: https://teching.tistory.com/
import sys

cnt = {
    -1: 0,
    0: 0,
    1: 0
}


def check(paper, n):
    if n == 1:
        return True
    plag = paper[0][0]
    for i in range(n):
        for j in range(n):
            if plag != paper[i][j]:
                return False
    return True


def paper_split(paper, n):
    if check(paper, n):
        cnt[paper[0][0]] += 1
        return
    splitPaper = [
        [], [], [],
        [], [], [],
        [], [], []
    ]
    for i in range(n):
        if i < n // 3:
            splitPaper[0].append(paper[i][:n // 3])
            splitPaper[1].append(paper[i][n // 3:n * 2 // 3])
            splitPaper[2].append(paper[i][n * 2 // 3:])
        elif n // 3 <= i and i < n * 2 // 3:
            splitPaper[3].append(paper[i][:n // 3])
            splitPaper[4].append(paper[i][n // 3:n * 2 // 3])
            splitPaper[5].append(paper[i][n * 2 // 3:])
        else:
            splitPaper[6].append(paper[i][:n // 3])
            splitPaper[7].append(paper[i][n // 3:n * 2 // 3])
            splitPaper[8].append(paper[i][n * 2 // 3:])
    for p in splitPaper:
        paper_split(p, n // 3)


n = int(sys.stdin.readline().rstrip())
inPaper = []
for _ in range(n):
    inPaper.append(list(map(int, sys.stdin.readline().split())))
paper_split(inPaper, n)
for key in cnt:
    print(cnt[key])
