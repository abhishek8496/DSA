package graph;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * 
 Complexity Analysis: 

Time complexity: O(V + E), where V is the number of vertices and E is the number of edges in the graph.
Space Complexity :O(V). 
Since an extra visited array is needed of size V.
 * @author abhishek sharma
 *
 */


public class BreadthFirstSearch {
	 public static void main(String args[])
	    {
	        Graph g = new Graph(7);
	 
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(0, 3);
	        g.addEdge(1, 4);
	        g.addEdge(1, 5);
	        g.addEdge(1, 6);
	 
	        System.out.println("Following is Breadth First Traversal");
	 
	        g.BFS();
	    }

}
