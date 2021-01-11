/**
 * 
 */
package graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *         https://leetcode.com/problems/01-matrix/discuss/101021/Java-Solution-BFS
 * 
 */
public class DistanceOfNearestCellHaving1 {

	public static int[][] distanceFromOne(int[][] arr) {
		if (arr == null) {
			return null;
		}

		//get the length of row and column

		int m = arr.length;
		int n = arr[0].length;

		//go through the matrix. Store the location of 1's as a 1D matrix in a queue.
		//Also make the non 1's as infinite, so that later it is useful while comparing the shortest 
		//distance for each cell
		Queue<int[]> queue = new LinkedList<>();
		for (int row = 0; row < m; row++) {
			for (int col = 0; col < n; col++) {
				if (arr[row][col] == 1) {
					queue.offer(new int[] { row, col });
				} else {
					//make that location value as infinite
					arr[row][col] = Integer.MAX_VALUE;
				}
			}
		}

		//A direction array[][], to move in all the four directions: up, down, left, right of a cell in the matrix

		int[][] directions = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

		//pop values(location of 1's) from the queue and assign the distance for
		//each non 1 location in the matrix from this 1-location
		while (!queue.isEmpty()) {
			int[] d = queue.poll();
			//do a BFS in all the 4 directions using a for loop
			for (int[] dir : directions) {
				int roww = d[0] + dir[0];
				int coll = d[1] + dir[1];

				//check the edge cases and check if the existing distance from 1th-location is already
				//less than the newly calculated distance(i.e there is another nearer 1 to this non 1 location)
				//and also check that this location is not another '1'.
				if (roww < 0 || coll < 0 || roww > m - 1 || coll > n - 1 || arr[roww][coll] <= arr[d[0]][d[1]] + 1
						|| arr[roww][coll] == 1) {
					continue;//go back to looping;
				}

				arr[roww][coll] = arr[d[0]][d[1]] + 1;
				//push this new location of roww and coll on to the queue, so that they help 
				//in calculating the distance of subsequent non 1 locations.
				queue.offer(new int[] { roww, coll });
			}
		}
		return arr;
	}

	public static void printMatrix(int[][] arr) {
		int[][] matrix = distanceFromOne(arr);
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				// matrix[row][col] - 1 :'-1' because we want to make distance of 1 from itself as 0 and also effect the
				//subsequent  distances of non '1' locations
				System.out.print(matrix[row][col] - 1 + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[][] arr = { { 0, 0, 0, 1 }, { 0, 0, 1, 1 }, { 0, 1, 1, 0 } };
		printMatrix(arr);
	}

}
