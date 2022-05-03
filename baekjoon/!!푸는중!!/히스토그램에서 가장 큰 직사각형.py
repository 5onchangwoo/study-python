# 문제: https://www.acmicpc.net/problem/6549
# 블로그: https://teching.tistory.com/
# 분할 정복
import sys
def seg(list):
    n = len(list)
    min_high = min(list)
    area = min_high * n
    min_index = list.index(min_high)
    right, left = list[:min_index], list[min_index+1:]
    #좌
    right_area = min(right)*len(right)
    #우
    left_area = min(left)*len(left)

for read in sys.stdin:
    line = list(map(int, read.split()))
    if line == [0]:
        break
    n, histogram = line[0], line[1:]
    answer = 0




