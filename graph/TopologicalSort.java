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
 *         https://www.geeksforgeeks.org/topological-sorting/
 * 
 *         Topological sort works only for Directed Acyclic Graphs.If there is a
 *         cycle in the graph, topological sort is not possible. In Topological
 *         Sort, we visit every node one by one using DFS. We start with a node,
 *         go through all its neighbors in the adjacency list, recursively. Once
 *         we encounter a node which has no new neighbors or no neighbors at
 *         all, we push it on to the stack and return to the calling node. Once
 *         all the nodes are covered,we print the stack by popping one by one.
 * 
 * 
 *         Basically, we print those nodes first who have no dependency(i.e no
 *         neighbors)
 */
public class TopologicalSort {
	int vertices;
	List<List<Integer>> adjList;

	public TopologicalSort(int vertices) {
		this.vertices = vertices;
		adjList = new ArrayList<>();

		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int fromVertex, int toVertex) {
		adjList.get(fromVertex).add(toVertex);
	}

	public void topologicalSort() {
		boolean[] visited = new boolean[vertices];
		Stack<Integer> stack = new Stack<>();
		//go through each vertex in the adjList
		for (int vertex = 0; vertex < vertices; vertex++) {
			//if the vertex is not yet visited
			if (visited[vertex] == false) {
				topologicalSort(vertex, visited, stack);// this will do a DFS and push the vertices on the stack
			}
		}
		//once all the vertices are pushed, print them
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	public void topologicalSort(int vertex, boolean[] visited, Stack<Integer> stack) {
		//mark the vertex as visited
		visited[vertex] = true;

		//recursively visit all its neighbors
		Iterator<Integer> iterator = adjList.get(vertex).listIterator();
		while (iterator.hasNext()) {
			int adjVertex = iterator.next();
			if (!visited[adjVertex]) {// if the adjacent vertex is not yet visited
				topologicalSort(adjVertex, visited, stack);//recursively call the method on the adjacent vertex
			}
		}

		//once all the adjacent vertices are visited and there are no more neighbors(dependencies),
		//we push this current vertex on to the stack

		stack.push(vertex);
		return;
	}

	public static void main(String[] args) {
		TopologicalSort g = new TopologicalSort(6);
		g.addEdge(5, 2);
		g.addEdge(5, 0);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);

		System.out.println("Following is a Topological sort of the given graph");
		g.topologicalSort();
	}

}
