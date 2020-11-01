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
public class IsomorphicStrings {

	public static boolean isIsomorphic(String s1, String s2) {
		if (s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}

		int len = s1.length();

		Map<Character, Character> map = new HashMap<>();

		for (int i = 0; i < len; i++) {
			char key = s1.charAt(i);
			char value = s2.charAt(i);
			if (map.containsKey(key)) {
				if (map.get(key) != value) {
					return false;
				} else {
					map.put(key, value);
				}
			} else {
				map.put(key, value);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "aab";
		String s2 = "xox";
		System.out.println(isIsomorphic(s1, s2));

	}

}
