#https://teching.tistory.com/
endNum = []
i = 0
n = int(input())
while len(endNum) < n:
    i += 1
    if '666' in str(i):
        endNum.append(i)
print(endNum[-1])

#단순하게 1부터 높여가며 숫자안에 666이 들어가있을 경우 배열에 추가.
# 배열안의 길이가 n개가되며 n번째 종말의 숫자