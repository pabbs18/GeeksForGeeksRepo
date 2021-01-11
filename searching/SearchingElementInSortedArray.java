/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class SearchingElementInSortedArray {

	public static boolean binarySearch(int[] a, int x) {
		if (a == null || a.length == 0) {
			return false;
		}

		int low = 0;
		int high = a.length - 1;

		return binarySearch(a, x, low, high);
	}

	public static boolean binarySearch(int[] a, int x, int low, int high) {

		if (low <= high) {
			int mid = low + (high - low) / 2;// This is very important
			if (x == a[mid]) {
				return true;
			}
			if (x < mid) {
				return binarySearch(a, x, low, mid - 1);
			}

			return binarySearch(a, x, mid + 1, high);
		}
		return false;
	}

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5, 6 };
		System.out.println(binarySearch(a, 2));
	}

}
