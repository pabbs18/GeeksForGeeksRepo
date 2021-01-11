/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * Start with the standard binary search code.
 * And then modify accordingly.
 */
public class Count1sInBinaryArray {

	public static int count1sInBinaryArray(int[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}

		int low = 0;
		int high = a.length - 1;

		return count1sInBinaryArray(a, low, high);
	}

	public static int count1sInBinaryArray(int[] a, int low, int high) {

		if (low <= high) {

			System.out.println();

			if (low == high) {
				if (a[low] == 0) {
					System.out.println("0 :low == high");
					return low;
				}
				System.out.println("1 :low == high");
				return low + 1;
			}

			int mid = low + (high - low) / 2;// This is very important
			System.out.print("Low: " + low + " ");
			System.out.print("Mid: " + mid + " ");
			System.out.print("High: " + high + " ");

			if (a[mid] == 1) {
				return count1sInBinaryArray(a, mid + 1, high);
			}
			return count1sInBinaryArray(a, low, mid - 1);
		}

		return a.length;

	}

	public static void main(String[] args) {
		// 0  1  2  3  4  5  6  7
		//int a[] = { 1, 1, 0, 0, 0, 0, 0, 0 };
		//int a[] = { 1, 1, 1, 1, 1, 0, 0, 0 };
		//int a[] = { 0, 0, 0, 0, 0, 0, 0, 0 };
		int a[] = { 1, 1, 1, 1, 1, 1, 1, 1 };
		//int a[] = { 1, 0, 0, 0, 0, 0, 0, 0 };
		System.out.println("Count of 1: " + count1sInBinaryArray(a));

	}

}
