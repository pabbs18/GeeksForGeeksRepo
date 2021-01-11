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
 *         https://www.geeksforgeeks.org/detect-cycle-in-a-graph/ : Look at the
 *         c++ code for understanding and also the video
 * 
 * 
 *         https://www.youtube.com/watch?v=0dJmTuMrUZM :To get an idea as to why
 *         recursion stack is needed, though he doesn't use a recursionStack in
 *         his explanation, but still it helps. Also refer the above link to get
 *         an idea as how to traverse/track adjacent vertices by using adjacency
 *         list.
 * 
 */
public class DetectCycleDirectedGraph {

	int vertices;
	List<List<Integer>> adjList;

	public DetectCycleDirectedGraph(int vertices) {
		this.vertices = vertices;
		adjList = new ArrayList<>();

		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int fromVertex, int toVertex) {
		adjList.get(fromVertex).add(toVertex);
	}

	public boolean detectCycle() {
		boolean[] visited = new boolean[vertices];
		boolean[] recursionStack = new boolean[vertices];
		//go one by one vertex in adjList
		for (int vertex = 0; vertex < vertices; vertex++) {
			if (detectCycle(vertex, visited, recursionStack) == true) {
				return true;
			}
		}
		return false;
	}

	public boolean detectCycle(int vertex, boolean[] visited, boolean[] recursionStrack) {
		//if the vertex is not yet visited
		if (visited[vertex] == false) {
			//mark it as visited
			visited[vertex] = true;

			//put the vertex in the recursionStack
			recursionStrack[vertex] = true;

			//in the adjList recursively go through each of the adjacent vertex of this current vertex
			Iterator<Integer> iterator = adjList.get(vertex).listIterator();
			while (iterator.hasNext()) {
				int adjVertex = iterator.next();

				//if this adjacent vertex is not yet visited and if this recursively
				//returns true for cycle detection, then return true
				if (visited[adjVertex] == false && detectCycle(adjVertex, visited, recursionStrack) == true) {
					return true;
				}

				//else if the not has been already visited and is also present in recursionStack
				//then return true
				else if (recursionStrack[adjVertex] == true) {
					return true;
				}
			}
		}

		//after having recursively gone through each of the adjacent vertex and in turn the adjacent
		//vertices of each adjacent vertex of our current vertex in the adjList, and found no cycle w.r.t
		//our current vertex, we decide to remove it from the recursionStack and return false(i.e no cycle 
		//from at least this current vertex)
		recursionStrack[vertex] = false;
		return false;
	}

	public static void main(String[] args) {
		DetectCycleDirectedGraph graph = new DetectCycleDirectedGraph(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		//graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		//graph.addEdge(3, 3);

		if (graph.detectCycle()) {
			System.out.println("Graph contains cycle");
		} else {
			System.out.println("Graph doesn't " + "contain cycle");
		}

	}

}
