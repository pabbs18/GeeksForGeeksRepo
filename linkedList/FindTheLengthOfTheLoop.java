/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 * 
	 *         This code also includes method to remove the loop from the linked
	 *         list
	 */
/*
public class FindTheLengthOfTheLoop {

*//**
	 * STEP 1: find if a loop exists; STEP 2: detect start of a loop; STEP 3: from
	 * the start of the loop, traverse once to find its length; ADDITIONAL STEP:
	 * from the start of the loop, iterate till the next element is the starting
	 * point of the loop, and change it's next element to null.
	 * 
	 *//*
		private static Node slow;
		private static Node fast;
		
		public static boolean detectLoop(Node head) {
		if (head == null) {
			return false;
		}
		slow = head;
		fast = head;
		
		while (fast != null) {
			slow = slow.next;
		
			if (fast.next == null) {
				break;
			} else {
				fast = fast.next.next;
			}
			if (slow == fast) {
				return true;
			}
		}
		return false;
		}
		
		public static Node findStartOfALoop(Node head) {
		if (head == null) {
			return null;
		}
		
		boolean loopExists = detectLoop(head);
		
		if (loopExists) {
			slow = head;
			while (slow != fast) {
				slow = slow.next;
				fast = fast.next;
			}
			return slow;
		}
		return null;
		}
		
		public static int lengthOfLoop(Node head) {
		if (head == null) {
			return -1;
		}
		
		Node node = findStartOfALoop(head);
		if (node == null) {
			return -1;
		}
		int counter = 1;
		
		while (node.next != slow) {// by now, slow has moved to the start of the loop
			node = node.next;
			counter++;
		}
		
		return counter;
		}
		
		public static void removeLoop(Node head) {
		if (head == null) {
			return;
		}
		Node node = findStartOfALoop(head);
		//if no loop, return.
		if (node == null) {
			return;
		}
		
		while (node.next != slow) {// by now, slow has moved to the start of the loop
			node = node.next;
		}
		
		node.next = null;
		return;
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
		node9.next = node4;
		
		System.out.println("Length of loop: " + lengthOfLoop(node1));
		
		removeLoop(node1);
		
		print(node1);
		}
		
		}
		
		class Node {
		Node next;
		int data;
		
		public Node(int data) {
		this.data = data;
		}
		}*/