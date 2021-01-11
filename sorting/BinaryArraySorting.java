/**
 * 
 */
package sorting;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class BinaryArraySorting {

	public static void binaryArraySorting(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}

		int zeroCount = 0;
		int oneCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeroCount++;
			} else {
				oneCount++;
			}
		}

		for (int i = 0; i < zeroCount; i++) {
			System.out.print("0 ");
		}

		for (int i = 0; i < oneCount; i++) {
			System.out.print("1 ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 1, 1, 1, 1, 0, 0, 0 };
		binaryArraySorting(arr);

	}

}
