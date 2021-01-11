/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class WaveArray {

	public static void waveArray(int[] a) {
		if (a == null || a.length == 0) {
			return;
		}
		if (a.length < 3) {
			print(a);
		}

		int i = 1;
		while (i < a.length) {
			swap(a, i, i - 1);
			i++;
			i++;
		}

		print(a);
		return;
	}

	public static void swap(int[] a, int fromIndex, int toIndex) {
		int temp = a[fromIndex];
		a[fromIndex] = a[toIndex];
		a[toIndex] = temp;
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 4, 7, 8, 9, 10 };//{ 1, 2, 3, 4, 5 };
		waveArray(a);

	}

}
