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
public class RemoveCommonCharactersAndConcatenate {

	public static String remCommonChar(String s1, String s2) {
		Map<Character, Integer> map = new HashMap<>();

		if (s1 != null || s1.length() != 0) {
			insertIntoMap(s1, map);
		}

		if (s2 != null || s2.length() != 0) {
			insertIntoMap(s2, map);
		}

		StringBuilder sb = new StringBuilder();

		for (Character c : s1.toCharArray()) {
			if (map.get(c) == 1) {
				sb.append(c);
			}
		}

		for (Character c : s2.toCharArray()) {
			if (map.get(c) == 1) {
				sb.append(c);
			}
		}

		return sb.toString();

	}

	public static void insertIntoMap(String s, Map<Character, Integer> map) {
		for (Character c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
	}

	public static void main(String[] args) {
		String s1 = "ascb";
		String s2 = "cxzca";
		System.out.println(remCommonChar(s1, s2));
	}

}
