/**
 * 
 */
package hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *  elements may repeat
 */
public class HashingForPair2 {

	public static boolean pairExists(int[] a, int sum) {
		if (a == null || a.length == 0) {
			return false;
		}

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer i : a) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Integer i : a) {
			if (map.get(i) != 0) {
				map.put(i, map.get(i) - 1);
				if (map.get(i) == 0) {
					map.remove(i);
				}
			}

			int requiredDiff = sum - i;

			if (map.containsKey(requiredDiff)) {
				return true;
			}

		}

		return false;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 5, 3, 7, 9, 8 };
		int sum = 19;
		System.out.println(pairExists(a, sum));
	}

}
