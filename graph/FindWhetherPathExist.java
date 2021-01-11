/**
 * 
 */
package graph;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class FindWhetherPathExist {

	public static boolean pathExists(int[][] arr) {
		if (arr == null || arr.length == 0) {
			return false;
		}
		int m = arr.length;
		for (int row = 0; row < m; row++) {
			for (int col = 0; col < m; col++) {
				if (arr[row][col] == 1) {
					if (dfs(row, col, arr) == true) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static boolean dfs(int row, int col, int[][] arr) {
		if (row < 0 || col < 0 || row > arr.length - 1 || col > arr.length - 1 || arr[row][col] == 3
				|| arr[row][col] == 1)// checking for '1' here, else it leads to stackoverflow error
									//since it starts over from 1 again and again
		{
			return false;
		}
		if (arr[row][col] == 2)

		{
			return true;
		}
		return

		dfs(row - 1, col, arr) || //up
				dfs(row + 1, col, arr) || //down
				dfs(row, col - 1, arr) || //left
				dfs(row, col + 1, arr);//right

	}

	public static void main(String[] args) {
		//int[][] arr = { { 3, 0, 0, 0 }, { 0, 3, 3, 0 }, { 0, 1, 0, 3 }, { 0, 2, 3, 3 } };
		int[][] arr = { { 3, 0, 2 }, { 0, 3, 3 }, { 1, 3, 3 } };
		if (pathExists(arr)) {
			System.out.println("Path Exists");
		} else {
			System.out.println("Path doesn't Exist");
		}
	}

}
