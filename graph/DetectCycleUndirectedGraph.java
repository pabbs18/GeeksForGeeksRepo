/**
 * 
 */
package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *         https://www.geeksforgeeks.org/detect-cycle-undirected-graph/ first
 *         watch the video in the link given at the end
 */
public class DetectCycleUndirectedGraph {

	int vertices;
	List<List<Integer>> adjList;

	public DetectCycleUndirectedGraph(int vertices) {
		this.vertices = vertices;
		adjList = new ArrayList<>();

		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int fromVertex, int toVertex) {
		adjList.get(fromVertex).add(toVertex);
		adjList.get(toVertex).add(fromVertex);
	}

	public boolean detectCycle() {
		boolean[] visited = new boolean[vertices];

		for (int vertex = 0; vertex < vertices; vertex++) {
			if (visited[vertex] == false) {
				if (detectCycle(vertex, visited, -1) == true) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean detectCycle(int vertex, boolean[] visited, int parent) {
		visited[vertex] = true;

		Iterator<Integer> iterator = adjList.get(vertex).listIterator();

		while (iterator.hasNext()) {
			int adjVertex = iterator.next();

			if (visited[adjVertex] == false) {
				if (detectCycle(adjVertex, visited, vertex) == true) {
					return true;
				}
			}
			// if this adjacent vertex is already visited but my current vertex did not come form
			//this adjacent vertex, then there is a cycle present.
			else if (adjVertex != parent) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		DetectCycleUndirectedGraph g1 = new DetectCycleUndirectedGraph(5);
		g1.addEdge(1, 0);
		g1.addEdge(0, 2);
		g1.addEdge(2, 1);
		g1.addEdge(0, 3);
		g1.addEdge(3, 4);

		if (g1.detectCycle() == true)
			System.out.println("Graph g1 contains cycle");
		else
			System.out.println("Graph g1 doesn't contains cycle");

		DetectCycleUndirectedGraph g2 = new DetectCycleUndirectedGraph(3);
		g2.addEdge(0, 1);
		g2.addEdge(1, 2);
		if (g2.detectCycle() == true)
			System.out.println("Graph g2 contains cycle");
		else
			System.out.println("Graph g2 doesn't contain cycle");
	}

}
