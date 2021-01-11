/**
 * 
 */
package graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class RottenOranges {

	static class Pair {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static int rotOranges(int[][] arr) {
		if (arr == null) {
			return 0;
		}

		Queue<Pair> queue = new LinkedList<>();

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if (arr[row][col] == 2) {
					queue.offer(new Pair(row, col));
				}
			}
		}
		//add a delimiter
		queue.offer(null);

		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		int counter = 0;
		while (!queue.isEmpty()) {
			if (queue.peek() == null) {
				queue.poll();
				counter++;
				queue.offer(null);
			}
			// if you encounter back to back nulls, it means no more locations 
			//present in the queue and the last rotten orange pushed had no fresh orange 
			//neighbors. So the counter increased by it is decreased and we come out of the loop.
			if (queue.peek() == null) {
				counter--;
				break;
			}
			Pair location = queue.poll();

			for (int[] dir : directions) {
				int row = location.x + dir[0];
				int col = location.y + dir[1];
				if (row < 0 || row > arr.length - 1 || col < 0 || col > arr[0].length - 1) {
					continue;
				}
				if (arr[row][col] == 1) {
					// rot the orange by changing neighboring 1 to 2
					arr[row][col] = 2;
					// push the newly rotten orange location to the queue
					// so that it can rot its own neighbors inthe next pass
					queue.offer(new Pair(row, col));
				}
			}

		}
		return counter;
	}

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 2, 1, 0, 2, 1 }, { 1, 0, 1, 2, 1 }, { 1, 0, 0, 2, 1 } };
		System.out.println("Total time unit needed: " + rotOranges(arr));
	}

}
