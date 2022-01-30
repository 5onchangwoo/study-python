# https://teching.tistory.com
def bubbleSort(list):
    for _ in range(len(list)):
        for i in range(len(list)-1):
            if list[i] > list[i+1] :
                tmp = list[i]
                list[i] = list[i+1]
                list[i+1] = tmp
    return list

nums =[5, 4, 3, 8, 9, 10, 2]
sortedNums = bubbleSort(nums)
print(sortedNums)