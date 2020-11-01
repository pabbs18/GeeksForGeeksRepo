package strings;
/**
 * 
 */

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class NaivePatternSearch {

	public static boolean patternMatch(String text, String pattern) {
		if (text == null || pattern == null || text.length() == 0 || pattern.length() == 0) {
			return false;
		}
		int n = text.length();//10
		int m = pattern.length();//4 n-m = 6: i.e  i goes till 6 :0,1,2,3,4,5,6......7,8,9
		System.out.println();
		for (int i = 0; i <= n - m; i++) {
			int j;
			for (j = 0; j < m; j++) {
				if (text.charAt(i + j) != pattern.charAt(j)) {//i+j cuz if not, i will be stuck at one character for all j
					break;
				}
			}
			if (j == m) {// i.e if j goes from 0,1,2,3.. it means all characters matched
				System.out.println("final i:" + i);
				return true;
			}
			// else if and else part are improvisations
			else if (j == 0) {// i.e 1 st character of the window itself did not match
				i = i + 1; // move i by 1 character
				System.out.println("1) i:" + i);
			} else {
				i = i + j;
				System.out.println("2) i:" + i + " j: " + j);// if a character did not match after j iterations, then move i by j steps
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String text = "ABCDABCABCDF";
		String pattern = "ABCDF";
		System.out.println(patternMatch(text, pattern));

	}

}
