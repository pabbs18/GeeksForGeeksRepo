/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class PairwiseSwapOfNodesInLinkeList {
		
		public static void pairwiseSwap(Node head) {
			if (head == null) {
				return;
			}
		
			Node node = head;
			int temp = 0;
			while (node != null) {
				if (node.next == null) {
					return;
				} else {
					temp = node.data;
					node.data = node.next.data;
					node.next.data = temp;
		
					node = node.next.next;
				}
		
			}
		
			return;
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
			Node node3 = new Node(3);
			Node node4 = new Node(4);
			Node node5 = new Node(5);
			Node node6 = new Node(6);
			Node node7 = new Node(7);
		
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			node5.next = node6;
			//node6.next = node7;
		
			System.out.print("Before: ");
			print(node1);
			pairwiseSwap(node1);
		
			System.out.println();
			System.out.print("After: ");
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