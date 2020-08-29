package dp;

//https://leetcode.com/problems/house-robber/discuss/156523/From-good-to-great.-How-to-approach-most-of-DP-problems.
public class SticklerThief {
	public static int rob(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int[] dp = new int[nums.length + 1];

		//if 0 houses, no robbing possible
		dp[0] = 0;
		//if only one house, then just rob its goods
		dp[1] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			//you have two choices. If you rob current house, you rob curr-2 houses and behind that in this pattern.
			//if you don't rob the current house, you rob curr-1 house and all behind it in this particular pattern.
			dp[i + 1] = Math.max(nums[i] + dp[i - 1], dp[i]);
		}
		return dp[nums.length];
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		System.out.println(rob(nums));

	}

}
