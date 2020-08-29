package dp;

public class TotalUniqueWaysToMakeChange {

	public static int totalWays(int[] coins, int amount) {
		if (amount < 1) {
			return amount;
		}

		int[][] dp = new int[coins.length + 1][amount + 1];

		dp[0][0] = 1;

		for (int row = 1; row < dp.length; row++) {
			dp[row][0] = 1;
		}

		for (int col = 1; col < dp[0].length; col++) {
			dp[0][col] = 0;
		}

		for (int row = 1; row < dp.length; row++) {
			for (int col = 1; col < dp[0].length; col++) {
				int coinValue = coins[row - 1];
				int withUsingThisCoin = 0;
				int withOutUsingThisCoin = 0;
				withOutUsingThisCoin = dp[row - 1][col];
				if (col >= coinValue) {
					withUsingThisCoin = dp[row][col - coinValue];
				}
				dp[row][col] = withOutUsingThisCoin + withUsingThisCoin;
			}
		}
		return dp[coins.length][amount];
	}

	public static void main(String[] args) {
		int[] coins = { 1, 2, 3, 4, 5 };
		System.out.println(totalWays(coins, 6));

	}

}
