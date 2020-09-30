/**
 * 
 */
package stack;

import java.util.Stack;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class GetMinmumAtPop {
	private static Stack<Integer> stack = new Stack<>();

	public static void push(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}
		for (Integer i : arr) {
			stack.push(i);
		}
		return;
	}

	public static void pop() {
		printMinInStack();
		System.out.print(" Popped: " + stack.pop());
		System.out.println();
	}

	public static void printMinInStack() {
		int curMinimum = stack.peek();
		for (Integer i : stack) {
			curMinimum = i < curMinimum ? i : curMinimum;
		}
		System.out.print("min in the stack is: " + curMinimum);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 6, 43, 1, 2, 0, 5 };

		push(arr);

		while (!stack.isEmpty()) {
			pop();
		}
	}
}
