/**
 * 
 */
package hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * an array of distinct integers
 */
public class HashingForPair1 {

	public static boolean pairExists(int[] a, int sum) {
		if (a == null || a.length == 0) {
			return false;
		}

		Set<Integer> set = new HashSet<>();

		for (Integer i : a) {
			set.add(i);
		}

		for (Integer i : a) {
			int requiredDiff = sum - i;
			set.remove(i);

			if (set.contains(requiredDiff)) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 14;

		/* int[] a = { 2, 5 };
		 * int summ = 10; */

		System.out.println(pairExists(arr, sum));

		//System.out.println(pairExists(a, summ));

	}

}
