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
 * https://www.youtube.com/watch?v=svMdY6wlQ6I
 * 
 */
public class SubArraysWithEqual0sAnd1s {

	public static int subArraysWithEqual0sAnd1s(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		int ans = 0;
		int sum = 0;// cumulative sum
		Map<Integer, Integer> map = new HashMap<>();

		// initial 0 sum occurs once at -1 index
		map.put(0, 1);

		for (Integer i : arr) {
			//if its 0, consider it as -1
			if (i == 0) {
				sum += -1;
			}
			//else 1 is 1
			else {
				sum += 1;
			}

			//if map already contains the sum, increase the count and add to the frequencey of sum
			if (map.containsKey(sum)) {
				ans += map.get(sum);
				map.put(sum, map.get(sum) + 1);
			} else {
				//else just add 1 as the frequency
				map.put(sum, 1);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 1, 0, 1, 1 };
		System.out.println(subArraysWithEqual0sAnd1s(arr));

	}

}
