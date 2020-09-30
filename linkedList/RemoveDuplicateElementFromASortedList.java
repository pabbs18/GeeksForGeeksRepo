/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class RemoveDuplicateElementFromASortedList {
		
		public static Node removeDuplicate(Node head) {
			if (head == null) {
				return null;
			}
		
			Node node = head;
		
			while (node != null) {
				if (node.next != null && node.data == node.next.data) {
					node.next = node.next.next;
				} else {
					node = node.next;
				}
			}
			return head;
		}
		
		public static void print(Node node) {
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
		}
		
		public static void main(String[] args) {
			Node node1 = new Node(5);
			Node node2 = new Node(2);
			Node node3 = new Node(2);
			Node node4 = new Node(2);
			Node node5 = new Node(4);
		
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
		
			Node node = removeDuplicate(node1);
			print(node);
		
		}
		
		}
		
		class Node {
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		}*/