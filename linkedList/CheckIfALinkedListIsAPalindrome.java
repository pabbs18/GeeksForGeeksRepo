/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class CheckIfALinkedListIsAPalindrome {
		
		public static boolean isPalindrome(Node head) {
			if (head == null || head.next == null) {
				return false;
			}
		
			int length = getLength(head);
		
			int halfway = length / 2;
		
			Node node = head;
		
			for (int i = 1; i < halfway; i++) {
				node = node.next;
			}
			Node h2 = node.next;
			node.next = null;
		
			Node head2 = reverseLinkedList(h2);
		
			System.out.print("first linked list: ");
			print(head);
			System.out.println();
			System.out.print("Second linked list: ");
			print(head2);
			System.out.println();
		
			return isPalindrome(head, head2);
		
		}
		
		public static void print(Node node) {
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
			return;
		}
		
		public static Node reverseLinkedList(Node head) {
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
		
		public static boolean isPalindrome(Node head1, Node head2) {
			if (head1 == null && head2 != null || head2 == null && head1 != null) {
				return false;
			}
		
			while (head1 != null && head2 != null) {
				if (head1.data == head2.data) {
					System.out.println(
							"Inside main palindrome method: Head1.data = " + head1.data + "   Head1.data = " + head2.data);
					head1 = head1.next;
					head2 = head2.next;
				} else {
					return false;
				}
			}
			return true;
		}
		
		public static int getLength(Node head) {
			Node node = head;
			int count = 0;
			while (node != null) {
				count++;
				node = node.next;
			}
			return count;
		}
		
		public static void main(String[] args) {
			Node node1 = new Node(1);
			Node node2 = new Node(2);
			Node node3 = new Node(3);
			//Node node4 = new Node(4);
			Node node5 = new Node(3);
			Node node6 = new Node(2);
			Node node7 = new Node(1);
		
			node1.next = node2;
			node2.next = node3;
			node3.next = node5;
			//node4.next = node5;
			node5.next = node6;
			node6.next = node7;
		
			System.out.println(isPalindrome(node1));
		}
		
		}
		
		class Node {
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		}*/