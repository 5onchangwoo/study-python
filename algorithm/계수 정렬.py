#https://teching.tistory.com/80
def countingSort(list):
    k = max(list)
    cntNum = [0] * (k+1)
    for n in list :
        cntNum[n] += 1
    new = []
    for i in range(len(cntNum)):
        new += [i]*cntNum[i]
    return new

nums = [4, 3, 2, 3, 0, 1, 2, 5, 4, 1]
sortedNum = countingSort(nums)
print(sortedNum)