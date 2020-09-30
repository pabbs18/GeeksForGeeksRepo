/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class MergeSortDoublyLinkedList {
		
		public static Node divide(Node head) {
			if (head == null || head.next == null) {
				return head;
			}
		
			Node middle = getMiddleNode(head);
			System.out.println("Middle data: " + middle.data);
			Node nextToMiddle = middle.next;
			middle.next = null;
		
			Node left = divide(head);
			System.out.println("left data: " + left.data);
			Node right = divide(nextToMiddle);
			System.out.println("right data: " + right.data);
			System.out.println();
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
		
			if (left.data <= right.data) {
				left.next = conquer(left.next, right);
				left.next.prev = left;
				left.prev = null;
				return left;
			} else {
		
				right.next = conquer(left, right.next);
				right.next.prev = right;
				right.prev = null;
				return right;
			}
		
		}
		
		public static Node getMiddleNode(Node head) {
			if (head == null) {
				return head;
			}
			Node slow = head;
			Node fast = head.next;
		
			while (fast != null) {
				fast = fast.next;
				if (fast != null) {
					slow = slow.next;
					fast = fast.next;
				}
			}
			return slow;
		}
		
		public static void print(Node head) {
			Node node = head;
			System.out.print(node.data + " ");
			while (node.next != null) {
				System.out.print(node.next.data + " ");
				node = node.next;
			}
			System.out.println();
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.prev;
			}
			return;
		}
		
		public static void main(String[] args) {
			Node node1 = new Node(7);
			Node node2 = new Node(3);
			Node node3 = new Node(5);
			Node node4 = new Node(2);
			Node node5 = new Node(6);
			Node node6 = new Node(4);
			Node node7 = new Node(1);
			Node node8 = new Node(8);
		
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			node5.next = node6;
			node6.next = node7;
			node7.next = node8;
		
			node8.prev = node7;
			node7.prev = node6;
			node6.prev = node5;
			node5.prev = node4;
			node4.prev = node3;
			node3.prev = node2;
			node2.prev = node1;
		
			System.out.print("Before: ");
			print(node1);
			System.out.println();
			Node head = divide(node1);
			System.out.print("After:  ");
			print(head);
		
		}
		
		}
		
		class Node {
		Node next;
		Node prev;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		}*/