/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class StrongestNeighbour {

	public static void strongestNeighbour(int[] a) {
		if (a == null || a.length == 0) {
			return;
		}
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int stronger = a[i] > a[i + 1] ? a[i] : a[i + 1];
			System.out.print(stronger + " ");
		}
		return;
	}

	public static void main(String[] args) {
		int[] a = { 5, 5 };//{ 1, 2, 2, 3, 4, 5 };
		strongestNeighbour(a);

	}

}
