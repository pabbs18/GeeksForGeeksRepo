/**
 * 
 */
package strings;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *         https://www.youtube.com/watch?v=EFLKZQnE6Ek
 * 
 *         https://techiedelight.com/compiler/
 */
public class LexicographicRankOfAString {
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return (n <= 2) ? n : n * fact(n - 1);
	}

	public static int rank(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		int n = str.length();
		//we fix the position, character after character, and for the remaining characters which are greater
		//than the fixed character(s), we check in how many ways can they be arranged(permutation).
		int rank = 1;// you may also take it as 0. Ask the interviewer.
		for (int i = 0; i < n; i++) {
			int count = 0; // count of characters smaller than the current character, so that they can be fixed in a position
			for (int j = i + 1; j < n; j++) {
				if (str.charAt(i) > str.charAt(j)) {
					count++;
				}
			}
			rank += count * fact(n - i - 1); //fact(n-i-1) is to find the number of arrangements of the characters grater than the fixed characters
		}
		return rank;
	}

	public static void main(String[] args) {
		String s = "string";
		System.out.println("Rank: " + rank(s));
	}

}
