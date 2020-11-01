/**
 * 
 */
package strings;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class PangramChecking {

	public static boolean checkPangram(String str) {
		if (str == null || str.length() == 0) {
			return false;
		}

		int[] alphabetCount = new int[26];
		int index = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {// range of ascii capital letters
				index = str.charAt(i) - 'A';
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {//range of ascii small leters
				index = str.charAt(i) - 'a';
			} else {
				continue;
			}

			alphabetCount[index]++;
		}
		for (int i = 0; i < alphabetCount.length; i++) {
			if (alphabetCount[i] == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String str = "Bawds jog flick quartz vex nymph";
		System.out.println(checkPangram(str));

	}

}
