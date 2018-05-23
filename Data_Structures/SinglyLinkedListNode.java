/**
 * <h1>Singly Linked List Node Class</h1>
 * A Node class used to construct a singly linked list.
 * Extends Node class.
 *
 * @author Noah Naiman
 * @since 5-22-2018
 */

public class SinglyLinkedListNode<T extends Comparable<T>> extends Node{
	// **************************************************
    // Fields
    // **************************************************
    private T data;
    private Node next;

    // **************************************************
    // Constructors
    // **************************************************

    /**
    * Default constructor.<br>
    * Value of data will be null.<br>
    * Next will point to null
    */
    public Node(){
    	data = null;
    	next = null;
    }

    /**
    * Parameterized constructor.<br>
    * Sets next to null.<br>
    * @param initialData
    *	Sets data to initialData
    */
	public Node(T initialData){
		super(initialData);
		next = null;
	}

	/**
    * Parameterized constructor.<br>
    * @param initialData
    *	Sets data to initialData
    * @param nextNode
    *	Points next to nextNode
    */
	public Node(T initialData, Node nextNode){
		super(initialData);
		next = nextNode;
	}

	// **************************************************
    // Public methods
    // **************************************************

    /**
     * Accessor method to get this Node's data.
     * @return
     *	This Node's data
     */
    public T getData(){
    	return data;
    }

    /**
     * Accessor method to get this Node's next Node.
     * @return
     *	The next Node linked to this Node
     */
    public SinglyLinkedListNode getNext(){
    	return next;
    }

    /**
     * Mutator method to set this Node's data.
     * @param newData
     *	What this Node's data should be set to
     */
    public void setData(T newData){
    	data = newData;
    }

    /**
     * Mutator method to set the next Node linked to this one.
     * @param nextNode
     *	A Node to link as current Node to
     */
    public void setNext(SinglyLinkedListNode nextNode){
    	next = nextNode;
    }

    /**
     * Creates and returns a deep copy of this Node.
     * @return 
     *	A new Node which is a copy of the original Node
     */
    public SinglyLinkedListNode copyNode(){
    	SinglyLinkedListNode<T> nodeCopy = new SinglyLinkedListNode<T>(this.data, this.next);
    	return nodeCopy;
    }

    /**
     * Prints Node's stored data.
     * @return 
     *	String representing the Node's data
     */
    public String toString()){
    	String s = "" + data + "|";
    	if(next != null){
    		return s + "-->"
    	}
    	return s;
    }
}