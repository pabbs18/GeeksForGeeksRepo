package stack;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
import java.util.Stack;

public class RemovingConsecutiveDuplicates {

	public static String removeDuplicates(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		Stack<Character> stack = new Stack<>();
		/*stack.push(str.charAt(0));
		for (Character c : str.toCharArray()) {
			if (stack.peek() != c) {
				stack.push(c);
			}
		}*/
		int len = str.length();
		stack.push(str.charAt(len - 1));
		for (int i = len - 2; i >= 0; i--) {
			if (stack.peek() != str.charAt(i)) {
				stack.push(str.charAt(i));
			}
		}

		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			Character c = stack.pop();
			sb.append(c);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(removeDuplicates("aaaaaabaabccccccc"));
	}

}
