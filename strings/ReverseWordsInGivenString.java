/**
 * 
 */
package strings;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class ReverseWordsInGivenString {

	public static void reverseWords(String str) {
		if (str == null || str.length() == 0) {
			return;
		}

		String[] sArray = str.split("\\.");

		for (int i = sArray.length - 1; i >= 0; i--) {
			System.out.print(sArray[i]);
			if (i != 0) {
				System.out.print(".");
			}
		}
	}

	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";

		reverseWords(s);

	}

}
