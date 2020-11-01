/**
 * 
 */
package strings;

import java.util.Arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * separate the upper case and lower case letters into two different arrays.
 *  Sort them both.
 *  write them back to an array, by checking: if the letter at an index in the original string is upper-case,
 *  then select the letter from upper-case array and so on..
 *  
 *  QUESTION: this string apparently has only alphabets
 * 
 */
public class CaseSpecificSortingOfStrings {

	public static String sortString(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}

		char[] mixStringArray = str.toCharArray();

		// get the number of uppercase and lowercase letters

		int upperCaseSize = 0;
		int lowerCaseSize = 0;

		for (Character c : mixStringArray) {
			if (Character.isUpperCase(c)) {
				upperCaseSize++;
			} else {
				lowerCaseSize++;
			}
		}

		// create arrays using the above sizes

		char[] upperCaseArray = new char[upperCaseSize];
		char[] lowerCaseArray = new char[lowerCaseSize];

		//put the letters according to cases in their respective arrays

		int upIndex = 0;
		int lowIndex = 0;

		for (Character c : mixStringArray) {
			if (Character.isUpperCase(c)) {
				upperCaseArray[upIndex++] = c;
			} else {
				lowerCaseArray[lowIndex++] = c;
			}
		}

		// Sort the arrays

		Arrays.sort(upperCaseArray);
		Arrays.sort(lowerCaseArray);

		//Now, put the characters back in the original array, by checking case of the letter

		upIndex = 0;
		lowIndex = 0;
		for (int i = 0; i < mixStringArray.length; i++) {
			if (Character.isUpperCase(mixStringArray[i])) {
				mixStringArray[i] = upperCaseArray[upIndex++];
			} else {
				mixStringArray[i] = lowerCaseArray[lowIndex++];
			}
		}

		String s = new String(mixStringArray);

		return s;

	}

	public static void main(String[] args) {
		String s = "defRTSersUXI";

		System.out.println("Original: " + s);
		System.out.println("Modified: " + sortString(s));

	}

}
