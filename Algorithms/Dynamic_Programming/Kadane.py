def kadane(arr):
	#Set original maximums as first element of arr
	currentMax = arr[0]
	globalMax = currentMax

	for i in range(1, len(arr)):
		#Calculate if adding the next element increases max
		currentMax = max(currentMax, currentMax+arr[i])
		#Check if currentMax is larger than global
		if(currentMax > globalMax):
			globalMax = currentMax

	return(globalMax)


if __name__ == '__main__':
	vals = []
	while(True):
		print('Enter q to exit.')
		nextVal = eval(input('Enter a positive or negative value: '))
		if nextVal == 'q':
			break
		else:
			vals += [nextVal]

	print("Finding maximum contiguous subarray for:", vals)
	print("Maximum subarray is:", kadane(vals))


