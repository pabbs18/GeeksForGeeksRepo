/**
 * 
 */
package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class RelativeSorting {

	public static List<Integer> relativeSorting(int[] a, int[] b) {
		if (a == null || a.length == 0) {
			return null;
		}
		List<Integer> result = new ArrayList<>();
		if (b == null || b.length == 0) {
			Arrays.sort(a);
			for (Integer i : a) {
				result.add(i);
			}
			return result;
		}

		Map<Integer, Integer> map = new TreeMap<>();

		for (Integer i : a) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Integer i : b) {
			if (map.containsKey(i)) {
				int frequency = map.get(i);
				for (int index = 0; index < frequency; index++) {
					result.add(i);
				}

			}
			map.remove(i);

		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {//Iterator is created here
			//From this point on if you try to modify the map in any way like removing, 
			// it throws concurrent modification exception
			int key = entry.getKey();
			int frequency = entry.getValue();
			for (int index = 0; index < frequency; index++) {
				result.add(key);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int A1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
		int A2[] = { 2, 1, 8, 3 };

		List<Integer> list = relativeSorting(A1, A2);

		for (Integer i : list) {
			System.out.print(i + " ");
		}

	}

}
