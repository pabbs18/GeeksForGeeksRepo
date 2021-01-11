/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class ArrayRotation {

	public static void rotate(int[] a, int k) {
		if (a == null || a.length == 0) {
			return;
		}
		int n = a.length;
		reverse(a, 0, n - k);

		//log
		print(a);
		System.out.println();

		reverse(a, n - k, n);

		//log
		print(a);
		System.out.println();

		reverse(a, 0, n);

		print(a);
	}

	public static void reverse(int[] a, int first, int last) {
		int start = first;
		int end = last - 1;

		while (start < end) {
			swap(a, start, end);
			start++;
			end--;
		}
		return;
	}

	public static void swap(int[] a, int start, int end) {
		int temp = a[start];
		a[start] = a[end];
		a[end] = temp;
	}

	public static void print(int[] a) {
		for (Integer i : a) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		rotate(a, 2);
	}

}
