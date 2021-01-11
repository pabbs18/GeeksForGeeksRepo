/**
 * 
 */
package sorting;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		if (arr == null) {
			return;
		}

		for (int itr = 1; itr < arr.length; itr++) {
			for (int index = 0; index < arr.length - itr; index++) {
				if (arr[index + 1] < arr[index]) {
					swap(arr, index + 1, index);
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
		bubbleSort(arr);
		print(arr);

	}

}
