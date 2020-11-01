/**
 * 
 */
package strings;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *         String can be rotated clockwise or anticlockwise. Check both the
 *         cases
 */
public class IsStringRotatedByTwoPlaces {

	public static boolean isRotated(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		String clockWise = "";
		String antiClockWise = "";
		int len = s2.length();

		clockWise = clockWise + s2.substring(0, 2) + s2.substring(2);

		antiClockWise = antiClockWise + s2.substring(len - 2, len) + s2.substring(0, len - 2);

		return (s1.equals(clockWise) || s1.equals(antiClockWise));

	}

	public static void main(String[] args) {
		System.out.println(isRotated("geeksforgeeks", "geeksgeeksfor"));

	}

}
