package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	//number of vertices
	int V;
	//Adjacency List
	LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	Graph(int V)
	{
		this.V=V;
		adj=new LinkedList[V];
		for(int i=0 ; i<V;i++)
		{
			adj[i]=new LinkedList<Integer>();
		}
	}
	
	//To add an edge between vertex1 to vertex2
	public void addEdge(int vertex1,int vertex2)
	{
		adj[vertex1].add(vertex2);
	}
	//A util method to do the DFS
	public void DFSUtil(int vertex,boolean[] visited)
	{
		//mark the vertex as visited
		visited[vertex]=true;
		
		//print the vertex
		System.out.println(vertex);
		
		//find all adjacent nodes and recursively call DFSUtil to print all of them
		Iterator<Integer> iterator = adj[vertex].listIterator();
		while(iterator.hasNext())
		{
			Integer i = iterator.next();
			if(!visited[i])
			{
				DFSUtil(i, visited);
			}
		}
		
		
	}
	public void DFS()
	{
		//make a visited array and it will automatically initialize to 1
		boolean[] visited = new boolean[V];
		//check for all nodes from 0 to n-1 so that we can also traverse the not connected components
		for(int i=0; i<V; i++)
		{
			if(!visited[i])
			{
				DFSUtil(i, visited);
			}
		}
	}
	public void BFS()
	{
		//make a visited array and it will automatically initialize to 1
		boolean[] visited = new boolean[V];
		//check for all nodes from 0 to n-1 so that we can also traverse the not connected components
		for(int i=0; i<V; i++)
		{
			if(!visited[i])
			{
				BFSUtil(i,visited);
			}
		}
	}

	public void BFSUtil(int vertex, boolean[] visited) 
	{
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[vertex]=true;
		queue.add(vertex);
		while(queue.size()>0)
		{
			Integer node= queue.poll();
			System.out.println(node);
			
			Iterator<Integer> iterator=adj[node].listIterator();
			while(iterator.hasNext())
			{
				Integer neighbour=iterator.next();
				if(!visited[neighbour])
				{
					//mark the vertex as visited a
					visited[neighbour]=true;
					queue.add(neighbour);
				}
				
			}
			
		}
		
		
		
	}
	

}
