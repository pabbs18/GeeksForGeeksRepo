/**
 * 
 */
package stack;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class MyLinkdeListStack {

	Node top;

	public void push(int num) {
		Node newNode = new Node(num);

		if (top == null) {
			top = newNode;
		} else {
			top.next = newNode;
			newNode.prev = top;
		}
		top = newNode;
		return;
	}

	public int pop() {
		if (top == null) {
			return -1;
		}
		int value = top.data;
		top = top.prev;
		return value;
	}

	public int peek() {
		if (top == null) {
			return -1;
		}
		int value = top.data;
		return value;
	}

	public static void main(String[] args) {
		MyLinkdeListStack stck = new MyLinkdeListStack();

		stck.push(1);
		stck.push(2);
		stck.push(3);
		stck.push(4);

		System.out.println("Top ofStack: " + stck.peek());

		System.out.println("Popped: " + stck.pop());

		System.out.println("Top ofStack: " + stck.peek());
		System.out.println("Popped: " + stck.pop());
		System.out.println("Popped: " + stck.pop());
		System.out.println("Popped: " + stck.pop());
		System.out.println("Top ofStack: " + stck.peek());
	}
}

class Node {
	Node next;
	Node prev;
	int data;

	public Node(int data) {
		this.data = data;
	}
}