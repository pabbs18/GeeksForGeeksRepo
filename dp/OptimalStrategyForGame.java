package dp;

public class OptimalStrategyForGame {
	public static int findMaxAmount(int[] arr) {

		if (arr == null || arr.length == 0) {
			return 0;
		}
		int n = arr.length;

		if (n == 1) {
			return arr[0];
		}

		if (n == 2) {
			return Math.max(arr[0], arr[1]);
		}

		int[][] dp = new int[n][n];

		for (int k = 0; k < n; k++) {
			for (int i = 0, j = k; j < n; i++, j++) {
				int x = i + 2 < n ? i + 2 : 0;
				int y = i + 1 < n ? i + 1 : 0;
				int z = j - 2 >= 0 ? j - 2 : 0;
				int w = j - 1 >= 0 ? j - 1 : 0;

				int ifIChooseIthIndex = arr[i] + Math.min(dp[x][j], dp[y][w]);

				int ifIChooseJthIndex = arr[j] + Math.min(dp[y][w], dp[i][z]);

				dp[i][j] = Math.max(ifIChooseIthIndex, ifIChooseJthIndex);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(dp[i][j] + " | ");
			}
			System.out.println();
		}
		return dp[0][n - 1];
	}

	public static void main(String[] args) {
		int[] arr = { 8, 15, 3, 7 };

		//findMaxAmount(arr);
		System.out.println("\n Max profit: " + findMaxAmount(arr));
	}
}
