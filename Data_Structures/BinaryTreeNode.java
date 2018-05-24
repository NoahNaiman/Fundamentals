/**
 * <h1>Binary Tree Node Class</h1>
 * A Node class used to construct a Binary tree.
 * Has two children nodes, right and left.
 *
 * @author Noah Naiman
 * @since 5-23-2018
 */

public class BinaryTreeNode<T extends Comparable<T>> {
	// **************************************************
    // Fields
    // **************************************************
    T data;
    BinaryTreeNode<T> right;
    BinaryTreeNode<T> left;

    // **************************************************
    // Constructors
    // **************************************************

    /**
    * Default constructor.<br>
    * Sets data, left, and right will be null.
    */
    public BinaryTreeNode(){
    	data = null;
    	right = null;
    	left = null;
    }

    /**
    * Parameterized constructor.<br>
    * Sets right, and left to null.<br>
    * @param initialData
    *	Sets data to initialData
    */
    public BinaryTreeNode(T initialData){
    	data = initialData;
    	right = null;
    	left = null;
    }
}