import datetime
def solution(lines):
    traffic = []
    for line in lines:
        l = line.split()
        end = datetime.datetime.strptime(l[0]+l[1], "%Y-%m-%d%H:%M:%S.%f")
        workTime = datetime.timedelta(seconds=float(l[2][:-1])-0.001)
        start = end-workTime
        traffic.append([start, end])
    answer = 0
    for i in traffic:
        tmp = 0
        bandStart = i[1]
        bandEnd = i[1]+datetime.timedelta(seconds=0.999)
        for work in traffic:
            if bandEnd >= work[0]:
                if bandStart <= work[1]:
                    tmp += 1
        answer = max(tmp, answer)
    return answer

#정답 확인용
testCase =[
    [
        "2016-09-15 01:00:04.001 2.0s",
        "2016-09-15 01:00:07.000 2s"
    ],[
        "2016-09-15 01:00:04.002 2.0s",
        "2016-09-15 01:00:07.000 2s"
    ],[
        "2016-09-15 20:59:57.421 0.351s",
        "2016-09-15 20:59:58.233 1.181s",
        "2016-09-15 20:59:58.299 0.8s",
        "2016-09-15 20:59:58.688 1.041s",
        "2016-09-15 20:59:59.591 1.412s",
        "2016-09-15 21:00:00.464 1.466s",
        "2016-09-15 21:00:00.741 1.581s",
        "2016-09-15 21:00:00.748 2.31s",
        "2016-09-15 21:00:00.966 0.381s",
        "2016-09-15 21:00:02.066 2.62s"
    ]]
answers = [1, 2, 7]

for case in range(len(testCase)):
    answer = solution(testCase[case])
    print(f"case {case+1} : 제출-{answer}, 정답-{answers[case]}")
