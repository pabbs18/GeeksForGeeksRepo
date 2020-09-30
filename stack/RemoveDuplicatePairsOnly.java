package stack;

import java.util.Stack;

public class RemoveDuplicatePairsOnly {

	public static String removeDupPairs(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		Stack<Character> stack = new Stack<>();
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			if (stack.isEmpty()) {
				stack.push(str.charAt(i));
			} else if (stack.peek() == str.charAt(i)) {
				char c = stack.pop();
				System.out.println("Popped: " + c);
			} else {
				stack.push(str.charAt(i));
			}
		}

		StringBuilder sb = new StringBuilder();

		while (!stack.isEmpty()) {
			char c = stack.pop();
			sb.append(c);
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		System.out.println(removeDupPairs("aabb"));

	}

}
