/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class NthNodeFromTheEndOfAList {
		
		public static int getNthFromLast(Node head, int n) {
			Node node = head;
			if (node == null || n < 0) {
				return -1;
			}
		
			int counter = 0;
			while (node != null) {
				counter++;
				node = node.next;
			}
		
			if (n > counter) {
				return -1;
			}
		
			node = head;
			int limit = counter - n;
		
			for (int i = 0; i < limit; i++) {
				node = node.next;
			}
		
			return node == null ? Integer.MIN_VALUE : node.data;
		}
		
		public static void main(String[] args) {
			Node node1 = new Node(1);
			Node node2 = new Node(2);
			Node node3 = new Node(3);
			Node node4 = new Node(4);
			Node node5 = new Node(5);
			Node node6 = new Node(6);
			Node node7 = new Node(7);
			Node node8 = new Node(8);
			Node node9 = new Node(9);
		
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			node5.next = node6;
			node6.next = node7;
			node7.next = node8;
			node8.next = node9;
		
			System.out.println(getNthFromLast(node1, -1));
		
		}
		
		}
		
		class Node {
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		}*/