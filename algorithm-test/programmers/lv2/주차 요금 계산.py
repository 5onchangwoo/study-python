# 문제: https://programmers.co.kr/learn/courses/30/lessons/92341
# 블로그: https://teching.tistory.com/
def feeCalc(useTime, fees):
    if useTime <= fees[0]:
        return fees[1]
    else:
        return fees[1] - ((fees[0]-useTime)//fees[2])*fees[3]

def solution(fees, records):
    inParking = {}
    usedList = {}
    for record in records:
        time, number, flag = map(str, record.split())
        hh, mm = map(int, time.split(':'))
        time = hh*60 + mm
        if flag == "IN":
            inParking[number] = time
        else:
            useTime = time - inParking[number]
            if number in usedList:
                usedList[number] += useTime
            else:
                usedList[number] = useTime
            inParking.pop(number)
    #59분 출차
    time = 23*60 + 59
    for number in inParking:
        useTime = time - inParking[number]
        if number in usedList:
            usedList[number] += useTime
        else:
            usedList[number] = useTime
    answer = []
    for number in sorted(usedList.keys()):
        answer.append(feeCalc(usedList[number], fees))
    return answer

print("#1", solution([180, 5000, 10, 600], ["05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"]), [14600, 34400, 5000])
print("#2", solution([120, 0, 60, 591], ["16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN"]), [0, 591])
print("#3", solution([1, 461, 1, 10], ["00:00 1234 IN"]), [14841])