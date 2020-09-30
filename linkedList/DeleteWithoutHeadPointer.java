/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class DeleteWithoutHeadPointer {
		
		public static void deleteNode(Node node) {
			if (node == null) {
				return;
			}
			// last node cannot be deleted
			if (node.next == null) {
				return;
			}
		
			node.data = node.next.data;
			node.next = node.next.next;
		
			return;
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
		
			System.out.println("Before deleting:");
			print(node1);
		
			System.out.println();
		
			System.out.println("After deleting:");
		
			deleteNode(node4);
		
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