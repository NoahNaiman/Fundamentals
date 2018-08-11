def kadane(arr):
	#Set original maximums as first element of arr
	currentMax = arr[0]
	globalMax = currentMax

	for i in arr[1:]:
		#Calculate if adding the next element increases max
		currentMax = max(i, currentMax+i)
		#Check if currentMax is larger than global
		globalMax = max(globalMax, currentMax)

	return(globalMax)


if __name__ == '__main__':
	print(kadane([-2, 1, -3, 4, -1, 2, 1, -5, 4]))
	vals = []
	print('Enter 999 to exit.')
	while(True):
		nextVal = eval(input('Enter a positive or negative value: '))
		if nextVal == 999:
			break
		else:
			vals += [nextVal]

	print("Finding maximum contiguous subarray for:", vals)
	print("Maximum subarray is:", kadane(vals))


