/**
 * 
 */
package arrays;

import java.util.TreeSet;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class MaximumProductOfIncreasingSubsequenceOfSize3 {

	public static void subsequences(int[] a) {
		if (a == null || a.length < 3) {
			return;
		}

		TreeSet<Integer> treeSetLeft = new TreeSet<>();

		int maxProduct = -1;
		int d = 0, b = 0, c = 0;

		for (int i = 0; i < a.length; i++) {
			int largestBeforeThis = getLargestBeforeThis(a, i, treeSetLeft);
			int largestAfterThis = getLargestAfterThis(a, i);

			int currentProduct = largestBeforeThis * a[i] * largestAfterThis;
			if ((currentProduct) > maxProduct) {
				maxProduct = currentProduct;
				d = largestBeforeThis;
				b = a[i];
				c = largestAfterThis;
			}
		}

		System.out.println(d + " " + b + " " + c);
	}

	public static int getLargestBeforeThis(int[] a, int endIndex, TreeSet<Integer> treeSet) {
		for (int i = 0; i < endIndex; i++) {
			treeSet.add(a[i]);
		}
		return treeSet.floor(a[endIndex]) == null ? 0 : treeSet.floor(a[endIndex]);

	}

	public static int getLargestAfterThis(int[] a, int beginIndex) {
		if (beginIndex == a.length - 1) {
			return 0;
		}
		int max = a[beginIndex];
		for (int i = beginIndex + 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 20, 10, 11, 12 };//{ 6, 7, 8, 1, 2, 3, 9, 10 };
		subsequences(a);
	}

}
