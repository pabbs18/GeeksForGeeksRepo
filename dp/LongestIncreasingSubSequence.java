package dp;

public class LongestIncreasingSubSequence {

	public static int longestIncreasingSubsequence(int[] arr) {
		int n = arr.length;
		if (arr == null || n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		int[] lengthArr = new int[n];

		for (int i = 0; i < n; i++) {
			lengthArr[i] = 1;
		}

		int longestLength = lengthArr[0];

		for (int i = 1; i < n; i++) {

			for (int j = 0; j < i; j++) {

				if (arr[i] > arr[j]) {
					System.out.println("arr[" + i + "]:" + arr[i] + " > arr[" + j + "]:" + arr[j]);
					if (lengthArr[j] + 1 > lengthArr[i]) {
						System.out
								.println("lengthArr[j] + 1: " + (lengthArr[j] + 1) + " lengthArr[i]: " + lengthArr[i]);
						lengthArr[i] = lengthArr[j] + 1;
					}
				}
			}
			System.out.println("lengthArr[" + i + "]:" + lengthArr[i]);
			System.out.println();
			longestLength = Math.max(longestLength, lengthArr[i]);
		}

		return longestLength;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };

		System.out.println(longestIncreasingSubsequence(arr));

	}

}
