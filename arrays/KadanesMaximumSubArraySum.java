/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * https://www.youtube.com/watch?v=VMtyGnNcdPw
 */
public class KadanesMaximumSubArraySum {

	public static int maximumSubArraySum(int[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}

		int currBest = a[0];
		int overAllBest = a[0];

		for (int i = 1; i < a.length; i++) {
			if (currBest >= 0) {
				currBest += a[i];
			} else {
				currBest = a[i];
			}
			if (currBest > overAllBest) {
				overAllBest = currBest;
			}
		}
		return overAllBest;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, -2, 5 };
		System.out.println(maximumSubArraySum(a));

	}

}
