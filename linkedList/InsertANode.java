/*package linkedList;
package LInkedList;

public class InsertANode {
	private static Node head;

	public static void insertAtTheBegining(int data) {
		Node node = new Node(data);
		if (head != null) {
			node.next = head;
		}
		head = node;
		return;
	}

	public static void insertAtTheEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		node.next = newNode;
		return;
	}

	public static void printList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {

		insertAtTheBegining(6);
		insertAtTheEnd(4);
		insertAtTheBegining(5);
		insertAtTheEnd(3);
		printList();
	}

}

class Node {
	Node next;
	int data;

	public Node(int data) {
		this.data = data;
	}
}*/