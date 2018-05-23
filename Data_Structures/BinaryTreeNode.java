/**
 * <h1>Binary Tree Node Class</h1>
 * A Node class used to construct a Binary tree.
 * Has one parent and two children, right and left.
 *
 * @author Noah Naiman
 * @since 5-23-2018
 */

public class BinaryTreeNode<T extends Comparable<T>> {
	// **************************************************
    // Fields
    // **************************************************
    T data;
    BinaryTreeNode<T> parent;
    BinaryTreeNode<T> right;
    BinaryTreeNode<T> left;

    // **************************************************
    // Constructors
    // **************************************************

    /**
    * Default constructor.<br>
    * Sets data, parents, left, and right will be null.
    */
    public BinaryTreeNode(){
    	data = null;
    	parent = null;
    	right = null;
    	left = null;
    }

    /**
    * Parameterized constructor.<br>
    * Sets parents, right, and left to null.<br>
    * @param initialData
    *	Sets data to initialData
    */
    public BinaryTreeNode(T initialData){
    	data = initialData;
    	parent = null;
    	right = null;
    	left = null;
    }
}