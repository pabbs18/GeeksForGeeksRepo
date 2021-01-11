/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * FUCKING PROBLEM
 * 
 * https://www.geeksforgeeks.org/three-way-partitioning-of-an-array-around-a-given-range/
 */
public class ThreeWayPartitioning {

	public static void partition(int[] a, int low, int high) {
		if (a == null || a.length == 0) {
			return;
		}
		int n = a.length;
		int start = 0;
		int end = n - 1;
		print(a);
		System.out.println();

		for (int i = 0; i <= end;) {

			if (a[i] < low) {
				int temp = a[start];
				a[start] = a[i];
				a[i] = temp;
				start++;
				print(a);
				System.out.println();
				i++;
			}

			else if (a[i] > high) {

				int temp = a[end];
				a[end] = a[i];
				a[i] = temp;
				end--;
				print(a);
				System.out.println();

			} else {
				i++;
			}
		}

		print(a);
		return;
	}

	public static void print(int[] a) {
		for (Integer i : a) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32 };
		partition(a, 14, 20);
	}

}
