/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 */
/*
public class RotateALinkedList {

*//**
	 * STEP 1: connect last node of the list to the first node and also find the
	 * length of the list; STEP 2: move the head by (length-k-1)positions and mark
	 * it as 'tail'; STEP 3: move the head one more time and mark tail.next as null.
	 * Return head
	 *//*
		
		public static Node rotateList(Node head, int k) {
		if (head == null || k < 0) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		
		Node node = head;
		Node tail = null;
		int length = 1;
		
		//step 1
		while (node.next != null) {
			length++;
			node = node.next;
		}
		node.next = head;
		
		//step 2
		int headMoves = length - k;
		for (int i = 0; i < headMoves - 1; i++) {
			head = head.next;
		}
		tail = head;
		
		//step 3
		head = head.next;
		tail.next = null;
		
		return head;
		}
		
		public static void print(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		return;
		}
		
		public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		
		System.out.print("Before: ");
		print(node1);
		Node head = rotateList(node1, 4);
		System.out.println();
		System.out.print("After: ");
		print(head);
		
		}
		}
		
		class Node {
		Node next;
		int data;
		
		public Node(int data) {
		this.data = data;
		}
		}*/