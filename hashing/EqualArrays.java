/**
 * 
 */
package hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class EqualArrays {

	public static boolean equalArrays(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer i : a) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Integer i : b) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) - 1);
			} else {
				map.put(i, map.getOrDefault(i, 0) + 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() != 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 4, 0 };
		int[] b = { 2, 4, 5, 0, 0 };

		System.out.println(equalArrays(a, b));

	}

}
