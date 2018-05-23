<h1 align="center">Fundamentals</h1>

<div
align="center">
:nut_and_bolt::nut_and_bolt::nut_and_bolt:
</div>

<div align="center">
	<strong>Everything you wish the interviewer ignored</strong><br>
	My implementations of various fundamental Data Structures and Algorithms
</div>



## Table of Contents
- [Philosophy](#philosophy)
- [Data Structures](#data-structures)

## Philosophy
Towards the end of my very first technical interview two years ago,
I was asked about Binary Search Trees. I had been getting by the
entire interview by rattling off standard textbook answers about
everything. But when I was asked to actually implement a very
basic and essential data structure, I fumbled hard. And it was
_embarrasing_.

Since then I have become a firm believer in the idea that, if
you truly want to understand something you must take it apart
and put it back together. What I have tried to do with this
project is to create a comprehensive collection of Computer
Science fundamentals. My ultimate goal is to have everything
from ArrayLists to Zippers implemented in here. Hopefully, at
the end of it, the nuts and bolts will be second nature.

This is certainly a personal project, but the code is open
and I encourage you to take a look and assess my implementations.
If you feel I could improve something somewhere, please let me
know!

**_Noah Naiman, 2018_**

## Data Structures

### Nodes

#### A Note on Nodes
For this project I chose to abstract each type of Node into its
own seperate class and file. Each Node type inherits from the superclass Node.
I chose to write each Node seperately instead of built directly into
larger structures for two main reasons:

1. It makes reading my work less cluttered.
2. As this was a project to deeply learn fundamentals, I wanted to make strong distinctions
between each Node type.

#### Node
A basic Node class to hold generic comparable Data.<br>
Included methods are:
* Unparameterized constructor
* Parameterized constructor to set data


**Quick Link:** https://github.com/NoahNaiman/Fundamentals/blob/master/Data_Structures/Node.java
#### Singly Linked Node
A Node class to hold generic comparable data, and a pointer another node. A building block for a singly linked list.<br>
Included methods are:
* Unparameterized constructor
* Parameterized constructor to set data
* Parameterized constructor to set data and next node.


**Quick Link:** https://github.com/NoahNaiman/Fundamentals/blob/master/Data_Structures/SinglyLinkedListNode.java
#### Binary Tree Node
A Node class to hold generic comparable data, and three points: two to child nodes and one to a parent node. A building block for binary trees.<br>
Included methods are:
* Unparameterized constructor
* Parameterized constructor to set data


**Quick Link:** https://github.com/NoahNaiman/Fundamentals/blob/master/Data_Structures/BinaryTreeNodeNode.java

### Lists

#### Singly Linked List
A list in which each node contains data and a pointer to the next node.<br>
Included methods are:
* Get length
* Prepend to list
* Append to list
* Check if something is in the list
* Delete the first found instance of some given data
* Delete all instances of some given data
* Clone list
* Get a reversed version of the list
* Print out list

**Quick Link:** https://github.com/NoahNaiman/Fundamentals/blob/master/Data_Structures/SinglyLinkedList.java
