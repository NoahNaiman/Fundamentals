/**
 * <h1>Singly Linked List Class</h1>
 * A linked list where each node points to the next node.
 * Can be extended into a Stack or Queue.
 *
 * Average Prepending Time: O(1)
 * Average Appending Time: O(n)
 * Average Deletion Time: O(n)
 * Average Search Time: O(n)
 *
 * @author Noah Naiman
 * @since 5-22-2018
 */

public class SinglyLinkedList<T extends Comparable<T>>{

	// **************************************************
    // Fields
    // **************************************************
    private SinglyLinkedListNode<T> head = new SinglyLinkedListNode<T>(null, null);
    private int length = 0;

    // **************************************************
    // Methods
    // **************************************************

    /**
    * Returns length of list.<br>
    * Worst Case Time: O(1)
    * @return
    *	Length of list
    */
    public int getLength(){
    	return length;
    }

    /**
    * Prepends new data as a new node.<br>
    * Worst Case Time: O(1)
    * @param newData
    *	New data to be prepended
    */
    public void append(T newData){
    	if(head.data == null){
    		head.data = newData;
    		length++;
    	}
    	else{
    		head.next = new SinglyLinkedListNode<T>(newData);
    		length++;
    	}
    }

    /**
    * Appends new data as a new node.<br>
    * Worst Case Time: O(n)
    * @param newData
    *	New data to be appended
    */
    public void append(T newData){
    	if(head.data == null){
    		head.data = newData;
    		length++;
    	}
    	else{
    		SinglyLinkedListNode<T> cur = head, next = head.next;
    		while(next.next != null){
    			cur = next;
    			next = next.next;
    		}
    		next.data = newData;
    		length++;
    	}
    }

    /**
    * Checks if an item is in the list.<br>
    * Worst Case Time: O(n)
    * @param checkFor
    *	Data to look for
    * @return
    * True if checkFor is contained, false if otherwise
    */
    public boolean contains(T checkFor){
    	SinglyLinkedListNode<T> cur = head;
    	do{
    		if(cur.data.compareTo(checkFor) == 0){
    			return true;
    		}
    	}while(cur.data != null);
    	return false;
    }

    /**
    * Deletes first found instance of given data.<br>
    * Worst Case Time: O(n)
    * @param toDelete
    *	Data to delete
    */
    public void delete(T toDelete){
    	if(contains(toDelete)){
    		SinglyLinkedListNode<T> cur = head;
    		if(cur.data.compareTo(toDelete) == 0){
    			head = head.next;
    			length--;
    		}
    		else{
    			while(cur.next.data.compareTo(toDelete) != 0){
	    			cur = cur.next;
	    		}
	    		cur.next = cur.next.next;
	    		length--;
    		}
    	}
    }

    /**
    * Deletes all instances of given data.<br>
    * Worst Case Time: O(n)
    * @param toDelete
    *	Data to delete
    */
    public void deleteAll(T toDelete){
    	while(contains(toDelete)){
    		delete(toDelete);
    	}
    }

    public SinglyLinkedList<T> clone(){
    	//TODO
    }

}