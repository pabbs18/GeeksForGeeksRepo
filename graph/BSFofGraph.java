/**
 * 
 */
package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class BSFofGraph {

	int vertices;
	List<List<Integer>> adjList;

	public BSFofGraph(int vertices) {
		this.vertices = vertices;
		adjList = new ArrayList<>();

		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int fromVertex, int toVertex) {
		adjList.get(fromVertex).add(toVertex);
	}

	public void breadthFirstTraversal(int startVertex) {
		boolean[] visited = new boolean[vertices];

		Queue<Integer> queue = new LinkedList<>();

		// mark startVertex as visited
		visited[startVertex] = true;
		//add it to the queue
		queue.offer(startVertex);

		while (!queue.isEmpty()) {
			//remove and print the vertex from the queue
			int vertex = queue.poll();
			System.out.println("Visited: " + vertex);

			//get all its adjacent vertices
			Iterator<Integer> iterator = adjList.get(vertex).listIterator();
			while (iterator.hasNext()) {
				//get adjVertices one by one
				int adjVertex = iterator.next();
				//if the vertex is not visited even once
				if (visited[adjVertex] == false) {
					//mark the vertex as visited
					visited[adjVertex] = true;
					//and then add it to the queue
					queue.offer(adjVertex);
				}
			}
		}

	}

	public static void main(String[] args) {
		BSFofGraph g = new BSFofGraph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		g.breadthFirstTraversal(2);
	}

}
