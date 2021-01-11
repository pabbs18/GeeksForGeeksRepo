/**
 * 
 */
package graph;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *         This is an n^3 problem
 * 
 *         This will be a square matrix
 */
public class FloydWarshallAllParisShortestPath {
	final static int INF = 99999, V = 4;

	public static void floydWarshall(int[][] dist) {
		if (dist == null) {
			return;
		}
		int n = dist.length;

		int[][] arr = new int[n][n];

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				arr[row][col] = dist[row][col];
			}
		}

		//for each vertex
		for (int vertex = 0; vertex < n; vertex++) {

			//for each row
			for (int row = 0; row < n; row++) {

				//for each col
				for (int col = 0; col < n; col++) {
					if (arr[row][vertex] + arr[vertex][col] < arr[row][col]) {
						arr[row][col] = arr[row][vertex] + arr[vertex][col];
					}
				}
			}
		}
		print(arr);
	}

	public static void print(int[][] arr) {
		int n = arr.length;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int graph[][] = { { 0, 5, INF, 10 }, { INF, 0, 3, INF }, { INF, INF, 0, 1 }, { INF, INF, INF, 0 } };

		floydWarshall(graph);
	}

}
