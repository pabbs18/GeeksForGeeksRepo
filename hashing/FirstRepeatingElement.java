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
public class FirstRepeatingElement {

	public static int firstRepeatingElement(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Integer i : arr) {
			if (map.get(i) > 1) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 4, 3, 5, 6 };
		System.out.println(firstRepeatingElement(arr));
	}

}
