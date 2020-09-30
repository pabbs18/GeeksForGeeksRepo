package stack;

/* https://www.youtube.com/watch?v=8P-Z7Oc8x9I */
import java.util.Stack;

public class NextGreaterElement {

	public static void nextGreaterElement(int[] arr) {
		if (arr.length == 0 || arr.length == 1) {
			System.out.println("null");
			return;
		}

		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			while (!stack.isEmpty() && stack.peek() < arr[i]) {
				System.out.println("Next Greater Element of :" + stack.pop() + " is " + arr[i]);
			}
			stack.push(arr[i]);
		}
		while (!stack.isEmpty()) {
			System.out.println("Next Greater Element of :" + stack.pop() + " is null");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 7, 8, 1, 4 };
		nextGreaterElement(arr);
	}

}
