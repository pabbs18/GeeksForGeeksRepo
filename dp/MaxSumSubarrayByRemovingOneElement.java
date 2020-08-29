package dp;

public class MaxSumSubarrayByRemovingOneElement {

	public static int maxSubArraySum(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		int n = arr.length;

		/*calculate the maxSumSubarray in the forward direction
		i.e  this will give us the maxValue at each of the A[i-1] position*/

		//int maxEndingHere = arr[0];
		int maxSoFar = arr[0];

		int[] forward = new int[n];
		forward[0] = arr[0];

		for (int i = 1; i < n; i++) {
			forward[i] = Math.max(arr[i], forward[i - 1] + arr[i]);

			maxSoFar = Math.max(forward[i], maxSoFar);
		}

		/*calculate the maxSumSubarray in the backward direction starting from the last position
			i.e  this will give us the maxValue at each of the A[i+1] position*/

		int[] backward = new int[n];

		backward[n - 1] = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			backward[i] = Math.max(arr[i], backward[i + 1] + arr[i]);
		}

		/* sum of subarray ending at A[i-1] and starting at A[i+1] gives us our answer
		 which will be greater than or equal to maxSumSubarry without deleting 
		 the A[i]th element.
		 We do this by skipping the i'th coincided element by placing  forward array
		 on top of the backward array, and calculating the sum of [i-1]th element from 
		 forward array and [i+1]th element in the backward array*/

		for (int i = 1; i < n - 1; i++) {
			maxSoFar = Math.max(maxSoFar, forward[i - 1] + backward[i + 1]);
		}

		return maxSoFar;

	}

	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		System.out.println(maxSubArraySum(arr));

	}

}
