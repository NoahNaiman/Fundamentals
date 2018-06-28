def make_change(coins, n):

	#Initialize empty table to keep track of results
	tab = [0 for x in range(n+1)]

	#Base case
	tab[0] = 1

	#Check coins one at a time
	for i in range(len(coins)):
		#Update table values equal to or after coin value
		for j in range(coins[i], n+1):
			tab[j] += tab[j-coins[i]]

	#Return final answer
	return tab[n]

if __name__ == '__main__':
	#Run tests
	vals = []
	while(True):
		print('Enter 0 to exit.')
		nextVal = eval(input('Please enter a coin value: '))
		if nextVal == 0:
			break
		else:
			vals += [nextVal]
	change = eval(input('Enter a value to make change for: '))
	ways = make_change(vals, change)
	stringCoins = ' '.join(str(x) for x in vals)
	print("There are " + str(ways) + " ways to make change for " + str(change) + "cents with coins " + stringCoins)