import java.util.Queue;
import java.util.LinkedList;

/**
 * <h1>Binary Search Tree Class</h1>
 * A tree where each node has two children, right and left.
 * All left children are less than parent node,
 * all right children are greater.
 *
 * @author Noah Naiman
 * @since 5-23-2018
 */

public class BinarySearchTree<T extends Comparable<T>>{

	// **************************************************
    // Fields
    // **************************************************
	private BinaryTreeNode<T> root = null;

	// **************************************************
    // Methods
    // **************************************************

    /**
	 * Adds new data to the tree, maintaning Binary Search status.
	 * @param newData
	 *	New data to be inserted
	 */
	public void insert(T newData){
		root = insert(newData, root);
	}

	 /**
	 * Adds new data to the tree, maintaning Binary Search status.
	 * @param newData
	 *	New data to be inserted
	 * @param subtree
	 *	Subtree to search through for insertion
	 * @return
	 *	Newly modified subtree to attach
	 */
	 public BinaryTreeNode<T> insert(T newData, BinaryTreeNode<T> subtree){
	 	if(subtree == null){
	 		return new BinaryTreeNode<T>(newData);
	 	}
	 	else{
	 		if(subtree.data.compareTo(newData) >= 0){
	 			subtree.left = insert(newData, subtree.left);
	 		}
	 		else{
	 			subtree.right = insert(newData, subtree.right);
	 		}
	 	}
	 	return subtree;
	 }

	 /**
	 * Calculates how manu level tree has, starting from root.
	 * @return
	 *	Height of tree
	 */
	 public int getHeight(){
	 	return getHeight(root);

	 }

	 /**
	 * Calculates how manu level tree has, starting from subtree.
	 * @param subtree
	 *	Starting point to recurse down from
	 * @return
	 *	Height of tree
	 */
	 public int getHeight(BinaryTreeNode<T> subtree){
	 	if(subtree == null){
	 		return 0;
	 	}

	 	int leftHeight = getHeight(subtree.left);
	 	int rightHeight = getHeight(subtree.right);

	 	if(leftHeight > rightHeight){
	 		return leftHeight+1;
	 	}
	 	else{
	 		return rightHeight+1;
	 	}

	 }

	 /**
	 * Visit tree nodes in 'pre-order' starting from root.<br>
	 * Visits parent node, left child, right child.
	 */
	 public void traversePreOrder(){
	 	traversePreOrder(root);
	 }

	 /**
	 * Visit tree nodes in 'pre-order' starting from subtree.<br>
	 * Visits parent node, left child, right child.
	 * @param subtree
	 *	Starting point to recurse down from
	 */
	 public void traversePreOrder(BinaryTreeNode<T> subtree){
	 	if(subtree == null){
	 		return;
	 	}
	 	System.out.print("" + subtree.data + ", ");
	 	traverseInOrder(subtree.left);
	 	traverseInOrder(subtree.right);
	 }

	 /**
	 * Visit tree nodes in 'order' starting from root.<br>
	 * Visits left child, parent node, right child.
	 */
	 public void traverseInOrder(){
	 	traverseInOrder(root);
	 }

	 /**
	 * Visit tree nodes in 'order' starting from subtree.<br>
	 * Visits left child, parent node, right child.
	 * @param subtree
	 *	Starting point to recurse down from
	 */
	 public void traverseInOrder(BinaryTreeNode<T> subtree){
	 	if(subtree == null){
	 		return;
	 	}
	 	traverseInOrder(subtree.left);
	 	System.out.print("" + subtree.data + ", ");
	 	traverseInOrder(subtree.right);
	 }

	 /**
	 * Visit tree nodes in 'post-order' starting from root.<br>
	 * Visits left child, right child, parent node.
	 */
	 public void traversePostOrder(){
	 	traversePostOrder(root);
	 }

	 /**
	 * Visit tree nodes in 'post-order' starting from subtree.<br>
	 * Visits left child, right child, parent node.
	 * @param subtree
	 *	Starting point to recurse down from
	 */
	 public void traversePostOrder(BinaryTreeNode<T> subtree){
	 	if(subtree == null){
	 		return;
	 	}
	 	traverseInOrder(subtree.left);
	 	traverseInOrder(subtree.right);
	 	System.out.print("" + subtree.data + ", ");
	 }

	 /**
	 * Visit tree nodes in 'level-order' starting from root.<br>
	 * Visits every node in a level before going on to the next one.
	 */
	 public void traverseLevelOrder(){
	 	Queue<BinaryTreeNode<T>> queue = new LinkedList<BinaryTreeNode<T>>();
	 	queue.add(root);

	 	while(!queue.isEmpty()){
	 		BinaryTreeNode<T> currentNode = queue.poll();
	 		System.out.println("" + currentNode.data + ", ");

	 		if(currentNode.left != null){
	 			queue.add(currentNode.left);
	 		}
	 		if(currentNode.right != null){
	 			queue.add(currentNode.right);
	 		}
	 	}
	 }




}