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
 *         https://www.geeksforgeeks.org/find-a-mother-vertex-in-a-graph/
 */
public class MotherVertex {

	int vertices;
	List<List<Integer>> adjList;

	public MotherVertex(int vertices) {
		this.vertices = vertices;
		adjList = new ArrayList<>();

		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int sourceVertex, int destinationVertex) {
		adjList.get(sourceVertex).add(destinationVertex);
	}

	public int findMotherVertex() {

		boolean[] visited = new boolean[vertices];

		int lastVertexToFinish = 0;

		//loop through all the vertices to perform dfs

		for (int vertex = 0; vertex < vertices; vertex++) {
			//iff the vertex is not yet visited
			if (!visited[vertex]) {
				dfs(vertex, visited);// this takes care of marking the vertices as visited
				lastVertexToFinish = vertex;
			}
		}

		//lastVertexToFinish could be a mother vertex
		//perform dfs starting with this vertex

		// mark all the vertices as not visited for second round of dfs
		for (int i = 0; i < vertices; i++) {
			visited[i] = false;
		}

		dfs(lastVertexToFinish, visited);

		//after performing the dfs, now check if there are any unvisited vertices.
		//if so, then all the vertices cannot be reached from lastVertexToFinish, aparently.
		//else, it is a mother vertex
		for (int i = 0; i < vertices; i++) {
			if (visited[i] = false) {
				return -1;
			}
		}

		//At this point, all the vertices are reachable, since we have crossed for loop
		return lastVertexToFinish;
	}

	public void dfs(int vertex, boolean[] visited) {
		visited[vertex] = true;

		//visit all the adjacent vertices of the current vertex, from the adjacency list
		Iterator<Integer> iterator = adjList.get(vertex).listIterator();
		while (iterator.hasNext()) {
			int adjacentVertex = iterator.next();
			if (visited[adjacentVertex] == false) {
				dfs(adjacentVertex, visited);
			}
		}
	}

	public static void main(String[] args) {
		MotherVertex g = new MotherVertex(7);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(4, 1);
		g.addEdge(6, 4);
		g.addEdge(5, 6);
		g.addEdge(5, 2);
		g.addEdge(6, 0);

		System.out.println("One of the mother vertex is: " + g.findMotherVertex());

	}

}
