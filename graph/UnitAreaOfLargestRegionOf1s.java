/**
 * 
 */
package graph;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * 
 */
public class UnitAreaOfLargestRegionOf1s {

	public static int findLargetRegionOf1s(int[][] arr) {
		if (arr == null) {
			return 0;
		}
		int m = arr.length;
		int n = arr[0].length;

		int maxRegionValue = 0;

		for (int row = 0; row < m; row++) {
			for (int col = 0; col < n; col++) {
				if (arr[row][col] == 1) {
					int count = 1;
					count = dfs(row, col, m, n, arr, count);
					maxRegionValue = Math.max(count, maxRegionValue);
				}
			}
		}
		return maxRegionValue;
	}

	public static int dfs(int row, int col, int m, int n, int[][] arr, int count) {
		if (row < 0 || col < 0 || row > m - 1 || col > n - 1 || arr[row][col] == 0) {
			return 0;
		}
		arr[row][col] = 0; //make this location from 1 to 0, so that its not considered again

		//Each time its a successful check, increase count by 1 and check in all 8 directions(add their results to our current count)
		return 1 + (dfs(row - 1, col, m, n, arr, count) + //up
				dfs(row + 1, col, m, n, arr, count) + //down
				dfs(row, col - 1, m, n, arr, count) + //left
				dfs(row, col + 1, m, n, arr, count) + //right
				dfs(row - 1, col - 1, m, n, arr, count) + //up-left
				dfs(row - 1, col + 1, m, n, arr, count) + //up-right
				dfs(row + 1, col - 1, m, n, arr, count) + //down-left		
				dfs(row + 1, col + 1, m, n, arr, count));//down-right

	}

	public static void main(String[] args) {
		int M[][] = { { 0, 0, 1, 1, 0 }, { 1, 0, 1, 1, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1 } };

		System.out.println(findLargetRegionOf1s(M));

	}

}
