/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class AddNodeToDoublyLinkedList {
		private static Node head;
		
		public static void insertNode(int position, int data) {
			Node newNode = new Node(data);
		
			if (head == null) {
				head = newNode;
				return;
			}
			Node node = head;
		
			for (int i = 0; i < position; i++) {
				if (node.next != null) {
					node = node.next;
				}
			}
		
			newNode.next = node.next;
			if (node.next != null) {
				node.next.prev = newNode;
			}
			node.next = newNode;
			newNode.prev = node;
		
			return;
		}
		
		public static void printList(Node node) {
			Node tracker = node;
			do {
				System.out.print(tracker.data + " ");
				tracker = tracker.next;
		
			} while (tracker != null);
		
			return;
		}
		
		public static void main(String[] args) {
			Node node0 = new Node(0);
			Node node1 = new Node(1);
			Node node3 = new Node(3);
			Node node4 = new Node(4);
		
			node0.next = node1;
			node1.next = node3;
			node3.next = node4;
		
			node4.prev = node3;
			node3.prev = node1;
			node1.prev = node0;
		
			//head = null;
			head = node0;
			//insertNode(node0, 1, 2);
			insertNode(1, 2);
		
			insertNode(3, 5);
			insertNode(5, 6);
			printList(head);
		}
		
		}
		
		class Node {
		Node prev;
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		}*/