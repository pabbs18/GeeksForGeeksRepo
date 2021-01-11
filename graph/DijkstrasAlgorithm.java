/**
 * 
 */
package graph;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *         https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/
 */
public class DijkstrasAlgorithm {

	public static int vertices = 9;

	public static void dijkstra(int[][] arr, int sourceVertex) {
		int[] distance = new int[vertices];
		boolean[] shortestPathTreeSet = new boolean[vertices];

		for (int i = 0; i < vertices; i++) {
			distance[i] = Integer.MAX_VALUE;
			shortestPathTreeSet[i] = false;
		}

		distance[sourceVertex] = 0;

		for (int rowVertex = 0; rowVertex < vertices; rowVertex++) {
			//minimum of distance array, not yet in shortestPathTreeSet array
			int startVertex = minimum(distance, shortestPathTreeSet);

			//mark startVertex as visited, i.e put it into shortestPathTreeSet
			shortestPathTreeSet[startVertex] = true;

			//check all the adjacent vertices of startVertex
			for (int colVertex = 0; colVertex < vertices; colVertex++) {
				//Update distance[colVertex] only if is not in shortestPathTreeSet, 
				//i.e shortestPathTreeSet[colVertex] = false;
				//there is an edge from startVertex to colVertex, i.e  arr[startVertex][colVertex] != 0
				//distance value of startVertex is not Infinity i.e distance[startVertex] != Integer.MAX_VALUE
				//total weight of path from startVertex to colVertex
				// through colVertex is smaller than current value of distance[colVertex] 

				if (shortestPathTreeSet[colVertex] == false && distance[startVertex] != Integer.MAX_VALUE
						&& arr[startVertex][colVertex] != 0
						&& distance[startVertex] + arr[startVertex][colVertex] < distance[colVertex]) {
					distance[colVertex] = distance[startVertex] + arr[startVertex][colVertex];
				}
			}

		}
		print(distance);
	}

	public static int minimum(int[] distance, boolean[] shortestPathTreeSet) {
		int min = Integer.MAX_VALUE;
		int minIndex = -1;

		for (int vertex = 0; vertex < vertices; vertex++) {
			if (shortestPathTreeSet[vertex] == false && distance[vertex] <= min) {
				min = distance[vertex];
				minIndex = vertex;
			}
		}
		return minIndex;
	}

	public static void print(int[] distance) {
		for (Integer i : distance) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
				{ 0, 8, 0, 7, 0, 4, 0, 0, 2 }, { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
				{ 0, 0, 4, 14, 10, 0, 2, 0, 0 }, { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
				{ 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
		dijkstra(graph, 0);
	}

}
