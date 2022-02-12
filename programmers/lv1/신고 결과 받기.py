# 문제 : https://programmers.co.kr/learn/courses/30/lessons/92334?language=python3
def solution(id_list, report, k):
    cache = {}
    mail = {}
    for id in id_list:
        cache[id] = []
        mail[id] = 0
    for r in set(report):
        reporter, reported = map(str,r.split())
        cache[reported].append(reporter)
    for i in cache:
        if len(cache[i]) >= k:
            for j in cache[i]:
                mail[j] += 1
    return list(mail.values())