/**
 * 
 */
package strings;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *         You can also solve this using HashMaps
 */
public class Anagrams {

	public static boolean areAnagrams(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		int[] alphabets = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			alphabets[s1.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s2.length(); i++) {
			alphabets[s1.charAt(i) - 'a']--;
		}

		for (int i = 0; i < s1.length(); i++) {
			if (alphabets[i] != 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String s1 = "geeksforgeeks";
		String s2 = "forgeeksgeeka";

		System.out.println(areAnagrams(s1, s2));

	}

}
