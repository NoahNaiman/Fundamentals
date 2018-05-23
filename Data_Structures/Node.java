/**
 * <h1>Node Class</h1>
 * A basic Node superclass to be
 * extended by various data structures.
 *
 * @author Noah Naiman
 * @since 5-21-2018
 */
public class Node<T extends Comparable<T>>{
    // **************************************************
    // Fields
    // **************************************************
	private T data;

    // **************************************************
    // Constructors
    // **************************************************

    /**
    * Default constructor.<br>
    * Value of data will be null.
    */
    public Node(){
    	data = null;
    };

    /**
    * Parameterized constructor.<br>
    * @param initialData
    *	Sets data to initialData
    */
	public Node(T initialData){
		data = initialData;
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
     * Mutator method to set this Node's data.
     * @param newData
     *	What this Node's data should be set to
     */
    public void setData(T newData){
    	data = newData;
    }

    /**
     * Creates and returns a deep copy of this Node.
     * @return 
     *	A new Node which is a copy of the original Node
     */
    public Node copyNode(){
    	Node<T> nodeCopy = new Node<T>(this.data);
    	return nodeCopy;
    }

    /**
     * Prints Node's stored data.
     * @return 
     *	String representing the Node's data
     */
    public String toString()){
    	String s = "" + data;
    	return s;
    }
}
