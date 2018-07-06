import java.util.Hashtable;
import java.util.HashSet;

/**
 * <h1>Graph Class</h1>
 * A graph of nodes connected by
 * edges. This class works for both
 * directed and undirected graphs.
 * This representation uses a
 * hashtable of HashSets as a key
 * value pair in the form of
 * node : {edges}.
 *
 * @author Noah Naiman
 * @since 7-6-2018
 */
public class Graph<T extends Comparable<T>>{

	// **************************************************
    // Fields
    // **************************************************
	private Hashtable<T, HashSet<T>> adjacencyList = new Hashtable<>();


	// **************************************************
    // Methods
    // **************************************************

    /**
	 * Adds a new node with no edges to adjacency list.
	 * @param node
	 *	New node to be added
	 */
    public void add_edge(T node){
		HashSet<T> newSet = new HashSet<T>();
		adjacencyList.put(node, newSet);
	}

	/**
	 * Adds a new edges to adjacency list. If node does not
	 * exist, adds new node as well.
	 * @param node
	 *	Node whose edge set edge should be added to
	 * @param edge
	 *	New edge to be added
	 */
	public void add_edge(T node, T edge){
		if(adjacencyList.containsKey(node)){
			adjacencyList.get(node).add(edge);
		}
		else{
			HashSet<T> newSet = new HashSet<T>();
			newSet.add(edge);
			adjacencyList.put(node, newSet);
		}
	}

	/**
	 * Adds multiple new edges to adjacency list. If node does not
	 * exist, adds new node as well.
	 * @param node
	 *	Node whose edge set edges should be added to
	 * @param edges
	 *	New edges to be added
	 */
	public void add_edge(T node, T[] edges){
		if(adjacencyList.containsKey(node)){
			for(T edge : edges){
				adjacencyList.get(node).add(edge);
			}
		}
		else{
			HashSet<T> newSet = new HashSet<T>();
			for(T edge : edges){
				newSet.add(edge);
			}
			adjacencyList.put(node, newSet);
		}
	}

}
