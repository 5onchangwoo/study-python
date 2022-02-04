# https://teching.tistory.com/
n = int(input())
cnt = 0
def nQueen(placed):
    global n, cnt
    row = len(placed)
    if row == n:
        cnt += 1
    else:
        #해당 열에서 퀸을 둘 수 있는 곳을 찾기.
        can = [1 for i in range(n)]
        for i in range(row):
            can[placed[i]] = 0
            #대각선
            if placed[i]+(row-i) < n :
                can[placed[i]+(row-i)] = 0
            if placed[i]-(row-i) >= 0 :
                can[placed[i]-(row-i)] = 0
        #다음 체스말 두기
        for i in range(n):
            if can[i]:
                placed.append(i)
                nQueen(placed)
                placed.pop()

nQueen([])
print(cnt)