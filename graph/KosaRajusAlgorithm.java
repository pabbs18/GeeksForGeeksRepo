/**
 * 
 */
package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *         // Kosaraju's algorithm to find strongly connected components in Java
 *         https://www.programiz.com/dsa/strongly-connected-components
 */
public class KosaRajusAlgorithm {

	private int vertices;
	private List<List<Integer>> adjList;

	public KosaRajusAlgorithm(int vertices) {
		this.vertices = vertices;
		adjList = new ArrayList<>();

		for (int vertex = 0; vertex < vertices; vertex++) {
			adjList.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int fromVertex, int toVertex) {
		adjList.get(fromVertex).add(toVertex);
	}

	public void stronglyConnectedComponents() {
		//a stack to store all the visited vertices(no more neighbors) during the first pass

		Stack<Integer> stack = new Stack<>();

		// visited array

		boolean[] visited = new boolean[vertices];

		//do a dfs and fill the stack

		for (int vertex = 0; vertex < vertices; vertex++) {
			if (visited[vertex] == false) {
				dfs1(vertex, visited, stack);
			}
		}

		// after the end of for loop all the vertices will be in the stack

		// now this is the most important step: Get the transpose of the matrix.
		//i.e change the direction of the edges

		KosaRajusAlgorithm graph = transpose();

		// now, mark all the vertices as unvisited so that we can do one more pass of dfs
		//to print all possible strongly connected components

		for (int vertex = 0; vertex < vertices; vertex++) {
			visited[vertex] = false;
		}

		// pop vertex one by one from the stack and if its not yet visited, 
		//do a dfs. It returns after at the end of every individual component

		while (!stack.isEmpty()) {
			int vertex = stack.pop();

			if (!visited[vertex]) {
				graph.dfs2(vertex, visited);
				System.out.println();
			}
		}
	}

	public void dfs1(int vertex, boolean[] visited, Stack<Integer> stack) {
		// mark the vertex as visited

		visited[vertex] = true;

		// visited all the neighboring vertices

		Iterator<Integer> iterator = adjList.get(vertex).listIterator();

		while (iterator.hasNext()) {
			int adjacentVertex = iterator.next();

			if (visited[adjacentVertex] == false) {
				dfs1(adjacentVertex, visited, stack);
			}
		}

		//once there are no more neighbors to visit, before returning  store the vertex in the stack

		stack.push(vertex);
		return;
	}

	public void dfs2(int vertex, boolean[] visited) {
		// mark the vertex as visited
		visited[vertex] = true;
		//print the vertex
		System.out.print(vertex + " ");

		// visited all the neighboring vertices
		Iterator<Integer> iterator = adjList.get(vertex).listIterator();
		while (iterator.hasNext()) {
			int adjacentVertex = iterator.next();
			if (visited[adjacentVertex] == false) {
				dfs2(adjacentVertex, visited);
			}
		}
	}

	public KosaRajusAlgorithm transpose() {
		// create a new graph object. it's constructor gives you a new adjList
		KosaRajusAlgorithm graph = new KosaRajusAlgorithm(vertices);

		//for each vertex, add an edge from its neighbor to the vertex itself
		//this is in the opposite direction as compared to original addEdge() method.

		// you get the adjacent vertices from the existing adjList
		// and then create a new adjlist belonging the new graph

		for (int vertex = 0; vertex < vertices; vertex++) {
			//get all its neighbors
			Iterator<Integer> iterator = adjList.get(vertex).listIterator();
			while (iterator.hasNext()) {
				int adjacentVertex = iterator.next();
				graph.addEdge(adjacentVertex, vertex);//here fromVertex = adjacentVertex, toVertex= originalVertex
			}
		}
		return graph;
	}

	public static void main(String[] args) {
		KosaRajusAlgorithm g = new KosaRajusAlgorithm(8);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 0);
		g.addEdge(4, 5);
		g.addEdge(5, 6);
		g.addEdge(6, 4);
		g.addEdge(6, 7);

		System.out.println("Strongly Connected Components:");
		g.stronglyConnectedComponents();

	}

}
