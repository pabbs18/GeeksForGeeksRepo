/**
 * 
 */
package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Neha Gaur
 * @author Prabhanjan Note to self: Need to understand this problem better
 * 
 *         https://practice.geeksforgeeks.org/problems/possible-paths-between-2-vertices/0/?track=PC-W7-GR&batchId=127
 */
public class AllPossiblePathsBetweenTwoVertices {

	int vertices;
	List<List<Integer>> adjList;

	public AllPossiblePathsBetweenTwoVertices(int vertices) {
		this.vertices = vertices;
		adjList = new ArrayList<>();

		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int fromVertex, int toVertex) {
		adjList.get(fromVertex).add(toVertex);
	}

	public int countPaths(int sourceVertex, int destinationVertex) {
		int pathCount = 0;

		return countPaths(sourceVertex, destinationVertex, pathCount);
	}

	public int countPaths(int sourceVertex, int destinationVertex, int pathCount) {
		//if we have reached destination node	
		if (sourceVertex == destinationVertex) {
			pathCount++;
		}

		else {//go through all the adjacent vertices
			Iterator<Integer> iterator = adjList.get(sourceVertex).listIterator();
			while (iterator.hasNext()) {
				int adjacentVertex = iterator.next();
				//now recursively check if the destination can be reached from each 
				//these adjacentVertex of our sourceVertex
				pathCount = countPaths(adjacentVertex, destinationVertex, pathCount);
			}
		} //once we are done with all the adjacent vertices of the given vertex, we return the
			//count of all possible paths from this current vertex
		return pathCount;
	}

	public static void main(String[] args) {
		AllPossiblePathsBetweenTwoVertices g = new AllPossiblePathsBetweenTwoVertices(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 4);

		int s = 0, d = 3;
		System.out.println(g.countPaths(s, d));

	}

}
