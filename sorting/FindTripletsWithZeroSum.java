/**
 * 
 */
package sorting;

import java.util.Arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class FindTripletsWithZeroSum {

	public static boolean tripletsWithZeroSum(int[] a) {
		if (a == null || a.length == 0) {
			return false;
		}
		int n = a.length;
		boolean flag = false;
		Arrays.sort(a);
		for (int i = 0; i < n - 1; i++) {

			int left = i + 1;
			int right = n - 1;

			while (left < right) {
				if (a[i] + a[left] + a[right] == 0) {
					flag = true;
					System.out.print(a[i] + " , " + a[left] + " ," + a[right]);
					left++;
					right--;
					System.out.println();

				} else if (a[i] + a[left] + a[right] < 0) {
					//move left
					left++;
				} else {
					//move right
					right--;
				}
			}
			System.out.println();
		}

		if (flag == false) {
			System.out.println("No triplets with 0 sum");
		}

		return flag;
	}

	public static void main(String[] args) {
		int arr[] = { 0, -1, 2, -3, 1 };
		// -3  -1  0   1   1  1  2

		System.out.println(tripletsWithZeroSum(arr));
	}

}
