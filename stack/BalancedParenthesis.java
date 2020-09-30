package stack;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
import java.util.Stack;

public class BalancedParenthesis {

	public static boolean isBalanced(String str) {
		if (str == null || str.length() == 0) {
			return true;
		}
		if (str.length() == 1) {
			return false;
		}
		int len = str.length();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < len; i++) {
			Character c = str.charAt(i);
			if (c == '{' || c == '[' || c == '(') {
				stack.push(c);
				System.out.println("Pushed: " + c);
			} else {
				switch (c) {

				case '}':
					System.out.println("Case: " + c);
					System.out.println("stack.peek(): " + stack.peek());
					if (stack.peek() == '{') {
						stack.pop();
					}
					break;

				case ']':
					System.out.println("Case: " + c);
					System.out.println("stack.peek(): " + stack.peek());
					if (stack.peek() == '[') {
						stack.pop();
					}
					break;

				case ')':
					System.out.println("Case: " + c);
					System.out.println("stack.peek(): " + stack.peek());
					if (stack.peek() == '(') {
						stack.pop();
					}

					break;
				}
			}
		}

		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		boolean balanced = isBalanced("([]"); //isBalanced("{[()]}");

		if (balanced) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}

	}

}
