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
public class RelativeSorting {

	public static void sortAbyB(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return;
		}

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer i : a) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Integer i : b) {

			while (map.containsKey(i) && map.get(i) > 0) {
				System.out.print(i + " ");
				map.put(i, map.get(i) - 1);
				if (map.get(i) == 0) {
					map.remove(i);
				}
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int i = entry.getValue();
			while (i > 0) {
				System.out.print(entry.getKey() + " ");
				i--;
			}
		}

	}

	public static void main(String[] args) {
		int[] a = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 }; //{ 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
		int[] b = { 99, 22, 444, 56 };//{ 2, 1, 8, 3 };

		sortAbyB(a, b);

	}

}
