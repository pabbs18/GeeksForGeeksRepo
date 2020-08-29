package dp;

public class NumberOfUniquePaths {
	public static int numOfUniqPaths(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		if (matrix == null) {
			return 0;
		}
		if (m == 1 || n == 1) {
			return 1;
		}
		for (int row = 0; row < m; row++) {
			matrix[row][0] = 1;
		}
		for (int col = 1; col < n; col++) {
			matrix[0][col] = 1;
		}
		for (int row = 1; row < m; row++) {
			for (int col = 1; col < n; col++) {
				matrix[row][col] = matrix[row - 1][col] + matrix[row][col - 1];
			}
		}
		return matrix[m - 1][n - 1];
	}

	public static void main(String[] args) {
		int[][] matrix = new int[2][2];
		System.out.println(numOfUniqPaths(matrix));

	}

}
