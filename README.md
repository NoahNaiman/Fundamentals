<h1 align="center">Fundamentals</h1>

<div
align="center">
:nut_and_bolt::nut_and_bolt::nut_and_bolt:
</div>

<div align="center">
	<strong>Everything you wish the interviewer ignored</strong><br>
	My implementations of various fundamental Data Structures and Algorithms
</div>



# Table of Contents
- [Philosophy](#philosophy)
- [Data Structures](#data-structures)
- [Algorithms](#algorithms)

# Philosophy
Towards the end of my very first technical interview two years ago,
I was asked about Hashtables. Up until that point I had been getting
through interviews and classes by  rattling off standard textbook
answers about everything. But when I was asked to actually implement a very
basic and essential data structure, I fumbled hard. And it was
_embarrasing_.

Since then I have become a firm believer in the idea that if
you truly want to understand something you must take it apart
and put it back together. What I have tried to do with this
project is to create a comprehensive collection of Computer
Science fundamentals. Hopefully, at the end of it, the nuts
and bolts will be second nature.

This is certainly a personal project, but the code is open
and I encourage you to take a look and assess my implementations.
If you feel I could improve something somewhere, please let me
know!

**_Noah Naiman, 2018_**

# Data Structures

## Graphs

### General Graph
A list of nodes wherein each node maps to a set of all other nodes it is connected to.<br>
Included methods are:
* Add node
* Add edge
* Delete node
* Delete edge
* Breadth first search


_Quick Link:_ https://github.com/NoahNaiman/Fundamentals/blob/master/Data_Structures/Graph.java

## Lists

### Singly Linked List
A list in which each node contains data and a pointer to the next node.<br>
Included methods are:
* Get length
* Prepend
* Append
* Search
* Delete first found instance of given data
* Delete all instances of given data
* Clone list
* Get a reversed version of the list
* Check for a loop
* Unloop
* Print out list


_Quick Link:_ https://github.com/NoahNaiman/Fundamentals/blob/master/Data_Structures/SinglyLinkedList.java

## Nodes

### _A Note on Nodes_
For this project I chose to abstract each type of Node into its
own seperate class and file. Each Node type inherits from the superclass Node.
I chose to write each Node seperately instead of built directly into
larger structures for two main reasons:

1. It makes reading my work less cluttered.
2. As this was a project to deeply learn fundamentals, I wanted to make strong distinctions
between each Node type.

### Binary Tree Node
A Node class to hold generic comparable data, and two pointers: a left and right child node.<br>
A building block for binary trees.<br>
Included methods are:
* Unparameterized constructor
* Parameterized constructor to set data


_Quick Link:_ https://github.com/NoahNaiman/Fundamentals/blob/master/Data_Structures/BinaryTreeNodeNode.java

### Node
A basic Node class to hold generic comparable Data.<br>
Included methods are:
* Unparameterized constructor
* Parameterized constructor to set data


_Quick Link:_ https://github.com/NoahNaiman/Fundamentals/blob/master/Data_Structures/Node.java

### Singly Linked Node
A Node class to hold generic comparable data, and a pointer another node.<br>
A building block for a singly linked list.<br>
Included methods are:
* Unparameterized constructor
* Parameterized constructor to set data
* Parameterized constructor to set data and next node.


_Quick Link:_ https://github.com/NoahNaiman/Fundamentals/blob/master/Data_Structures/SinglyLinkedListNode.java


## Trees

### Binary Search Tree
A tree where each node has at most two children: left and right.<br>
All left children's data will be comparably less than their parent's.<br>
All right children's data will be comparably greater than their parent's.<br>
Included methods are:
* Insert
* Search
* Delete first found instance of given data
* Get height
* Traverse in pre-order: parent, left child, right child.
* Traverse in order: left child, parent, right child.
* Traverse in post-order: left child, right child, parent.
* Traverse in level order.


_Quick Link:_ https://github.com/NoahNaiman/Fundamentals/blob/master/Data_Structures/BinarySearchTree.java

# Algorithms

## Dynamic Programming

### Kadane's Algorithm
Given an array of size n containing only positive and negative integers, find the maximum continuous
subarray sum. For example, given array [1, -5, 3, -4, -7], the maximum continuous subarray sum would
be 4.

To solve this problem we use tabulation or 'bottom up' dynamic programming. First we set both the current
and the global maximums to array[0]. We then simply walk through each following element. At each step we
perform the following comparison: if the current element is greater than itself plus the current maximum
sum, then it is the new current maximum. Otherwise it is added to the current maximum. We then compare this
to the global maximum. If it is larger, we modify the global maximum. This comparison is depicted below:
```python
currentMax = max(i, currentMax+i)
globalMax = max(globalMax, currentMax)
```

Time complexity: O(len(array))

_Quick Link:_ https://github.com/NoahNaiman/Fundamentals/blob/master/Algorithms/Kadane.py

### Knapsack
Given a container with capacity C, and a set of n items each with its own corresponding weight and value,
determine the maximum possible value that can be put into the container without exceeding capacity. This
problem comes in two flavors: zero-one, and unbounded.

#### zero-one knapsack
The key to solving this problem is transforming the problem subtree into a tabulation array. We generalize
the function call to knapsack(capacity, items). So each sub-problem would be knapsack(items-1, capacity)
if we did not take the item, knapsack(items-1, capacity-1) if we did. From this generalization it is easy
to see how we would recalculate problems many times with a naive recursive solution. In order to prevent
this we can simply tabulate using an array with capacity rows and items columns: tab[items][capacity].
We can simply loop through each possibility and see if picking up the new item adds value without
exceeding our capacity. This process is depicted below:
```python
	i = remainingItems
	w = remainingWeight
	if(i == 0 or w == 0):
		tab[i][w] = 0
	elif(weights[i-1] <= w):
		tab[i][w] = max(values[i-1] + tab[i-1][w-weights[i-1]], tab[i-1][w])
	else:
		tab[i][w] = tab[i-1][w]
```

Time complexity: O(items * capacity)

_Quick Link:_
https://github.com/NoahNaiman/Fundamentals/blob/master/Algorithms/ZeroOneKnapsack.py


### The coin change problem
Imagine you are have a set of coins, each with a different value. Now, given an infinite number of each
coin, you must make change for some number of cents, n.

This problem can be solved using tabulation, or 'bottom up' dynamic programming. To solve it, we create
a table of length n+1, as we will need to tabulate results starting from zero and including n. We set
our base case, table[0], to be 1 as there is only one way to make change for it. From here, we simply pick
up each coin, then see how many ways we can make change with it for each value between itself and n. As we go,
we update the precomputed values in our table. This prevents the need for overlapping subproblems. This process
is depicted below:
```python
for i in range(len(coins)):
	for j in range(coins[i], n+1):
		tab[j] += tab[j-coins[i]]
```
Time complexity: O(len(coins) * n)

_Quick Link:_ https://github.com/NoahNaiman/Fundamentals/blob/master/Algorithms/CoinChange.py
