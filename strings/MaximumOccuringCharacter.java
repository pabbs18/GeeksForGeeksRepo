/**
 * 
 */
package strings;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class MaximumOccuringCharacter {

	public static char maxOccurCharacter(String str) {
		if (str == null || str.length() == 0) {
			return '\0';
		}

		int[] charCount = new int[256];

		for (Character c : str.toCharArray()) {
			charCount[c]++;
		}
		return maxOccurCharacter(charCount);
	}

	public static char maxOccurCharacter(int[] charCount) {
		int maxIndex = 0;

		for (int i = 1; i < charCount.length; i++) {
			if (charCount[i] > charCount[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println(" maxIndex " + maxIndex);
		char c = (char) maxIndex;

		return c;
	}

	public static void main(String[] args) {
		String s = "testsample";
		System.out.println("Maximum Occuring Character : " + maxOccurCharacter(s));
	}

}
