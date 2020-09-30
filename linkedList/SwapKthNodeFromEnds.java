/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class SwapKthNodeFromEnds {
		
		public static Node swapKthNode(Node head, int numOfNodes, int k) {
			if (head == null) {
				return null;
			}
			// edge cases
			if (k <= 0 || numOfNodes == 1 || k > numOfNodes) {
				return head;
			}
		
			Node node = head;
			Node startFromFirst;
			Node startFromLast;
		
			for (int i = 0; i < k - 1; i++) {
				node = node.next;
			}
			startFromFirst = node;
		
			int limit = numOfNodes - k;
		
			node = head;
		
			for (int i = 0; i < limit; i++) {
				node = node.next;
			}
		
			startFromLast = node;
		
			int temp = startFromFirst.data;
			startFromFirst.data = startFromLast.data;
			startFromLast.data = temp;
		
			return head;
		
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
			swapKthNode(node1, 5, -1);
			System.out.println("After: ");
			print(node1);
		}
		
		}
		
		class Node {
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		}*/