/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan 
 * 
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/solution/
 * 
 */
public class MinimumNumberInSortedRotatedArray {

	public static int binarySearch(int[] a) {
		if (a == null || a.length == 0) {
			return -1;
		}
		int low = 0;
		int high = a.length - 1;
		//first check if there is any rotation to beign with

		if (a[low] < a[high]) {
			return a[low];
		}

		return binarySearch(a, low, high);
	}

	//if the array is rotated, a[low] will be greater than a[high]
	//The inflection point at which the lowest element starts
	//The left of inflection point will be elements greater than a[low]
	//Right of inflection point will be the elements less than a[low] 
	public static int binarySearch(int[] a, int low, int high) {
		if (low <= high) {
			int mid = low + (high - low) / 2;

			if ((mid + 1) < a.length && a[mid] > a[mid + 1]) {
				return a[mid + 1];
			}
			if ((mid - 1) < a.length && a[mid - 1] > a[mid]) {
				return a[mid];
			}
			if (a[mid] > a[low]) {//mid is to the left of inflection point 
				//search in right
				return binarySearch(a, mid + 1, high);
			}
			if (a[mid] < a[low]) {//mid is to the right of inflection point. Search from low to mid
				return binarySearch(a, low, mid);
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		//int[] a = //{ 3, 4, 5, 1, 2 };
		int[] a = { 10, 20, 30, 40, 50, 5, 7 };//{ 4, 5, 1, 2, 3 };//{ 2, 3, 4, 5, 6, 7, 8, 9, 10, 1 };
		System.out.println(binarySearch(a));

	}

}
