package dp;

public class ReachAGivenScore {//Count ways to N'th Stair(Order does not matter) 
	public static int uniqueNumberOfWays(int score, int[] runs) {
		if (score < 0 || runs == null) {
			return 0;
		}

		int[] dp = new int[score + 1];

		dp[0] = 1;

		for (Integer run : runs) {
			for (int i = run; i <= score; i++) {
				dp[i] += dp[i - run];
			}
		}

		return dp[score];
	}

	public static void main(String[] args) {
		int[] runs = { 1, 2 };
		int numOfWays = uniqueNumberOfWays(5, runs);
		System.out.println(numOfWays);
	}

}
