# https://teching.tistory.com/72 해설
def star(n) :
    if n == 3 : return ["***", "* *", "***"]
    stamp = star(n//3)
    return [s*3 for s in stamp]+[s+' '*(n//3)+s for s in stamp]+[s*3 for s in stamp]
print('\n'.join(star(int(input()))))
