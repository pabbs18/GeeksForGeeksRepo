/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 * 
	 *         1->2->4->null +4->5->6->null = 5->7->9->null
	 * 
	 *         https://leetcode.com/problems/add-two-numbers/discuss/1010/Is-this-Algorithm-optimal-or-what
	 *//*
		public class AddNumbersInTwoLists {
		
		public static Node addTwoLists(Node head1, Node head2) {
			Node h1 = null;
			Node h2 = null;
			if (head1 != null) {
				h1 = reverseList(head1);// takes order n time
			}
			if (head2 != null) {
				h2 = reverseList(head2);//takes order m time
			}
		
			Node node = addLists(h1, h2);// takes order m+n time
		
			return reverseList(node);// takes order m+n time
		
		}
		
		public static Node addLists(Node head1, Node head2) {
			if (head1 == null) {
				return head2;
			}
			if (head2 == null) {
				return head1;
			}
			Node c1 = head1;
			Node c2 = head2;
		
			Node sentinel = new Node(0);
			Node d = sentinel;
			int sum = 0;
			while (c1 != null || c2 != null) {
				sum = sum / 10;// gets the carry from the sum of previous numbers and is used for adding curr numbers
		
				if (c1 != null) {
					sum = sum + c1.data;
					c1 = c1.next;
				}
		
				if (c2 != null) {
					sum = sum + c2.data;
					c2 = c2.next;
				}
		
				d.next = new Node(sum % 10);// get only the unit's place. 
				d = d.next;
			}
			// if at the end there is still a carry term left
			if (sum / 10 == 1) {
				d.next = new Node(1);
				d = d.next;
			}
			return sentinel.next;
		}
		
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
		
		public static void print(Node head) {
			Node node = head;
		
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
		
			return;
		}
		
		public static void main(String[] args) {
			Node node1 = new Node(8);
			Node node2 = new Node(2);
			Node node3 = new Node(4);
			Node node4 = new Node(4);
			Node node5 = new Node(5);
			Node node6 = new Node(6);
			Node node7 = new Node(7);
		
			node1.next = node2;
			node2.next = node3;
		
			node4.next = node5;
			node5.next = node6;
			node6.next = node7;
		
			Node head = addTwoLists(node1, node4);
			print(head);
		
		}
		
		}
		
		class Node {
		Node next;
		Node random;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		}
		*/