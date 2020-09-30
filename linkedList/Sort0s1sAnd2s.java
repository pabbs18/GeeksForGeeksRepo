/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 * @implNote Keep 3 pointers, Zero, One, Two. Walk through the list and attach
	 *           numbers to respective pointers to make 3 list. Finally attach all
	 *           the 3 lists to each other.
	 *//*
		public class Sort0s1sAnd2s {
		
		public static Node sort(Node head) {
			if (head == null || head.next == null) {
				return head;
			}
			Node zeroD = new Node(0);
			Node oneD = new Node(0);
			Node twoD = new Node(0);
		
			Node zero = zeroD;
			Node one = oneD;
			Node two = twoD;
		
			Node curr = head;
		
			while (curr != null) {
				if (curr.data == 0) {
					zero.next = curr;
					zero = zero.next;
				} else if (curr.data == 1) {
					one.next = curr;
					one = one.next;
				} else {
					two.next = curr;
					two = two.next;
				}
				curr = curr.next;
			}
		
			head = zeroD.next;
			zero.next = oneD.next == null ? twoD.next : oneD.next;
			one.next = twoD.next;
			two.next = null;
		
			return head;
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
			Node node3 = new Node(2);
			Node node4 = new Node(1);
			Node node5 = new Node(2);
			Node node6 = new Node(0);
			Node node7 = new Node(2);
			Node node8 = new Node(2);
		
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			node5.next = node6;
			node6.next = node7;
			node7.next = node8;
		
			System.out.print("Before: ");
			print(node1);
			System.out.println();
			Node head = sort(node1);
			System.out.print("After:  ");
			print(head);
		
		}
		
		}
		
		class Node {
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		}
		*/