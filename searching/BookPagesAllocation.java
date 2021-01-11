/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * REVISIT THIS PROBLEM. IT IS NOT STRAIGHT FORWARD
 * 
 * https://www.youtube.com/watch?v=Ss9ta1zmiZo&t=168s
 * 
 * https://www.youtube.com/watch?v=EM4WMDhzcC8
 * 
 * 
 * 
 */
public class BookPagesAllocation {

	public static int binarySearch(int[] a, int n, int m) {
		if (a == null || a.length == 0) {
			return -1;
		}

		if (n < m) {
			return -1;
		}

		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += a[i];
		}

		int start = 0;
		int end = sum;
		int ans = Integer.MAX_VALUE;

		while (start <= end) {

			int mid = end + (start - end) / 2;

			if (isPossibleToFit(a, n, m, mid)) {//try to minimize from the right

				ans = Math.min(ans, mid);

				end = mid - 1;

			} else {
				start = mid + 1;
			}
		}

		return ans;
	}

	public static boolean isPossibleToFit(int[] a, int n, int m, int curMin) {
		int numberOfStudents = 1;
		int currSum = 0;

		for (int i = 0; i < n; i++) {

			if (a[i] > curMin) {
				return false;
			}

			if (currSum + a[i] > curMin) {
				numberOfStudents++;

				currSum = a[i];// allocate the new book to new student

				if (numberOfStudents > m) {
					return false;
				}

			} else {
				currSum += a[i];
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40 };
		int n = a.length;
		int m = 2;
		System.out.println("Max Pages one of the students will have to read: " + binarySearch(a, n, m));

	}

}
