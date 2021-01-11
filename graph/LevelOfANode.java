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
 * 
 *         We could do it with DFS. But BFS is more intuitive as it goes level
 *         by level. We can store the level of each node in an array called
 *         levels[], by incrementing level by levels[currentVertex]=1. Once all
 *         the nodes are visited, we can return the levels[targetVertex].
 */
public class LevelOfANode {
	int vertices;
	List<List<Integer>> adjList;

	public LevelOfANode(int vertices) {
		this.vertices = vertices;
		adjList = new ArrayList<>();

		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int fromVertex, int toVertex) {
		adjList.get(fromVertex).add(toVertex);
	}

	public int levelOfNode(int startVertex, int targetVertex) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[vertices];
		int[] levels = new int[vertices];

		visited[startVertex] = true;//mark startVertex as visited
		levels[startVertex] = 0;//store its level as 0
		queue.offer(startVertex);//push it to the queue

		while (!queue.isEmpty()) {
			int vertex = queue.poll();
			//get all its adjacent vertices from the adjList
			Iterator<Integer> iterator = adjList.get(vertex).listIterator();
			while (iterator.hasNext()) {
				int adjVertex = iterator.next();
				//if the adjacent vertex is not yet visited
				if (visited[adjVertex] == false) {
					//mark it as visited
					visited[adjVertex] = true;
					//store its level
					levels[adjVertex] = levels[vertex] + 1;
					//push it to the queue
					queue.offer(adjVertex);
				}
			}
		}
		return levels[targetVertex];
	}

	public static void main(String[] args) {
		LevelOfANode g = new LevelOfANode(8);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(1, 5);
		g.addEdge(2, 5);
		g.addEdge(2, 6);
		g.addEdge(6, 7);

		System.out.println("Level: " + g.levelOfNode(0, 7));

	}

}
