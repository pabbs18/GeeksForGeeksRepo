/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class ReverseALinkedList {
		
		public static Node reverseList(Node head) {
			if (head == null || head.next == null) {
				return head;
			}
		
			Node prev = null;
			Node curr = head;
			Node nextNode = null;
		
			while (curr != null) {
				nextNode = curr.next;
				curr.next = prev;
				prev = curr;
				curr = nextNode;
			}
			return prev;
		}
		
		public static void print(Node node) {
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
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
		
			System.out.println("Before: ");
			print(node1);
			System.out.println();
			Node node = reverseList(node1);
			System.out.println("After: ");
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