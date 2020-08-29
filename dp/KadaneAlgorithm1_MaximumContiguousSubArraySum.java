package dp;

public class KadaneAlgorithm1_MaximumContiguousSubArraySum {
	public static int maxSubArraySum(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		int maxSoFar = arr[0];
		int maxEndingHere = arr[0];

		for (int i = 1; i < arr.length; i++) {
			//	 newMaxEndingHere           start    , consider the result previously         
			//    (at this current          a new	 , calculated till the last position 	
			//     position) ;     == 		subArray; , and add the current value for the current position	
			maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);

			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

	public static void main(String[] args) {
		int[] arr = { 5, -2, -3, 32, -5, 65 };
		System.out.println(maxSubArraySum(arr));

	}

}
