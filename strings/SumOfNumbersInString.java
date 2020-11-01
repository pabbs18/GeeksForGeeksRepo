/**
 * 
 */
package strings;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class SumOfNumbersInString {

	public static int sumOfNumbers(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		String temp = "0";
		int sum = 0;

		for (Character c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				temp += c;
			} else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		sum += Integer.parseInt(temp);
		return sum;
	}

	public static void main(String[] args) {
		String s = "1abc2x30yz67";
		System.out.println(sumOfNumbers(s));

	}

}
