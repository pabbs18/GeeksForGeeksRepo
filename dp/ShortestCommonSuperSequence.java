package dp;

public class ShortestCommonSuperSequence {

	public static int shortestCommonSupSeq(String s1, String s2) {
		int n = s1 == null ? 0 : s1.length();
		int m = s2 == null ? 0 : s2.length();

		if (s1 == null && s2 == null || n == 0 && m == 0) {
			return 0;
		}
		if (s2 == null || m == 0) {
			return n;
		}
		if (s1 == null || n == 0) {
			return m;
		}
		int[][] dp = new int[m + 1][n + 1];

		for (int col = 0; col <= n; col++) {
			dp[0][col] = col;
		}

		for (int row = 0; row <= m; row++) {
			dp[row][0] = row;
		}

		for (int row = 1; row <= m; row++) {
			for (int col = 1; col <= n; col++) {
				if (s2.toLowerCase().charAt(row - 1) == s1.toLowerCase().charAt(col - 1)) {
					dp[row][col] = dp[row - 1][col - 1] + 1;
				} else {
					dp[row][col] = Math.min(dp[row - 1][col] + 1, dp[row][col - 1] + 1);
				}
			}
		}
		return dp[m][n];
	}

	public static void main(String[] args) {
		String s1 = "ABCBDAB";
		String s2 = "BDcaba";

		System.out.println(shortestCommonSupSeq(s1, s2));

	}

}
