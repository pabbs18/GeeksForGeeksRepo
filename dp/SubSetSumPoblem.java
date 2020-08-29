package dp;

public class SubSetSumPoblem {

	//How can I use the elements of the given array one by one in combination
	//and achieve smaller targets which eventually leads me up to my bigger original target

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
		boolean[][] dp = new boolean[n + 1][target + 1];

		for (int row = 0; row <= n; row++) {
			dp[row][0] = true;
		}

		for (int col = 1; col <= target; col++) {
			dp[0][col] = false;
		}

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= target; col++) {

				//each cell value is calculated as: either use the array value OR not use the array value
				//Now copy the previous row value as it is// i.e not using the array value 
				dp[row][col] = dp[row - 1][col];

				// if it is true, it means the current target is achievable else not
				if (dp[row][col] == false) {
					//if the current target is greater than the current value, so that it can be subtracted from
					//Here we subtract because, that particular target value is reduced by an amount 
					//equal to the value of the array element
					if (col >= arr[row - 1]) {
						//subtract current array value from the current target value and get the corresponding 
						//dp table cell value and OR it with the existing dp cell value.
						dp[row][col] = dp[row][col] || dp[row - 1][col - arr[row - 1]];
					}
				}
			}
		}
		for (int row = 0; row <= n; row++) {
			for (int col = 0; col <= target; col++) {
				System.out.print(dp[row][col] + " | ");
			}
			System.out.println();
		}
		return dp[n][target];
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5 };

		System.out.println(subSetSum(arr));

		//subSetSum(arr);

	}

}
