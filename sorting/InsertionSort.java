/**
 * 
 */
package sorting;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class InsertionSort {

	public static void insertionSort(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}

		//consider 0th index as already sorted
		//so start from 1
		for (int i = 1; i < arr.length; i++) {
			//compare last element in the already sorted list to the first element of the not yet sorted list
			//We go reverse for j, as we need to start from the last already sorted element to the first
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				} else {
					break;
				}
			}
		}
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
		int[] arr = { 4, 1, 3, 9, 7 };
		print(arr);
		insertionSort(arr);
		print(arr);

	}

}
