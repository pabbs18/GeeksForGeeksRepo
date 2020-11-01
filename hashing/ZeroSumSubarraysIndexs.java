/**
 * 
 */
package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class ZeroSumSubarraysIndexs {

	public static int zeroSumSubArrays(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		Map<Integer, List<Integer>> map = new HashMap<>();
		List<Integer> l = new ArrayList<>();
		l.add(1);
		int i = -1;
		int sum = 0;
		int count = 0;

		map.put(0, l);// 0 is the sum, 1 is the frequency
		int n = arr.length;
		while (i < n - 1) {

			sum += arr[++i];
			// if we have already seen the sum, then increase the count and add the frequency+1 to the map

			if (map.containsKey(sum)) {
				List<Integer> list = map.get(sum);
				list.add(i);
				map.put(sum, list);

				printList(list);
			} else {

				List<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(sum, list);
			}
		}

		//logger
		/* 0-------- 1
		 * 16--------1
		 * 2-------- 1
		 * -3--------1
		 * 4-------- 2
		 * 5-------- 1
		 * 6-------- 3
		 * 10--------1 */
		System.out.println("\n Map");
		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
			List<Integer> list = entry.getValue();
			System.out.print(entry.getKey() + ": [ ");
			for (Integer num : list) {
				System.out.print(num + " ");
			}
			System.out.print("]");
			System.out.println("\n");
		}

		return count;
	}

	public static void printList(List<Integer> list) {
		int i = 0;
		int n = list.size();
		while (i < n) {
			int j = i + 1;
			while (j < n) {
				System.out.println("Index From: " + (list.get(i) + 1) + ".... " + list.get(j++));
			}
			i++;
		}
	}

	public static void main(String[] args) {
		// indexes    0   1   2  3   4  5  6  7   8    9
		int[] arr = { 6, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		//preSum	  6   5   2  6   4  6 10  16  4   -3

		//int[] arr = { 0, 0, 5, 5, 0, 0 };

		int[] a = { 2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4 };
		System.out.println(zeroSumSubArrays(a));

	}

}
