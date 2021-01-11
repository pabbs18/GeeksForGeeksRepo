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
 */
public class DFSofGraph {

	int vertices;
	List<List<Integer>> adjList;

	public DFSofGraph(int vertices) {
		this.vertices = vertices;
		adjList = new ArrayList<>();

		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int fromVertex, int toVertex) {
		adjList.get(fromVertex).add(toVertex);
	}

	public void DFSTraveral(int startVertex) {
		boolean[] visited = new boolean[vertices];

		DFSTraveral(startVertex, visited);

	}

	public void DFSTraveral(int startVertex, boolean[] visited) {

		visited[startVertex] = true;
		System.out.println("Visited: " + startVertex);

		Iterator<Integer> iterator = adjList.get(startVertex).listIterator();

		while (iterator.hasNext()) {
			int vertex = iterator.next();

			if (visited[vertex] == false) {
				DFSTraveral(vertex, visited);
			}
		}
	}

	public static void main(String[] args) {
		DFSofGraph g = new DFSofGraph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");

		g.DFSTraveral(2);

	}

}
