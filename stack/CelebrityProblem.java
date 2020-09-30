package stack;

public class CelebrityProblem {

	public static boolean knows(int[][] matrix, int a, int b) {
		if (matrix[a][b] == 1) {
			return true;
		}
		return false;
	}

	public static int giveIfCelebrity(int[][] matrix, int n) {
		if (matrix.length == 0 || matrix == null) {
			return -1;
		}
		//find a possible candidate
		int i = 0, j = n - 1;
		while (i < j) {
			if (knows(matrix, i, j)) {
				i++;
			} else {
				j--;
			}
		}

		//Now i could be a possible candidate for being a celebrity

		for (int k = 0; k < n; k++) {
			if (k != i && (knows(matrix, k, i) == false || knows(matrix, i, k) == true)) {
				return -1;
			}
		}
		return i;

	}

	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 0 }, { 0, 0, 0 }, { 0, 1, 0 } };
		//int[][] matrix = { { 0, 1 }, { 1, 0 } };
		int n = matrix.length;
		System.out.println(giveIfCelebrity(matrix, n));

	}

}
