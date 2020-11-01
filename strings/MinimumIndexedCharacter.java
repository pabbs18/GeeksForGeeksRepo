/**
 * 
 */
package strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class MinimumIndexedCharacter {

	public static char minimumIndexedCharacter(String str, String pattern) {
		if (str == null || str.length() == 0 || pattern == null || pattern.length() == 0) {
			return '\0';
		}

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (map.containsKey(c)) {
				continue;
			} else {
				map.put(c, i);
			}
		}

		int index = Integer.MAX_VALUE;

		for (Character c : pattern.toCharArray()) {
			if (map.containsKey(c)) {
				index = map.get(c) < index ? map.get(c) : index;
			}
		}

		if (index > str.length()) {
			return '\0';
		}
		return str.charAt(index);
	}

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		String pattern = "set";

		System.out.println(minimumIndexedCharacter(str, pattern));

	}

}
