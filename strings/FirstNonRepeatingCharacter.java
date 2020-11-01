/**
 * 
 */
package strings;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class FirstNonRepeatingCharacter {

	public static char firstNonRepeatChar(String str) {
		if (str == null || str.length() == 0) {
			return '\0';
		}

		int[] charCount = new int[26];

		for (int i = 0; i < str.length(); i++) {
			// ... -'a' is needed when you take array size as 26.
			charCount[str.charAt(i) - 'a']++;//eg: in hello , charCount[h -'a']++ = charCount[104 -97] = 1;
		}
		//again starting from left, if the character's count is 1 in the charCount array, then just return it
		for (int i = 0; i < str.length(); i++) {
			if (charCount[str.charAt(i) - 'a'] == 1) {
				return str.charAt(i);
			}
		}
		//otherwise return '\0';
		return '\0';
	}

	public static void main(String[] args) {
		String s = "zxvczbtxyzvy";
		System.out.println("First non repeating character: " + firstNonRepeatChar(s));
	}

}
