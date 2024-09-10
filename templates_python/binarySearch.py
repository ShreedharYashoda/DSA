def binarySearch(nums: List[int], target: int) -> int:
	l, r = 0, len(nums)
	while l < r:
		m = (l+r) // 2
		if(nums[m] < target):
			l = m + 1
		else:
			r = m
	return l

if __name__ == '__main__':
	arr = [1, 2, 3, 3, 3, 6, 9]
	print(binarySearch(arr, 3))
		