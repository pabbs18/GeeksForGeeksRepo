/**
 * 
 */
package sorting;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class CloserToSort {

	public static boolean CloserToSort(int[] a, int x) {
		if (a == null || a.length == 0) {
			return false;
		}

		int low = 0;
		int high = a.length - 1;

		return CloserToSort(a, x, low, high);
	}

	public static boolean CloserToSort(int[] a, int x, int low, int high) {

		if (low <= high) {
			int mid = low + (high - low) / 2;
			if (x == a[mid]) {
				return true;
			}

			if (mid > low && x == a[mid - 1]) {//mid> low cuz lets say first element is mid. The mid-1 will be out of bounds
				return true;
			}

			if (high > mid && x == a[mid + 1]) {//high > mid cuz lets say last element is mid. The mid+1 will be out of bounds
				return true;
			}

			if (x < a[mid]) {
				return CloserToSort(a, x, low, mid - 2);
			}

			return CloserToSort(a, x, mid + 2, high);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = { 3, 2, 10, 4, 40 };
		System.out.println(CloserToSort(a, 5));
	}

}
