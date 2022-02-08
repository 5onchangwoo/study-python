# 문제 : https://programmers.co.kr/learn/courses/30/lessons/60057
# 해설 : https://teching.tistory.com/92
def solution(s):
    sLen = len(s)
    answer = sLen
    for sliceSize in range(1,sLen//2+1):
        tmp = 0
        cnt = 1
        for i in range(0,sLen,sliceSize):
            str1 = s[i:i+sliceSize]
            str2 = s[i+sliceSize:i+2*sliceSize]
            if str1 == str2:
                cnt +=1
            else:
                if cnt > 1:
                    tmp += len(str(cnt))
                tmp += sliceSize
                cnt = 1
            if i ==  sliceSize*(sLen//sliceSize):
                if str1 == str2:
                    tmp += len(str(cnt))+sliceSize
                else:
                    tmp += len(str2)
            answer = min(answer,tmp)
    return answer