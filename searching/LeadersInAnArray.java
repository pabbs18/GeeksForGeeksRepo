/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class LeadersInAnArray {

	public static void findLeaders(int[] a) {
		if (a == null || a.length == 0) {
			return;
		}
		int n = a.length;

		if (n == 1) {
			System.out.println(a[n - 1]);
			return;
		}

		int j = a.length - 1;
		int i = a.length - 2;
		System.out.println(a[j]);
		while (i >= 0) {
			if (a[i] > a[j]) {
				System.out.println(a[i]);
				j = i;
			}
			i--;
		}
		return;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 0 };//{ 16, 17, 4, 3, 5, 2 };
		findLeaders(a);

	}

}
