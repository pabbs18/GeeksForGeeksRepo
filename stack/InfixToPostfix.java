package stack;

import java.util.Stack;

public class InfixToPostfix {

	public static int precedence(Character ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return -1;
		}
	}

	public static String infixToPostfix(String str) {
		if (str.length() == 0 || str == null) {
			return null;
		}

		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (Character c : str.toCharArray()) {
			/*1*/if (Character.isLetterOrDigit(c)) {
				sb.append(c);
			}
			/*2*/else if (c == '(') {
				stack.push(c);
			}
			/*3*/else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				if (stack.isEmpty()) {
					return "Invalid Expression";
				} else {
					stack.pop();
				}
			}
			/*4*/else {
				while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
					sb.append(stack.pop());
				}
				stack.push(c);
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		//String str = "a+b*(c^d-e)^(f+g*h)-i";
		String str = "A*(B+C)/D";
		System.out.println(infixToPostfix(str));
	}

}
