/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * Since there is no way to directly tell a majority element in O(1) space, 
 * First find a probable candidate in the first pass
 * Second check if it is the majority candidate by getting its count in the second pass 
 * 
 */
public class MajorityElement {

	public static int majorityElement(int[] arr) {
		if (arr == null || arr.length == 0) {
			return -1;
		}

		int candidate = findProbableCandidate(arr);

		if (isMajorityElement(candidate, arr)) {
			return candidate;
		}
		return -1;
	}

	public static int findProbableCandidate(int[] arr) {
		int majorityIndex = 0;

		int count = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[majorityIndex]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				majorityIndex = i;
				count = 1;
			}
		}
		return arr[majorityIndex];
	}

	public static boolean isMajorityElement(int candidate, int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == candidate) {
				count++;
			}
		}

		if (count < arr.length / 2) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		int[] a = { 3, 1, 3, 3, 2 };
		System.out.println(majorityElement(a));
	}

}
