/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class PeakElement {

	public static int peakElement(int[] a) {
		if (a == null || a.length == 0) {
			return -1;
		}
		int low = 0;
		int high = a.length - 1;

		return peakElement(a, low, high);
	}

	public static int peakElement(int[] a, int low, int high) {

		if (low <= high) {
			if (low == high) {// we hae cornered to one element, either first or last
				//log
				System.out.println("Peak Element: " + a[low]);
				return low;
			}
			int mid = low + (high - low) / 2;

			if (a[mid + 1] > a[mid]) {
				return peakElement(a, mid + 1, high);
			}

			if (a[mid - 1] > a[mid]) {
				return peakElement(a, low, mid - 1);
			}
			System.out.println("Peak Element: " + a[mid]);
			return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		//int[] a = { 10, 20, 15, 2, 23, 90, 67 };
		//int[] a = { 10, 20, 25, 27, 33, 90, 91 };
		//int[] a = { 910, 820, 725, 627, 533, 490, 391 };
		int[] a = { 1, 1, 1, 1, 1, 1, 1 };
		System.out.println(peakElement(a));
	}

}
