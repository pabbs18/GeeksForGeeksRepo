package dp;

public class NthStair {
	public static int numberOfWaysForNthSair(int n, int[] stepsAtATime) {
		if (n < 0 || stepsAtATime.length == 0 || stepsAtATime == null) {
			return 0;
		}

		int[] dp = new int[n + 1];

		dp[0] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < stepsAtATime.length; j++) {
				if (stepsAtATime[j] <= i) {
					dp[i] += dp[i - stepsAtATime[j]];
				}
			}
		}
		return dp[n];
	}

	public static void main(String[] args) {
		int[] stepsAtATime = { 3, 5 };
		System.out.println(numberOfWaysForNthSair(11, stepsAtATime));

	}

}
