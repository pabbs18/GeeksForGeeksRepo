package dummy;

import java.util.Arrays;

public class Solution {
	public static int lengthOfLIS(int[] nums) {
		int[] dp = new int[nums.length];
		int len = 0;
		for (int num : nums) {
			System.out.println("Array element: " + num);
			int i = Arrays.binarySearch(dp, 0, len, num);
			System.out.println("After Binary Searching, Index i of num: " + num + " is :" + i);
			if (i < 0) {
				System.out.println("Now apparently i is less than 0");
				i = -(i + 1);
				System.out.println("After modification i.e -(i+1), i is now: " + i);
			}

			dp[i] = num;
			System.out.println("dp[" + i + "] :" + num);
			if (i == len) {
				System.out.println("Now i = len");
				System.out.println("Index :" + i + " = length: " + len);
				len++;
				System.out.println("length now increased to :" + len);
			}
			System.out.println();
		}
		return len;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 8, 4, 12, 2 };
		System.out.println("Final length: " + lengthOfLIS(nums));

	}

}
