package dp;

public class KadaneAlgorithm2 {

	public static int maxContiguousSubArraySum(int[] arr) {
		if (arr.length == 0 || arr == null) {
			return 0;
		}
		//For even indexes
		int maxSoFar1 = arr[0];
		int maxEndingHere1 = arr[0];

		for (int i = 2; i < arr.length; i = i + 2) {
			maxEndingHere1 = Math.max(arr[i], maxEndingHere1 + arr[i]);
			maxSoFar1 = Math.max(maxSoFar1, maxEndingHere1);
		}

		//For Odd Indexes
		int maxSoFar2 = arr[1];
		int maxEndingHere2 = arr[1];

		for (int i = 3; i < arr.length; i = i + 2) {
			maxEndingHere2 = Math.max(arr[i], maxEndingHere2 + arr[i]);
			maxSoFar2 = Math.max(maxSoFar2, maxEndingHere2);
		}

		return Math.max(maxSoFar1, maxSoFar2);
	}

	public static void main(String[] args) {
		int[] arr = { -9, -8, 8, 3, -4 };
		System.out.println(maxContiguousSubArraySum(arr));

	}

}
