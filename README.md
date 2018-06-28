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
I was asked about Binary Search Trees. Up until that point 
I had been getting by through rattling off standard textbook
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

# Algorithms

## Dynamic Programming

### The coin change problem
Imagine you are have a set of coins, each with a different value. Now, given an infinite number of each
coin, you must make change for some number of cents, n.

This problem can be solved using tabulation, or 'bottom up' dynamic programming. To solve it, we create
a table of length n+1, as we will need to tabulate results starting from zero and including n. We set
our base case, table[0], to be one as there is only one way to make change for it. From here, we simply pick
up each coin, then see how many ways we can make change with it for each value between itself and n. As we go,
we update the precomputed values in our table. This prevents the need for overlapping subproblems. This process
is depicted below:
```python
for i in range(len(coins)):
	for j in range(coins[i], n+1):
		tab[j] += tab[j-coins[i]]
```
Time complexity: O(len(coins)*n)
