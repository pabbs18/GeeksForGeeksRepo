/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class WhoHasTheMajority {

	public static int majority(int[] a, int x, int y) {
		if (a == null || a.length == 0) {
			return 0;
		}

		int xCount = 0;
		int yCount = 0;

		for (Integer i : a) {
			if (i == x) {
				xCount++;
			} else if (i == y) {
				yCount++;
			}
		}

		if (xCount == yCount) {
			return Math.min(x, y);
		}

		return Math.max(xCount, yCount);
	}

	public static void main(String[] args) {
		/* int[] a = { 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5 };
		 * int x = 4, y = 5; */

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int x = 1, y = 7;

		System.out.println(majority(a, x, y));
	}

}
