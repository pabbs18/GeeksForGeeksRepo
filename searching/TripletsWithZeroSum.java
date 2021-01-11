/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * On first glance it looks like a n^3 soln. But can be solved in n^2
 * 
 */
public class TripletsWithZeroSum {

	public static boolean zeroSum(int[] a) {
		if (a == null || a.length == 0) {
			return false;
		}
		int n = a.length;
		for (int i = 0; i < n - 2; i++) {
			int j = i + 1;
			for (int k = j + 1; j < n; j++) {
				if (a[i] + a[j] + a[k] == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };//{ 0, -1, 2, -3, 1 };
		System.out.println(zeroSum(a));

	}

}
