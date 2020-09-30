/*package linkedList;
package LInkedList;

public class CountNOdesOfALinkedList {

	public static int count(Node head) {
		if (head == null) {
			return 0;
		}
		int count = 1;

		while (head.next != null) {
			head = head.next;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		System.out.println(count(node1));

	}

}

class Node {
	Node next;
	int data;

	public Node(int data) {
		this.data = data;
	}
}*/