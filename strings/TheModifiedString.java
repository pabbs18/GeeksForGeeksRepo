/**
 * 
 */
package strings;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class TheModifiedString {

	public static int howManyToAdd(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}

		int count = 1;
		int n = str.length();
		int numOfCharsToAdd = 0;
		for (int i = 0; i < n - 1; i++) {
			if (str.charAt(i + 1) == str.charAt(i)) {
				count++;
				if (count == 3) {
					numOfCharsToAdd++;
					count = 1;
				}
			} else {
				count = 1;
			}
		}
		return numOfCharsToAdd;
	}

	public static void main(String[] args) {
		String s = "abcddee";
		System.out.println("Number of chars to add: " + howManyToAdd(s));
	}

}
