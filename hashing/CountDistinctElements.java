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
public class CountDistinctElements {

	public static void count(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5, 6, 7 };
		count(arr);

	}

}
