/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class ReverseArrayInGroups {

	public static void printReverseInGroup(int[] a, int g) {
		if (a == null || a.length == 0) {
			return;
		}
		int i = 0, j = 0, k = 0;
		while (i < a.length) {
			k = i;
			for (int count = 0; count < g - 1; count++) {
				if (i < a.length - 1) {
					i++;
				}
			}

			j = i;
			while (j >= k) {
				System.out.print(a[j] + " ");
				j--;
			}
			i++;

		}
		return;
	}

	public static void main(String[] args) {
		int[] a = { 5, 6, 8, 9 };//{ 1, 2, 3, 4, 5 };
		printReverseInGroup(a, 3);
	}

}
