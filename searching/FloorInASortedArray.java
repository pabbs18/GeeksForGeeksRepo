/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class FloorInASortedArray {

	public static int floor(int[] a, int x) {
		if (a == null || a.length == 0) {
			return -1;
		}
		int low = 0;
		int high = a.length - 1;

		return floor(a, low, high, x);
	}

	public static int floor(int[] a, int low, int high, int x) {
		if (low <= high) {
			if (low == high) {
				if (a[low] > x && low - 1 >= 0) {
					//log
					System.out.println("low minus one floor: " + a[low - 1]);
					return low - 1;
				}
				if (a[low] <= x) {
					//log
					System.out.println("low floor: " + a[low]);
					return low;
				}
			}
			int mid = low + (high - low) / 2;

			if (x > a[mid]) {
				return floor(a, mid + 1, high, x);
			}

			if (x < a[mid]) {
				return floor(a, low, mid - 1, x);
			}
			//log
			System.out.println("mid floor: " + a[mid]);
			return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 8, 10, 11, 12, 19 };
		System.out.println(floor(a, 200));
	}

}
