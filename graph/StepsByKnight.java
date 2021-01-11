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
 *         Need to practice this again
 * 
 */
public class StepsByKnight {
	//here knightPosition[] will be like knightPosition[2,3]
	public static int stepsByKnight(int[] knightPosition, int[] targetPosition, int n) {
		if (knightPosition[0] == targetPosition[0] && knightPosition[1] == targetPosition[1]) {
			return 0;//i.e no steps needed
		}

		//A queue to store the steps taken for the reference of future steps
		Queue<Cell> queue = new LinkedList<>();

		//A visited array to store the number of steps taken to reach each cell in the array
		int[][] visited = new int[n][n];

		int[] r = { -2, -2, 2, 2, -1, -1, 1, 1 };// all the 8 directions that a knight can move on a row
		int[] c = { -1, 1, -1, 1, 2, -2, -2, 2 };// all the 8 directions that a knight can move on a col

		//push the current position on the queue

		queue.offer(new Cell(knightPosition[0], knightPosition[1]));// wrap x,y into an object and push

		// mark the original location as visited
		//visited[knightPosition[0]][knightPosition[1]] = 1;

		while (!queue.isEmpty()) {
			Cell pos = queue.poll();

			//check if this position is the target position
			if (pos.x == targetPosition[0] && pos.y == targetPosition[1]) {
				for (int row = 0; row < n; row++) {
					for (int col = 0; col < n; col++) {
						System.out.print(visited[row][col] + " ");
					}
					System.out.println();
				}
				return visited[pos.x][pos.y];
			}

			//else check in all 8 directions
			for (int i = 0; i < 8; i++) {
				int row = pos.x + r[i];
				int col = pos.y + c[i];

				// if row , col are out of bounds, loop over

				if (row < 0 || col < 0 || row > n - 1 || col > n - 1) {
					continue;
				}
				// if a step has not been taken in the visited array
				if (visited[row][col] != 0) {
					continue;
				}

				//else increment step count by 1, by adding 1 to the value of
				//original position in all the 8 new locations in visited[][]
				visited[row][col] = visited[pos.x][pos.y] + 1;

				// push all 8 new positions to the queue
				queue.offer(new Cell(row, col));

			}
		}

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print(visited[row][col] + " ");
			}
			System.out.println();
		}
		return -1;
	}

	public static void main(String[] args) {
		int N = 6;
		int knightPos[] = { 1, 3 };
		int targetPos[] = { 5, 0 };
		System.out.println(stepsByKnight(knightPos, targetPos, N));
	}

}

class Cell {
	int x;
	int y;

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}
}