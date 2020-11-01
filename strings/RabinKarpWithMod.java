/**
 * 
 */
package strings;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * Still not working
 */
public class RabinKarpWithMod {

	private static int base = 10;
	private static int modDivisor = 101;
	private static Queue<Integer> queue = new LinkedList<>();

	public static void rabinKarp(String text, String pattern) {
		if (text == null || text.length() == 0 || pattern == null || pattern.length() == 0) {
			return;
		}

		int m = pattern.length();
		int n = text.length();

		long patternHash = 0;
		// calculate the hash value of the pattern
		for (int i = 0; i < m; i++) {
			patternHash += (pattern.charAt(i) * Math.pow(base, m - i - 1)) % modDivisor;
		}

		System.out.println("1. patternHash : " + patternHash);// log

		//calculate the hash for first window in the text
		long textHash = 0;
		for (int i = 0; i < m; i++) {
			textHash += (text.charAt(i) * Math.pow(base, m - i - 1)) % modDivisor;
		}
		System.out.println("1.1. textHash : " + textHash);//log

		// compare the hash values against all the length of text
		int i;
		for (i = 0; i < n - m; i++) {

			//check if the hash values match
			check(patternHash, textHash, i, m, text, pattern);

			//whether the pattern was found or not, we keep looking for new hopeful matches
			//we remove the leading character from our window and add next character
			if (i < n - m) {// as long as i is within the bounds

				System.out.println("text.charAt(i) * Math.round(Math.pow(base, m - 1): "
						+ (text.charAt(i) * Math.round(Math.pow(base, m - 1))));

				// remove leading character	
				// multiply it with 10(or other base)
				//add next character
				textHash = ((textHash - (text.charAt(i) * Math.round(Math.pow(base, m - 1)))) * base
						+ (text.charAt(i + m))) % modDivisor;

				// We might get negative value of textHash, converting it
				// to positive
				if (textHash < 0)
					textHash = (textHash + modDivisor);
				System.out.println("text.charAt(i + m) is: " + text.charAt(i + m) + " textHash : " + textHash);//log
			}
		}

		check(patternHash, textHash, i, m, text, pattern);
		checkAllOccurences();
	}

	public static void check(long patternHash, long textHash, int i, int m, String text, String pattern) {
		if (patternHash == textHash) {
			System.out.println("patternHash == textHash");
			//compare character by character
			int j;
			for (j = 0; j < m; j++) {// for the length of the pattern
				if (text.charAt(i + j) != pattern.charAt(j)) {// if a character doesn't match 
					break;
				}
			}

			if (j == m) {// this means all the characters match
				queue.add(i);
			}
		}
	}

	public static void checkAllOccurences() {
		if (queue.isEmpty()) {
			System.out.println("Pattern doesn't exist in the given string");
		} else {
			while (!queue.isEmpty()) {
				System.out.println("You can find the patter at starting at index: " + queue.poll());
			}
		}
	}

	public static void main(String[] args) {
		String text = "aabaacaadaabaaba";
		String pattern = "aaba";

		rabinKarp(text, pattern);

	}

}
