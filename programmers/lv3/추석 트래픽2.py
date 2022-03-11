def solution(lines):
    traffic = []
    for line in lines:
        day, sec, worktime = map(str,line.split())
        tmp = list(map(float,sec.split(":")))
        workEnd = (tmp[0]*3600)+(tmp[1]*60)+tmp[2]
        workStart = workEnd - (float(worktime[:-1]))+0.001
        traffic.append([workStart, workEnd])
    answer = 0
    print(traffic)
    for i in traffic:
        bandS = i[1]
        bandE = round(i[1]+0.999,3)
        cnt = 0
        print(bandS,bandE)
        for work in traffic:
            if bandE >= work[0]:
                if bandS <= work[1]:
                    cnt += 1
        answer = max(cnt, answer)
    return answer



lines1 = [
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
]
lines2 = [
    "2016-09-15 00:00:00.000 2.3s",
    "2016-09-15 23:59:59.999 0.1s"
]
lines3 = [
    "2016-09-15 01:00:04.002 2.0s",
    "2016-09-15 01:00:07.000 2s"
]
print(solution(lines3))