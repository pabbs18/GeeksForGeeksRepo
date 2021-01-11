/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class MaxAndSecondMax {

	public static void MaxAndSecondMax(int[] a) {
		if (a == null || a.length == 0) {
			return;
		}

		int max = Integer.MIN_VALUE;
		int sMax = Integer.MIN_VALUE;

		for (Integer i : a) {
			if (i > max) {
				max = i;
			}
		}

		System.out.println("Max: " + max);

		for (Integer j : a) {
			if (j > sMax) {
				if (j < max) {
					sMax = j;
				}
			}
		}

		System.out.println("Second Max: " + sMax);
	}

	public static void main(String[] args) {
		int[] a = { 2, 1, 2 };
		MaxAndSecondMax(a);

	}

}
