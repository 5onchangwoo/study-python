def solution(n):
    answer = 0
    for i in range(1,n+1) :
        sum_n=0
        for j in range(i,n+1) : 숫자들의 합 구하기
            sum_n += j
            if sum_n == n : answer += 1 #만일 i~j까지의 합이 n과 같다면 1개 카운트
            elif sum_n>n : break  #연속된숫자들의 합이 n보다 커질경우 다음i로 넘김
    return answer
