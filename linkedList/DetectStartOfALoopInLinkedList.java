/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class DetectStartOfALoopInLinkedList {
		private static Node slow;
		private static Node fast;
		
		public static boolean detectALoop(Node head) {
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
		
		public static int detectStartOfLoop(Node head) {
			if (head == null) {
				return -1;
			}
			boolean loopExists = detectALoop(head);
		
			if (loopExists) {
				slow = head;
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow.data;
			}
			return -1;
		}
		
		public static void main(String[] args) {
			Node node1 = new Node(1);
			Node node2 = new Node(2);
			Node node3 = new Node(3);
			Node node4 = new Node(4);
			Node node5 = new Node(5);
		
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			node5.next = node3;
		
			System.out.println(detectStartOfLoop(node1));
		
		}
		
		}
		
		class Node {
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		}*/