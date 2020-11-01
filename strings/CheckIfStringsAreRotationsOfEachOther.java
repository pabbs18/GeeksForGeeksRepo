/**
 * 
 */
package strings;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *         Concatenate the strings and check is s2 is a part of the
 *         concatenation
 */
public class CheckIfStringsAreRotationsOfEachOther {

	public static boolean isRotation(String original, String rotated) {
		String s1 = original;
		String s2 = rotated;
		if (s1 == null || s2 == null) {
			return false;
		}
		if (s1.length() == s2.length() && (s1 + s2).contains(s2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		String s1 = "ABACD";
		String s2 = "CDABA";

		System.out.println(isRotation(s1, s2) ? "1" : "0");
	}

}
