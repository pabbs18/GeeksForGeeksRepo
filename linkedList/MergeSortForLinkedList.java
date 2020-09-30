/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class MergeSortForLinkedList {
		
		public static Node divide(Node head) {
			if (head == null || head.next == null) {
				return head;
			}
			Node middle = getMiddleNode(head);
			//System.out.println("Middle data: " + middle.data);
			Node nextToMiddle = middle.next;
		
			middle.next = null;
		
			Node left = divide(head);
			Node right = divide(nextToMiddle);
		
			Node result = conquer(left, right);
		
			return result;
		}
		
		public static Node conquer(Node left, Node right) {
			if (left == null) {
				return right;
			}
		
			if (right == null) {
				return left;
			}
			Node result = null;
		
			if (left.data <= right.data) {
				result = left;
				result.next = conquer(left.next, right);
			} else {
				result = right;
				result.next = conquer(left, right.next);
			}
		
			return result;
		}
		
		// 12-23-56-74-31-27-10
		public static Node getMiddleNode(Node h) {
			if (h == null)
				return h;
			Node fastptr = h.next;
			Node slowptr = h;
		
			while (fastptr != null) {
				fastptr = fastptr.next;
				if (fastptr != null) {
					slowptr = slowptr.next;
					fastptr = fastptr.next;
				}
			}
			return slowptr;
		}
		
		public static void print(Node node) {
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
			return;
		}
		
		public static void main(String[] args) {
			Node node1 = new Node(12);
			Node node2 = new Node(23);
			Node node3 = new Node(56);
			Node node4 = new Node(74);
			Node node5 = new Node(31);
			Node node6 = new Node(27);
			Node node7 = new Node(10);
		
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			node5.next = node6;
			node6.next = node7;
			System.out.println("Before");
			print(node1);
			Node head = divide(node1);
			System.out.println("After");
			print(head);
		
		}
		
		}
		
		class Node {
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		}*/