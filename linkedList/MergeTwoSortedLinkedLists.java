/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class MergeTwoSortedLinkedLists {
		
		public static Node mergeLinkedLists(Node head1, Node head2) {
			Node head = new Node(0);
			Node tail = head;
		
			while (true) {
				if (head1 == null) {
					tail.next = head2;
					break;
				}
		
				if (head2 == null) {
					tail.next = head1;
					break;
				}
		
				if (head1.data <= head2.data) {
					tail.next = head1;
					head1 = head1.next;
				} else {
					tail.next = head2;
					head2 = head2.next;
				}
				tail = tail.next;
			}
		
			return head.next;
		}
		
		public static void print(Node node) {
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
		}
		
		public static void main(String[] args) {
			Node node1 = new Node(5);
			Node node2 = new Node(10);
			Node node3 = new Node(15);
			Node node4 = new Node(40);
		
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
		
			Node node5 = new Node(2);
			Node node6 = new Node(3);
			Node node7 = new Node(20);
		
			node5.next = node6;
			node6.next = node7;
		
			Node node = mergeLinkedLists(node1, node5);
		
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