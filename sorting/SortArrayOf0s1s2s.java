/**
 * 
 */
package sorting;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * When we know the range of elements of an array is limited or small, and array maybe very large
 * we use counting sort, which sorts in a stable way(relative position of elements remain same after sorting)
 */
public class SortArrayOf0s1s2s {

	public static void countingSort(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}

		int min = getMin(arr);
		int max = getMax(arr);

		int range = max - min + 1;

		int[] farr = new int[range];

		for (int i = 0; i < arr.length; i++) {
			int index = arr[i] - min;
			farr[index]++;
		}

		for (int i = 1; i < farr.length; i++) {
			farr[i] = farr[i] + farr[i - 1];
		}

		int[] ans = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			int val = arr[i];
			int farrIndex = val - min;
			int pos = farr[farrIndex];
			int ansIndex = pos - 1;
			ans[ansIndex] = val;
			farr[farrIndex]--;
		}
		for (Integer i : ans) {
			System.out.print(i + " ");
		}

	}

	public static int getMin(int[] arr) {

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int getMax(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 2, 1, 2, 0 };
		countingSort(arr);

	}

}
