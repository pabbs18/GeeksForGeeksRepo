/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class LeftIndex {

	public static int binarySearch(int[] a, int x) {
		if (a == null || a.length == 0) {
			return -1;
		}

		int low = 0;
		int high = a.length - 1;

		return binarySearch(a, x, low, high);
	}

	public static int binarySearch(int[] a, int x, int low, int high) {

		if (low <= high) {
			if (a[low] == x) {
				return low;
			}

			int mid = low + (high - low) / 2;// This is very important
			if (x == a[mid]) {
				return binarySearch(a, x, low, mid - 1);
			}
			if (x < mid) {
				return binarySearch(a, x, low, mid - 1);
			}
			if (mid + 1 < a.length && a[mid + 1] == x) {
				return mid + 1;
			}

			return binarySearch(a, x, mid + 1, high);
		}
		return -1;
	}

	public static void main(String[] args) {
		//int[] a = { 1, 1, 2, 2, 3, 4, 5, 5, 6, 7 };
		//int[] a = { 1, 1, 2, 2, 2, 2, 2, 2, 2, 2 };
		//int[] a = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
		int[] a = { 1, 1, 1, 2, 3, 4, 5, 5, 6, 7 };
		System.out.println(binarySearch(a, 9));
	}

}
