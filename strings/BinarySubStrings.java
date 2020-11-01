/**
 * 
 */
package strings;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *         Count the number of substrings that start and end with 1.
 * 
 *         Basically we need to find all possible pairs of 1s. Number of unique
 *         pairs is given by the formula: n(n-1)/2;
 * 
 *         Eg: if n =4 (1s) then total possible pairs = 4(4-1)/2 = 6;
 */
public class BinarySubStrings {

	public static int totalPairs(String s) {
		if (s == null) {
			return 0;
		}
		int count = 0;
		//count the number of 1s
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}
		return count * (count - 1) / 2;
	}

	public static void main(String[] args) {
		String s = "1111";

		System.out.println(totalPairs(s));

	}

}
