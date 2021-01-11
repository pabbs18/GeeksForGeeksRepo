/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class InsertAtEnd {

	public static void insertEnd(int[] a, int i) {
		if (a == null) {
			return;
		}

		if (a.length == 0) {
			a[0] = i;
			return;
		}

		int lastIndex = a.length - 1;
		a[lastIndex] = i;

		return;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		insertEnd(a, 90);
		//print
		for (Integer num : a) {
			System.out.print(num + " ");
		}

	}

}
