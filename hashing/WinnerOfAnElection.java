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
public class WinnerOfAnElection {

	public static String winner(String[] arr) {
		if (arr == null || arr.length == 0) {
			return null;
		}

		Map<String, Integer> map = new HashMap<>();

		for (String s : arr) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		int max = Integer.MIN_VALUE;
		String winner = String.valueOf(Integer.MAX_VALUE);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			if (value == max) {
				int num = winner.compareToIgnoreCase(entry.getKey());
				if (num > 0) {
					winner = entry.getKey();
				}
			} else if (value > max) {
				max = value;
				winner = entry.getKey();
			}
		}
		return winner;
	}

	public static void main(String[] args) {
		String[] arr = { "john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny",
				"jamie", "johnny", "john" };
		System.out.println("Winner : " + winner(arr));
	}

}
