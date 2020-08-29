package dummy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {
	public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int k) {
		if (queue == null || queue.isEmpty() || k < 0) {
			return null;
		}
		if (k == 0) {
			return queue;
		}

		int remainingSize = queue.size() - k;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < k; i++) {
			stack.push(queue.poll());
		}
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}

		for (int i = 0; i < remainingSize; i++) {
			queue.add(queue.poll());
		}
		return queue;
	}

	public static void main(String[] args) {
		Queue<Integer> qu = new LinkedList<>();

		for (int i = 1; i <= 5; i++) {
			qu.add(i);
		}

		reverseFirstK(qu, 3);

		for (int i = 0; i < 5; i++) {
			System.out.print(qu.peek() + " ");
			qu.poll();
		}
	}
}
