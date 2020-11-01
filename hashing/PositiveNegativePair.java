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
public class PositiveNegativePair {

	public static void positiveNegativePair(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer i : arr) {
			// since the elements are unique, we can take their absolute value
			// if the element repeats, then it means the second occurrence is of opposite sign
			int num = Math.abs(i);
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 2) {
				System.out.print(entry.getKey() + " -" + entry.getKey() + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, -2, -1, -3, 2, 7 };
		positiveNegativePair(arr);
	}

}
