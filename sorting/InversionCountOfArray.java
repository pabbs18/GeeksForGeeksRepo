/**
 * 
 */
package sorting;

import java.util.Arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * 
 *  FOUND THIS TRICKY
 * 
 * 
 * 
 * do a merge sort. 
 * In the function to merge two sorted arrays, while checking if an element in the left half is 
 * greater than an element in right half, add to the inversion count.
 * 
 * Algorithm: 

    1.The idea is similar to merge sort,
     divide the array into two equal or almost equal halves in each step until the base case is reached.
    2.Create a function merge that counts the number of inversions when two halves of the array are merged,
     create two indices i and j, i is the index for first half and j is an index of the second half. 
     if a[i] is greater than a[j], then there are (mid – i) inversions. 
     because left and right subarrays are sorted, 
     so all the remaining elements in left-subarray (a[i+1], a[i+2] … a[mid]) will be greater than a[j].
    3.Create a recursive function to divide the array into halves 
    and find the answer by summing the number of inversions is the first half, 
    number of inversion in the second half and the number of inversions by merging the two.
    The base case of recursion is when there is only one element in the given half.
    Print the answer
 */
public class InversionCountOfArray {

	public static int mergeSortAndCount(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int low = 0;
		int high = arr.length - 1;

		return sortArrayHalves(arr, low, high);
	}

	public static int sortArrayHalves(int[] arr, int low, int high) {

		int count = 0;
		if (low < high) {
			int mid = (low + high) / 2;

			count += sortArrayHalves(arr, low, mid);

			count += sortArrayHalves(arr, mid + 1, high);

			count += mergeSortedHalves(arr, low, mid, high);
		}

		return count;
	}

	public static int mergeSortedHalves(int[] arr, int low, int mid, int high) {

		int inversionCount = 0;

		int[] firstHalf = Arrays.copyOfRange(arr, low, mid + 1);
		int[] secondHalf = Arrays.copyOfRange(arr, mid + 1, high + 1);

		int i = 0;
		int j = 0;
		int k = low;
		while (i < firstHalf.length && j < secondHalf.length) {
			if (firstHalf[i] <= secondHalf[j]) {
				arr[k++] = firstHalf[i++];
			} else {
				System.out.println("firstHalf[i] :" + firstHalf[i]);
				System.out.println("secondHalf[j] :" + secondHalf[j]);
				arr[k++] = secondHalf[j++];
				inversionCount += (mid + 1) - (low + i);
			}
		}
		return inversionCount;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 20, 6, 4, 5 };

		System.out.println(mergeSortAndCount(arr));

	}

}
