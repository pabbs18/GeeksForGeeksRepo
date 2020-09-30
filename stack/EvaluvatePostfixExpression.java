package stack;

import java.util.Stack;

//Story: Push the operands on to the stack. If you encounter an operator,pop top two values from the stack, 
//       use the operator to calculate their value and push it back to the stack. 
public class EvaluvatePostfixExpression {

	public static int postfixValueCalculator(String postFixExpression) {
		if (postFixExpression.length() == 0 || postFixExpression == null) {
			return Integer.MIN_VALUE;
		}

		Stack<Integer> stack = new Stack<>();

		for (Character c : postFixExpression.toCharArray()) {
			if (Character.isDigit(c)) {
				stack.push(c - '0');
			} else {
				int val1 = stack.pop();
				int val2 = stack.pop();

				switch (c) {
				case '+':
					stack.push(val2 + val1);
					break;

				case '-':
					stack.push(val2 - val1);
					break;

				case '*':
					stack.push(val2 * val1);
					break;

				case '/':
					stack.push(val2 / val1);
					break;
				}
			}
		}

		return stack.pop();
	}

	public static void main(String[] args) {
		String postFixExpression = "231*+9-";
		System.out.println(postfixValueCalculator(postFixExpression));
	}

}
