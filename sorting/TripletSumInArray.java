/**
 * 
 */
package sorting;

import java.util.Arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class TripletSumInArray {

	public static boolean tripletSumInArray(int[] a, int x) {
		if (a == null || a.length == 0) {
			return false;
		}
		Arrays.sort(a);
		int n = a.length;
		for (int i = 0; i < n - 2; i++) {// i is n-2 since we dont want a[i] to be counted twice when i is at the last but one element
			int l = i + 1;
			int r = n - 1;
			while (l < r) {
				int sum = a[i] + a[l] + a[r];
				if (sum == x) {
					return true;
				}

				if (sum < x) {
					l++;
				} else {
					r--;
				}
			}

		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 45, 6, 10, 8 };
		int x = 13;
		System.out.println(tripletSumInArray(arr, x));

	}

}
