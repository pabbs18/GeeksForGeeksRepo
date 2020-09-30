/**
 * 
 */
package stack;

import java.util.Stack;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class DeleteMiddleElementOfAStack {

	private static Stack<Integer> stack = new Stack<>();
	private static Stack<Integer> backupStack = new Stack<>();

	public static Stack deleteMid(Stack<Integer> stack) {
		int size = stack.size();
		int halfWay = size / 2;

		for (int i = 0; i < halfWay; i++) {
			backupStack.push(stack.pop());
		}

		stack.pop();

		while (!backupStack.isEmpty()) {
			stack.push(backupStack.pop());
		}

		return stack;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		System.out.println("Before");
		System.out.println();

		for (Integer i : stack) {
			System.out.print(i + " ");
		}
		System.out.println();
		deleteMid(stack);

		System.out.println("After");
		for (Integer i : stack) {
			System.out.print(i + " ");
		}

	}

}
