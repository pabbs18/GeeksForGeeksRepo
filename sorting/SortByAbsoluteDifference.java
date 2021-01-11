/**
 * 
 */
package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class SortByAbsoluteDifference {

	public static void sortByAbsoluteDifference(int[] arr, int k) {
		if (arr == null || arr.length == 0) {
			return;
		}

		Map<Integer, List<Integer>> map = new TreeMap<>();
		for (int i = 0; i < arr.length; i++) {
			int key = Math.abs(arr[i] - k);
			int value = arr[i];
			if (map.containsKey(key)) {
				List<Integer> list = map.get(key);
				list.add(value);
				map.put(key, list);
			} else {
				List<Integer> list = new ArrayList<>();
				list.add(value);
				map.put(key, list);
			}

		}

		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
			List<Integer> list = entry.getValue();
			for (Integer i : list) {
				System.out.println(i);
			}

		}

	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 3, 9, 2 };
		int k = 7;
		sortByAbsoluteDifference(arr, k);

	}

}
