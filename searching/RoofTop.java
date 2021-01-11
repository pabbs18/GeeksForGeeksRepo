/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class RoofTop {

	public static int roofTop(int[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}
		int maxCount = 0;
		int count = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] <= a[i]) {
				count = 0;
				continue;
			}
			count++;
			maxCount = Math.max(count, maxCount);

		}
		return maxCount;
	}

	public static void main(String[] args) {
		int[] a = { 4, 3, 2, 1 };//{ 1, 1, 1, 1 };//{ 1, 2, 2, 3, 2 };//{ 1, 2, 3, 4 };
		System.out.println(roofTop(a));
	}

}
