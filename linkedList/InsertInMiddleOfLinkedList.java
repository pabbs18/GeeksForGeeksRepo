/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class InsertInMiddleOfLinkedList {
		private static Node head;
		
		public static void insertInMiddle(int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				return;
			}
			int length = getMiddle();
			int position = length / 2;
			Node node = head;
			for (int i = 0; i < position; i++) {
				node = node.next;
			}
		
			newNode.next = node.next;
			node.next = newNode;
		
			return;
		}
		
		public static int getMiddle() {
			Node node = head;
			int counter = 0;
			while (node.next != null) {
				node = node.next;
				counter++;
			}
			return counter;
		}
		
		public static void printList() {
			Node node = head;
		
			do {
				System.out.print(node.data + " ");
				node = node.next;
			} while (node != null);
		}
		
		public static void main(String[] args) {
			//Node node0 = new Node(0);
			Node node1 = new Node(1);
			Node node2 = new Node(2);
			Node node4 = new Node(4);
		
			//node0.next = node1;
			node1.next = node2;
			node2.next = node4;
		
			Node node10 = new Node(10);
			Node node20 = new Node(20);
			Node node40 = new Node(40);
			Node node50 = new Node(50);
		
			node10.next = node20;
			node20.next = node40;
			node40.next = node50;
		
			head = node1;
		
			insertInMiddle(3);
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