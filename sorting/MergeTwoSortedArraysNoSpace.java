/**
 * 
 */
package sorting;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * https://www.youtube.com/watch?v=hVl2b3bLzBw&pbjreload=101
 * 
 * Watch this video only till the explanation part. 
 * 
 * 
 * 
 */
public class MergeTwoSortedArraysNoSpace {

	public static void merge(int[] a1, int[] a2) {

		int m = a1.length;
		int n = a2.length;

		int i, j, gap = m + n;

		for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {//eg: if m+n = 8, gap starts from 4. Next loop it will be 2

			for (i = 0; i + gap < m; i++) {
				if (a1[i] > a1[i + gap]) {// this may happen after a few swaps that we need to sort within an array
					int temp = a1[i];
					a1[i] = a1[i + gap];
					a1[i + gap] = temp;
				}
			}
			//this loop is for the two arrays combined
			for (j = gap > m ? gap - m : 0; i < m && j < n; i++, j++) {// i.e combine the two sorted arrays. If gap is greater than the length of first array, obviously the second pointer, j starts from the gap'th index in the combined array
				if (a1[i] > a2[j]) {
					int temp = a1[i];
					a1[i] = a2[j];
					a2[j] = temp;
				}
			}

			//after having straightened out array1 with gap=1, array2 will be jumbled up. So straighten it out
			if (j < n) {//this happens only in gap =1 loop. It prevents straightening out array 2 in the previous gap loop
				for (j = 0; j + gap < n; j++) {
					if (a2[j] > a2[j + gap]) {
						int temp = a2[j];
						a2[j] = a2[j + gap];
						a2[j + gap] = temp;
					}
				}
			}
		}
	}

	public static int nextGap(int gap) {
		if (gap <= 1) {
			return 0;
		}
		return (int) Math.ceil(gap / 2);
	}

	public static void print(int[] arr) {
		for (Integer i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 7 };
		int arr2[] = { 0, 2, 6, 8, 9 };

		merge(arr1, arr2);
		print(arr1);
		print(arr2);
	}

}
