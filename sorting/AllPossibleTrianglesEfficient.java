/**
 * 
 */
package sorting;

import java.util.Arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class AllPossibleTrianglesEfficient {

	public static int possbileTraingles(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int n = arr.length;
		int count = 0;
		Arrays.sort(arr);

		for (int i = 0; i < n - 2; i++) {// i stops at n-3
			int k = n - 1;

			for (int j = i + 1; j < n; j++) {

				while (k >= j && arr[i] + arr[j] <= arr[k]) {//property for being a triangle
					k--;
				}

				if (k > j) {
					count += k - j;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 200, 201, 202, 203, 204, 300 };
		System.out.println("Total number of triangles is " + possbileTraingles(arr));

	}

}
