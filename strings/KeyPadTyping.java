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
public class KeyPadTyping {

	public static void keyPadTyping(String str) {
		if (str == null || str.length() == 0) {
			return;
		}

		Map<Character, Integer> map = new HashMap<>();

		map.put('a', 2);
		map.put('b', 2);
		map.put('c', 2);
		map.put('d', 3);
		map.put('e', 3);
		map.put('f', 3);
		map.put('g', 4);
		map.put('h', 4);
		map.put('i', 4);
		map.put('j', 5);
		map.put('k', 5);
		map.put('l', 5);
		map.put('m', 6);
		map.put('n', 6);
		map.put('o', 6);
		map.put('p', 7);
		map.put('q', 7);
		map.put('r', 7);
		map.put('s', 7);
		map.put('t', 8);
		map.put('u', 8);
		map.put('v', 8);
		map.put('w', 9);
		map.put('x', 9);
		map.put('y', 9);
		map.put('z', 9);

		for (Character c : str.toCharArray()) {
			System.out.print(map.get(c));
		}
	}

	public static void main(String[] args) {
		String s = "amazon";
		keyPadTyping(s);

	}

}
