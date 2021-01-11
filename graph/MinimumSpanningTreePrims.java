/**
 * 
 */
package graph;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *         https://www.youtube.com/watch?v=eB61LXLZVqs
 *         https://www.geeksforgeeks.org/prims-minimum-spanning-tree-mst-greedy-algo-5/
 */
public class MinimumSpanningTreePrims {

	static int vertices = 5;

	public static void primsMiniumSpanningTree(int[][] arr) {
		if (arr == null) {
			return;
		}

		int[] parent = new int[vertices];//store parent of the each vertex

		int[] key = new int[vertices]; //weight associated with each vertex

		boolean[] mstSet = new boolean[vertices];//mstSet = minimumSpanningTree-set, i.e vertices included int the miniumum spanning tree

		//Initially, mark all the vertices as not in mstSet and their weights as infinite

		for (int vertex = 0; vertex < vertices; vertex++) {
			key[vertex] = Integer.MAX_VALUE;
			mstSet[vertex] = false;
		}

		//mark the weight/key of starting vertex as 0 and its parent as -1
		key[0] = 0;
		parent[0] = -1;

		//for all the vertices, pick a minimum vertex not a aprt of minimum
		// spanning tree yet, i.e which is not already included in mstSet
		for (int rowVertex = 0; rowVertex < vertices; rowVertex++) {
			int min = minimum(key, mstSet);

			// once you find the minimum vertex amongst all the vertices from the key[] array
			// include that vertex in the mst set, so that we don't loop back to it from some other vertex

			mstSet[min] = true;

			//check for its adjacent edges from the matrix
			//if they are not in mstSet yet, and carry some weight 
			//and that weight is less than their current weight from the key[] array
			//update their weight in the key[] array 
			//and assign current rowVertex as the parent of adjacentVertex
			for (int adjacentVertex = 0; adjacentVertex < vertices; adjacentVertex++) {
				if (mstSet[adjacentVertex] == false && arr[rowVertex][adjacentVertex] != 0
						&& arr[rowVertex][adjacentVertex] < key[adjacentVertex]) {
					key[adjacentVertex] = arr[rowVertex][adjacentVertex];
					parent[adjacentVertex] = rowVertex;
				}
			}
		}

		print(parent, key);
	}

	public static int minimum(int[] key, boolean[] mstSet) {
		int min = Integer.MAX_VALUE;
		int minIndex = 0;

		for (int i = 0; i < key.length; i++) {
			if (mstSet[i] == false && key[i] < min) {
				min = key[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static void print(int[] parent, int[] key) {
		for (int vertex = 0; vertex < parent.length; vertex++) {
			System.out.print("parent of " + vertex + " is " + parent[vertex] + " with weight " + key[vertex]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		/*int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
				{ 0, 8, 0, 7, 0, 4, 0, 0, 2 }, { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
				{ 0, 0, 4, 14, 10, 0, 2, 0, 0 }, { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
				{ 0, 0, 2, 0, 0, 0, 6, 7, 0 } };*/

		int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, { 2, 0, 3, 8, 5 }, { 0, 3, 0, 0, 7 }, { 6, 8, 0, 0, 9 },
				{ 0, 5, 7, 9, 0 } };
		primsMiniumSpanningTree(graph);

	}

}
