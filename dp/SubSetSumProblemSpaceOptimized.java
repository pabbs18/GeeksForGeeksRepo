package dp;

public class SubSetSumProblemSpaceOptimized {

	public static boolean subSetSum(int[] arr) {
		if (arr == null || arr.length == 0) {
			return false;
		}
		int totalArraySum = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			totalArraySum += arr[i];
		}
		if ((totalArraySum % 2) != 0) {
			return false;
		}
		int target = totalArraySum / 2;
		return subSetSum(arr, target);
	}

	public static boolean subSetSum(int[] arr, int target) {
		int n = arr.length;
		boolean[] dp = new boolean[target + 1];
		for (int k = 0; k <= target; k++) {
			dp[k] = false;
		}

		dp[0] = true;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= target; j++) {
				if (dp[j] == false) {
					if (j >= arr[i]) {
						dp[j] = dp[j] || dp[j - arr[i]];
					}
				}
			}
		}
		return dp[target];
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 11, 5 };

		System.out.println(subSetSum(arr));

	}

}
