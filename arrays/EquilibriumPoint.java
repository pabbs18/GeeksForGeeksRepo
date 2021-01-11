/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * https://leetcode.com/problems/find-pivot-index/solution/
 * 
 * Intuition and Algorithm

We need to quickly compute the sum of values to the left and the right of every index.

Let's say we knew S as the sum of the numbers, and we are at index i. 
If we knew the sum of numbers leftsum that are to the left of index i, 
then the other sum to the right of the index would just be S - nums[i] - leftsum.

As such, we only need to know about leftsum to check whether an index is a pivot index in constant time. 
Let's do that: as we iterate through candidate indexes i, we will maintain the correct value of leftsum
 */
public class EquilibriumPoint {

	public static int equilibriumPoint(int[] a) {
		if (a == null || a.length == 0) {
			return -1;
		}
		if (a.length == 1) {
			return 0;
		}

		if (a.length == 2) {
			return -1;
		}

		int totalSum = 0;
		int leftSum = 0;

		for (Integer i : a) {
			totalSum += i;
		}

		for (int i = 0; i < a.length; i++) {
			int rightSum = totalSum - (leftSum + a[i]);// totalSum = leftSum + rightSum + a[i]

			if (leftSum == rightSum) {
				return i;
			}
			leftSum += a[i];// leftSum size increases by 1 element
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };//{ -7, 1, 5, 2, -4, 3, 0 };
		System.out.println("EQ point: " + equilibriumPoint(a));

	}

}
