/**
 * 
 */
package sorting;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class IntersectionOfTwoSortedArrays {

	public static void intersection(int[] a, int[] b) {
		if (a == null || a.length == 0 && b == null || b.length == 0) {
			return;
		}

		if (a == null || a.length == 0) {
			System.out.println("0");
			return;
		}

		if (b == null || b.length == 0) {
			System.out.println("0");
			return;
		}

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] != a[i]) {
				map.put(a[i - 1], 1);
			}
			if (i == a.length - 1 && a[i] != a[i - 1]) {
				map.put(a[i], 1);
				break;
			}
		}

		for (int i = 1; i < b.length; i++) {
			if (b[i - 1] != b[i]) {
				map.put(b[i - 1], map.getOrDefault(b[i - 1], 0) + 1);
			}
			if (i == b.length - 1 && b[i] != b[i - 1]) {
				map.put(b[i], map.getOrDefault(b[i], 0) + 1);
				break;
			}
		}
		boolean flag = false;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 2) {
				System.out.print(entry.getKey() + " ");
				flag = true;
			} else {
				continue;
			}
		}

		if (flag == false) {
			System.out.println("-1");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2 };//{ 1, 2, 3, 4 };//{ 1, 2, 2, 3, 4 };
		int[] b = { 3, 4 };//{ 2, 4, 6, 7, 8 };//{ 2, 2, 4, 6, 7, 8 };

		intersection(a, b);

	}

}
