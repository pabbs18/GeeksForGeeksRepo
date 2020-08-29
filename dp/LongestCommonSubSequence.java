package dp;

public class LongestCommonSubSequence {
	public static int lcs(String s1, String s2) {
		if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) {
			return 0;
		}

		int[][] dp = new int[s1.length() + 1][s2.length() + 1];

		dp[0][0] = 0;

		for (int col = 1; col <= s1.length(); col++) {
			dp[0][col] = 0;
		}

		for (int row = 1; row <= s2.length(); row++) {
			dp[row][0] = 0;
		}

		for (int row = 1; row <= s2.length(); row++) {
			for (int col = 1; col <= s1.length(); col++) {
				/*System.out.println(
						"s2.charAt(row - 1): " + s2.charAt(row - 1) + "; s1.charAt(col - 1): " + s1.charAt(col - 1));
				*/if (s2.charAt(row - 1) == s1.charAt(col - 1)) {
					dp[row][col] = 1 + dp[row - 1][col - 1];
				} else {
					dp[row][col] = Math.max(dp[row - 1][col], dp[row][col - 1]);
				}
			}
		}

		for (int row = 0; row <= s2.length(); row++) {
			for (int col = 0; col <= s1.length(); col++) {
				System.out.print(dp[row][col] + " ");
			}
			System.out.println();
		}
		return dp[s1.length()][s2.length()];

	}

	public static void main(String[] args) {
		String s1 = "ABCDGH";
		String s2 = "AEDFHR";

		System.out.println(lcs(s1, s2));

	}

}
