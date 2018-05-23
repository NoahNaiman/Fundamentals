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
    private SinglyLinkedListNode next;

    // **************************************************
    // Constructors
    // **************************************************

    /**
    * Default constructor.<br>
    * Value of data will be null.<br>
    * Next will point to null
    */
    public SinglyLinkedListNode(){
    	data = null;
    	next = null;
    }

    /**
    * Parameterized constructor.<br>
    * Sets next to null.<br>
    * @param initialData
    *	Sets data to initialData
    */
	public SinglyLinkedListNode(T initialData){
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
	public SinglyLinkedListNode(T initialData, SinglyLinkedListNode nextNode){
		super(initialData);
		next = nextNode;
	}
}