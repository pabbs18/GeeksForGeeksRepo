/**
 * 
 */
package strings;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *         1. Ask if its only alphabets[26] or all ascii characters[256]
 * 
 *         start from the end. if a char is not yet visited, mark visited and
 *         move left. If a char is already visited, update res with its index
 *         and move left. Once we finish all the characters in the string, last
 *         character index to update the res value, will the leftmost character
 *         in the string, that repeats inside the string.
 */
public class RepeatingCharacterFirstAppearanceLeftmost {

	public static int firstRepeatingChar(String str) {
		if (str == null) {
			return -1;
		}
		boolean[] visited = new boolean[256];
		int res = -1;

		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			if (visited[c] == false) {//eg: visited[g] = visited[103] in ascii;
				visited[c] = true;
			} else {
				res = i;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		int index = firstRepeatingChar(s);

		if (index == -1)
			System.out.println(" no repeating char");
		else
			System.out.println("leftmost repeating char:" + s.charAt(index));
	}

}
