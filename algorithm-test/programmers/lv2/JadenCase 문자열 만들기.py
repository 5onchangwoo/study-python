def solution(s):
    first = True #단어의 첫문자여부
    answer = ""
    for i in (s) : #한글자씩 확인
        if i == " " : #공백이 있을경우 다음의 문자는 첫문자이므로 Ture
            first = True
            answer += " "
        else : #만약 첫문자(first가 True)라면 대문자를 그렇지 않다면 소문자를 삽입후
            if first : answer += i.upper()
            else : answer += i.lower()
            first = False            
    return answer
