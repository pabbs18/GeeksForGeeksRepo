/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * Use array elements as indexes. Now go to that index and make that element as a negative number.
 * Proceed to the next elements. If at some point you use an element as index and try to change 
 * that indexed element to a negative number, but that element is already a negative number.
 * This means that some element with the same value as current element, previously was used as an index to 
 * make the indexed element a -ve number. This means the current element is a repetition.
 * 
 * Note: This method modifies the array
 * 
 */
public class TwoRepeatedElements {

	public static void twoRepeatedElements(int[] a) {
		if (a == null || a.length == 0) {
			return;
		}

		for (int i = 0; i < a.length; i++) {
			int numberToNegate = a[Math.abs(a[i])];
			//check the sign of numberToNegate. if it is -ve, then a[i] is repeating
			if (numberToNegate < 0) {
				System.out.println("Repeating: " + Math.abs(a[i]));
			} else {
				//make indexed element as negative
				a[Math.abs(a[i])] = -numberToNegate;
			}
		}
		return;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 3, 4, 3 };
		twoRepeatedElements(a);

	}

}
