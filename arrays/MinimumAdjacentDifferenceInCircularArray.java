/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class MinimumAdjacentDifferenceInCircularArray {

	public static int minDifference(int[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}
		int n = a.length;
		int minDiff = Integer.MAX_VALUE;
		int curDiff = 0;

		for (int i = 0; i < n - 1; i++) {
			curDiff = Math.abs(a[i] - a[i + 1]);
			minDiff = Math.min(minDiff, curDiff);
		}

		curDiff = Math.abs(a[0] - a[n - 1]);
		minDiff = Math.min(minDiff, curDiff);

		return minDiff;

	}

	public static void main(String[] args) {
		int[] a = { 10, -3, -4, 7, 6, 5, -4, -1 };//{ 8, -8, 9, -9, 10, -11, 12 };
		System.out.println(minDifference(a));

	}

}
