/**
 * 
 */
package sorting;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class ThreeWayPartitioning {

	public static void ThreeWayPartitioning(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0) {
			return;
		}
		int pivot1 = getIndex(arr, low);
		int pivot2 = getIndex(arr, high);
		int l = 0;
		int h = arr.length - 1;
		int[] partitionAtLow = partition(arr, l, h, pivot1);
		int[] finalPartition = partition(partitionAtLow, l, h, pivot2);

		print(finalPartition);
	}

	public static int[] partition(int[] a, int low, int high, int pivot) {

		int i = low;
		int j = high;
		while (i < j) {
			while (a[i] <= a[pivot]) {
				i++;
				if (i == a.length) {
					break;
				}
			}

			while (a[j] > a[pivot]) {
				j--;

				if (j < 0) {
					break;
				}
			}
			System.out.println("Inner i: " + i);
			System.out.println("Inner j: " + j);
			if (i < j) {
				System.out.println("Swapping : " + a[i] + " " + a[j]);
				swap(a, i, j);
			}
		}
		System.out.println("Outer i: " + i);
		System.out.println("Outer j: " + j);
		swap(a, pivot, j);
		return a;
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static int getIndex(int[] a, int element) {
		int index = 0;
		for (Integer i : a) {
			if (i == element) {
				break;
			}
			index++;
		}
		return index;
	}

	public static void print(int[] arr) {
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32 };
		ThreeWayPartitioning(arr, 20, 20);

	}

}
