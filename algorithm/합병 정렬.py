# https://teching.tistory.com/78
def mergeSort(nums):
    size = len(nums)
    if size == 1: return nums
    mid = size // 2
    left = mergeSort(nums[:mid])
    right = mergeSort(nums[mid:])
    new = [0] * size
    end = l = r = 0
    while len(left) > l and len(right) > r:
        if left[l] > right[r]:
            new[end] = right[r]
            r += 1
            end += 1
        else:
            new[end] = left[l]
            end += 1
            l += 1
    if len(left) > l: new[end:] = left[l:]
    if len(right) > r : new[end:] = right[r:]
    return new

nums = [38, 27, 43, 3, 9, 82, 10]
sortedNums = mergeSort(nums)
print(sortedNums)