def knapsack(capacity, weights, values, items):
	#Construct tabulation array of [items+1][capacity+1]
	tab = [[0 for x in range(capacity+1)] for x in range(items+1)]

	#Calculate each possible subtree value
	for i in range(items+1):
		for w in range(capacity+1):
			if(i == 0 or w == 0): #If no items or no capacity remain
				tab[i][w] = 0
			elif(weights[i-1] <= w): #If weight of current item is less than remaining capacity
				#Check if added value is more than previous option
				tab[i][w] = max(values[i-1] + tab[i-1][w-weights[i-1]], tab[i-1][w])
			else: #If we cannot take new item, use last valid option
				tab[i][w] = tab[i-1][w]

	return tab[items][capacity]

if __name__ == '__main__':
	values = [60, 100, 120]
	weights = [10, 20, 30]
	capacity = 50
	items = 3

	print("Items:", items)
	print("Knapsack capacity is:", capacity)
	print("Values are:", values)
	print("Weights are:", weights)
	print("Maximum possible value is:", knapsack(capacity, weights, values, items))
