package dp;

public class TotalUniqueWaysToMakeChangeSpaceOptimised {

	public static int totalWays(int amount) {//also Question: Ways to write n as sum 
		if (amount < 1) {
			return amount;
		}

		int[] coins = new int[amount - 1];
		for (int i = 0; i < coins.length; i++) {
			coins[i] = i + 1;
		}

		return totalWays(coins, amount);
	}

	public static int totalWays(int[] coins, int amount) {
		int[] dp = new int[amount + 1];

		dp[0] = 1;

		for (int i = 1; i < dp.length; i++) {
			dp[i] = 0;
		}

		for (int j = 0; j < coins.length; j++) {
			int coinValue = coins[j];
			int withOutUsingThisCoin = 0;
			int withUsingThisCoin = 0;
			for (int i = 1; i < dp.length; i++) {
				withOutUsingThisCoin = dp[i];

				if (i >= coinValue) {
					withUsingThisCoin = dp[i - coinValue];
				}

				dp[i] = withOutUsingThisCoin + withUsingThisCoin;
			}
		}

		return dp[amount];
	}

	public static void main(String[] args) {
		System.out.println(totalWays(6));

	}

}
