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
 * https://www.youtube.com/watch?v=C9-n_H7dsvU
 * 
 */
public class ZeroSumSubArrays {

	public static int zeroSumSubArrays(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		Map<Integer, Integer> map = new HashMap<>();

		int i = -1;
		int sum = 0;
		int count = 0;

		map.put(0, 1);// 0 is the sum, 1 is the frequency
		int n = arr.length;
		while (i < n - 1) {

			sum += arr[++i];
			// if we have already seen the sum, then increase the count and add the frequency+1 to the map

			if (map.containsKey(sum)) {
				count += map.get(sum);
				map.put(sum, map.get(sum) + 1);
			} else {
				map.put(sum, 1);
			}
		}

		//logger
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-------- " + entry.getValue());
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 6, -1, -3, 4, -2, 2, 4, 6, -12, -7 };

		int[] a = { 2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4 };

		//int[] arr = { 0, 0, 5, 5, 0, 0 };
		System.out.println(zeroSumSubArrays(a));

	}

}
