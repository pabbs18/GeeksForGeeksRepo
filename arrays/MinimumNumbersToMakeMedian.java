/**
 * 
 */
package arrays;

/**
	* @author Neha Gaur
	* @author Prabhanjan
	*/
public class MinimumNumbersToMakeMedian {

	public static int minNumbers(int[] a, int x) {
		if (a == null || a.length == 0) {
			return 0;
		}
		int n = a.length;
		int lowerThanX = 0;
		int higherThanX = 0;
		int equalToX = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] < x) {
				lowerThanX++;
			} else if (a[i] > x) {
				higherThanX++;
			} else if (a[i] == x) {
				equalToX++;
			}
		}

		int difference = Math.abs(lowerThanX - higherThanX);

		return difference + equalToX - 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}