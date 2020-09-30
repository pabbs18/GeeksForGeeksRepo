/**
 * 
 */
package stack;

/**
 * @author Neha
 * 
 * @implNote This code implements a stack using Arrays.
 */
public class MyStack {

	int top;
	int[] arr;

	public MyStack() {
		top = -1;
		arr = new int[1000];
	}

	public void push(int num) {
		top += 1;
		arr[top] = num;
		return;
	}

	public int pop() {
		if (top == -1) {
			return -1;
		}
		int topOfStack = arr[top];
		top--;
		return topOfStack;
	}

	public int peek() {
		if (top == -1) {
			return -1;
		}
		int topOfStack = arr[top];
		return topOfStack;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyStack myStack = new MyStack();

		myStack.push(2);
		myStack.push(1);
		myStack.push(23);
		myStack.push(54);

		System.out.println("Top ofStack: " + myStack.peek());

		System.out.println("Popped: " + myStack.pop());

		System.out.println("Top ofStack: " + myStack.peek());

	}

}
