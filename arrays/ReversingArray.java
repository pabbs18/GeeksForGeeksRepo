/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class ReversingArray {

	public static int[] reverse(int[] a) {
		if (a == null || a.length == 0) {
			return null;
		}
		int n = a.length;

		for (int i = 0; i < n / 2; i++) {
			swap(a, i, n - 1 - i);
		}

		return a;
	}

	public static void swap(int[] a, int fromIndex, int toIndex) {
		int temp = a[fromIndex];
		a[fromIndex] = a[toIndex];
		a[toIndex] = temp;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };//, 6 };
		int[] res = reverse(a);

		for (Integer i : res) {
			System.out.print(i + " ");
		}

	}

}
