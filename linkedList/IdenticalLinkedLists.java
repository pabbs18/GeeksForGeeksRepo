/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class IdenticalLinkedLists {
		
		public static boolean isIdentical(Node head1, Node head2) {
		
			if (head1 == null && head2 == null) {
				return true;
			}
		
			if (head1 == null && head2 != null || head1 != null && head2 == null) {
				return false;
			}
		
			if (head1.data == head2.data) {
				return isIdentical(head1.next, head2.next);
			}
			return false;
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
		
			Node node10 = new Node(1);
			Node node20 = new Node(2);
			Node node30 = new Node(3);
			Node node40 = new Node(41);
			Node node50 = new Node(5);
		
			node10.next = node20;
			node20.next = node30;
			node30.next = node40;
			node40.next = node50;
		
			System.out.println(isIdentical(node1, node10));
		
		}
		
		}
		
		class Node {
		
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		}*/