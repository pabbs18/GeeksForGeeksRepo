/**
 * 
 */
package sorting;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * This is a divide and conquer sorting.
 * If there are at least 2 elements, assign a pivot to one element. 
 * Partition it. This gives the deserving position of the pivot in the array.
 * Recursively sort the elements before and elements after the pivot.
 * 
 * O(n^2)
 */
public class QuickSort {

	public static void quickSort(int[] arr) {

		int low = 0;
		int high = arr.length - 1;
		System.out.println("Calling QS");
		quickSort(arr, low, high);
	}

	public static void quickSort(int[] arr, int low, int high) {
		System.out.println("Called QS");
		int pivot = low;

		//at least there are 2 elements		
		if (low < high) {
			int j = partition(arr, low, high, pivot);
			System.out.println("Pivot index: " + j);
			quickSort(arr, low, j - 1);
			quickSort(arr, j + 1, high);
		}
	}

	public static int partition(int[] arr, int low, int high, int pivot) {
		int i = low;
		int j = high;
		while (i < j) {
			//increment i till you get an element greater than pivot
			while (arr[i] <= arr[pivot]) {
				i++;

				if (i == arr.length) {
					break;
				}
				System.out.println("i is: " + i);
			}

			//decrement j till you get an element smaller than pivot
			while (arr[j] > arr[pivot]) {

				j--;
				System.out.println("j is: " + j);
				if (j < 0) {
					break;
				}

			}

			//the moment the above two conditions are satisfied, swap them, 
			//so that elements smaller are on left and greater elements are on the right of pivot
			//swap only if i is less than j
			if (i < j) {
				swap(arr, i, j);
			}
			//the above 3 steps continue for the elements as long as i is less than j. So loop it
		}
		//when i crosses j, it means you've found the deserving position of pivot.
		//Exchange it with j
		swap(arr, pivot, j);
		return j;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void print(int[] arr) {
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 10, 16, 8, 12, 15, 6, 3, 9, 5 };// { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		print(arr);
		quickSort(arr);
		print(arr);
	}

}
