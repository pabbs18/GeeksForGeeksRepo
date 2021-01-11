/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class CheckIfArrayIsSortedAndRotated {

	public static boolean check(int[] a) {
		if (a == null || a.length == 0) {
			return false;
		}
		int n = a.length;
		//if already sorted
		if (isSorted(a)) {
			return false;
		}

		//index of the smallest element
		int minimumIndex = findSmallestElementIndex(a);

		/* //log
		 * System.out.println("Min Index:" + minimumIndex); */

		reverse(a, 0, minimumIndex);

		/* //log
		 * print(a);
		 * System.out.println(); */

		reverse(a, minimumIndex, n);

		/* //log
		 * print(a);
		 * System.out.println(); */

		reverse(a, 0, n);

		/* //log
		 * print(a);
		 * System.out.println(); */

		//now if the array is sorted
		if (isSorted(a)) {
			return true;
		}
		return false;
	}

	public static int findSmallestElementIndex(int[] a) {
		int minIndex = 0;
		int minValue = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < minValue) {
				minValue = a[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static boolean isSorted(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
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

	//log
	public static void print(int[] a) {
		for (Integer i : a) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 3, 4, 6, 1, 2, 5 };//{ 1, 2, 3 };//{ 7, 9, 11, 12, 5 };//{ 3, 4, 5, 1, 2 };
		System.out.println(check(a));

	}

}
