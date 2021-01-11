/**
 * 
 */
package graph;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class XTotalShapes {

	public static int totalXShapes(char[][] arr, int m, int n) {
		if (arr == null || m == 0 && n == 0) {
			return 0;
		}

		int count = 0;
		for (int row = 0; row < m; row++) {
			for (int col = 0; col < n; col++) {
				if (arr[row][col] == 'X') {
					dfs(arr, row, col, m, n);
					count++;
				}
			}
		}
		return count;
	}

	public static void dfs(char[][] arr, int row, int col, int m, int n) {
		if (row < 0 || col < 0 || row > m - 1 || col > n - 1 || arr[row][col] == 'O') {
			return;
		}
		arr[row][col] = 'O';// make x to o, so that this x is not considered again and again
		dfs(arr, row - 1, col, m, n);
		dfs(arr, row + 1, col, m, n);
		dfs(arr, row, col - 1, m, n);
		dfs(arr, row, col + 1, m, n);
	}

	public static void main(String[] args) {
		char[][] arr = { { 'O', 'O', 'O', 'O', 'X', 'X', 'O' }, { 'O', 'X', 'O', 'X', 'O', 'O', 'X' },
				{ 'X', 'X', 'X', 'X', 'O', 'X', 'O' }, { 'O', 'X', 'X', 'X', 'O', 'O', 'O' } };

		System.out.println(totalXShapes(arr, 4, 7));
	}

}
