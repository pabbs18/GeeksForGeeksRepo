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
public class CheckIsogram {

	public static boolean checkIsogram(String s) {
		if (s == null || s.length() == 0) {
			return true;
		}

		Map<Character, Integer> map = new HashMap<>();

		for (Character c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String s = "machiine";
		System.out.println(checkIsogram(s));
	}

}
