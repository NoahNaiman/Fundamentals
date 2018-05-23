/**
 * <h1>Node Class</h1>
 * A basic Node class.
 *
 * @author Noah Naiman
 * @since 5-21-2018
 */
public class Node<T extends Comparable<T>>{
    // **************************************************
    // Fields
    // **************************************************
	T data;

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
}
