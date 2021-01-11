/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class RearrangeArray {

	public static int[] rearrange(int[] a) {
		if (a == null || a.length == 0) {
			return null;
		}

		for (int i = 0; i < a.length; i++) {
			int index = a[a[i]];
			index = index % 10;
			index = index * 10;
			a[i] += index;
		}

		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] / 10;
		}

		return a;
	}

	public static void print(int[] a) {

		for (Integer i : a) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 0 };//{ 4, 0, 2, 1, 3 };
		print(rearrange(a));

	}

}
