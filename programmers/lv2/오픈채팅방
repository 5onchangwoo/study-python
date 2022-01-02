def solution(record):
    user_cache = dict()
    print_log ={"Enter" : "님이 들어왔습니다.", "Leave" : "님이 나갔습니다."}
    answer = []
    for log in record :  #닉네임 변경
        tmp = log.split()
        if tmp[0] in {"Enter", "Change"} :
            user_cache[tmp[1]]= tmp[2]
    for log in record : #시스템 로그 출력
        tmp = log.split()
        if tmp[0] in list(print_log.keys()) :
            answer.append(user_cache[tmp[1]]+print_log[tmp[0]])
    return answer 
