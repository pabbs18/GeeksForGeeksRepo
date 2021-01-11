/**
 * 
 */
package sorting;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class FloorInASortedArray {

	public static int floorInASortedArray(int[] a, int x) {
		if (a == null || a.length == 0) {
			return -1;
		}

		int low = 0;
		int high = a.length - 1;

		return floorInASortedArray(a, x, low, high);
	}

	public static int floorInASortedArray(int[] a, int x, int low, int high) {
		if (low <= high) {
			int mid = low + (high - low) / 2;

			if (x == a[mid]) {
				return a[mid];
			}

			if (x > a[mid]) {
				int val = floorInASortedArray(a, x, mid + 1, high);
				if (val == -1) {
					return a[mid];
				}
				return val;
			}

			if (x < a[mid]) {
				return floorInASortedArray(a, x, low, mid - 1);
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 8, 10, 11, 12, 19 };
		System.out.println(floorInASortedArray(a, 0));

	}

}
