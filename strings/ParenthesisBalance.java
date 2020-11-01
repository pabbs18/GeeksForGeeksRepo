/**
 * 
 */
package strings;

import java.util.Stack;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class ParenthesisBalance {

	public static boolean isBalanced(String str) {
		if (str == null || str.length() == 0) {
			return false;
		}
		Stack<Character> stack = new Stack<>();

		for (Character c : str.toCharArray()) {
			switch (c) {
			case '{':
				stack.push(c);
				break;
			case '[':
				stack.push(c);
				break;
			case '(':
				stack.push(c);
				break;
			case '}':
				if (stack.peek() == '{') {
					stack.pop();
					break;
				} else {
					return false;
				}
			case ']':
				if (stack.peek() == '[') {
					stack.pop();
					break;
				} else {
					return false;
				}
			case ')':
				if (stack.peek() == '(') {
					stack.pop();
					break;
				} else {
					return false;
				}
			default:
				return false;
			}
		}
		if (!stack.isEmpty()) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "[()]{}{[()()]()}";
		String s2 = "[(])";

		System.out.println(isBalanced(s1) == true ? " s1 is Balanced" : "s1 is Unbalanced");
		System.out.println(isBalanced(s2) == true ? "s2 is Balanced" : "s2 is Unbalanced");
	}

}
