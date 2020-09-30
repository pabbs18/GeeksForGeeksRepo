package stack;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

	private static Queue<Integer> queue1 = new LinkedList<>();
	private static Queue<Integer> queue2 = new LinkedList<>();

	public static void push(int num) {
		queue1.add(num);

	}

	public static int pop() {
		int size = queue1.size();

		while (size > 1) {
			queue2.add(queue1.remove());
			size--;
		}
		if (size == 0) {
			return Integer.MIN_VALUE;
		}
		int value = queue1.remove();

		while (!queue2.isEmpty()) {
			queue1.add(queue2.remove());
		}

		return value;
	}

	public static int peek() {
		int size = queue1.size();

		while (size > 1) {
			queue2.add(queue1.remove());
			size--;
		}

		if (size == 0) {
			return Integer.MIN_VALUE;
		}

		int value = queue1.peek();
		queue2.add(queue1.remove());

		while (!queue2.isEmpty()) {
			queue1.add(queue2.remove());
		}

		return value;
	}

	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);

		System.out.println("Peek: " + peek());
		pop();
		System.out.println("Peek: " + peek());
		pop();
		System.out.println("Peek: " + peek());
		pop();
		System.out.println("Peek: " + peek());
		pop();
		System.out.println("Peek: " + peek());
		pop();
		System.out.println("Peek: " + peek());

	}

}
