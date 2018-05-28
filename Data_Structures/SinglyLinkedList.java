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
    public void prepend(T newData){
    	if(head.data == null){
    		head.data = newData;
    		length++;
    	}
    	else{
    		SinglyLinkedListNode<T> temp = new SinglyLinkedListNode<T>(head.data, head.next);
    		head.data = newData;
    		head.next = temp;
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
    	for (SinglyLinkedListNode<T> cur = head; cur.next!=null; cur=cur.next) {
			if(cur.data.compareTo(checkFor) == 0){
    			return true;
    		}
		}
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

    /**
    * Returns a clone of this list.<br>
    * Worst Case Time: O(n)
    * @return
    *	A Singly Linked List which is a clone of current list
    */
    public SinglyLinkedList<T> clone(){
    	SinglyLinkedList<T> cloneList = new SinglyLinkedList<T>();
    	for (SinglyLinkedListNode<T> cur = head; cur.next!=null; cur=cur.next) {
			cloneList.append(cur.data);
		}
    	return cloneList;
    }

    /**
    * Returns a reverse version of this list.<br>
    * Worst Case Time: O(n)
    * @return
    *	A Singly Linked List which is a reversed version of current list
    */
	public SinglyLinkedList<T> reverse(){
    	SinglyLinkedList<T> reverseList = new SinglyLinkedList<T>();
    	for (SinglyLinkedListNode<T> cur = head; cur.next!=null; cur=cur.next) {
			reverseList.prepend(cur.data);
		}
    	return reverseList;
    }

    /**
    * Checks if the list has a loop in it.<br>
    * Floyd's cycle detection algortithm: https://en.wikipedia.org/wiki/Cycle_detection.<br>
    * Worst Case Time: O(λ + μ)
    * @return
    *   True if there is a loop, false otherwise
    */
    public boolean hasLoop(){
        if(head == null){
            return false;
        }

        SinglyLinkedListNode<T> tortoise = head;
        SinglyLinkedListNode<T> hare = head;

        while(true){
            tortoise = tortoise.next;

            if(hare.next != null){
                hare = har.next.next;
            }
            else{
                return falsel
            }

            if(tortoise == null || hare == null){
                return false;
            }

            if(tortoise == hare){
                return true;
            }

        }

    }

    /**
    * Returns a String representing the data held in this list.<br>
    * Worst Case Time: O(n)
    * @return
    *	A String representing an ASCII image of this list
    */
    public String toString(){
    	if(head.data == null){
    		return "[]";
    	}
    	else{
    		String listImage = "[";
    		for (SinglyLinkedListNode<T> cur = head; cur.next!=null; cur=cur.next) {
				listImage += cur.data + "|--> ";
			}
			return listImage + "]";
    	}
    }

}