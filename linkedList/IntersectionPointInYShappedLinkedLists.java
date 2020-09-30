/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 */
/*
public class IntersectionPointInYShappedLinkedLists {

*//**
	 * @param args
	 *//*
		
		public static Node intersectPoint(Node head1, Node head2) {
		if (head1 == null) {
			return head2;
		}
		
		if (head2 == null) {
			return head1;
		}
		
		int len1 = getLength(head1);
		int len2 = getLength(head2);
		
		int diff = Math.abs(len1 - len2);
		
		if (len1 > len2) {
			for (int i = 0; i < diff; i++) {
				head1 = head1.next;
			}
		}
		
		if (len2 > len1) {
			for (int i = 0; i < diff; i++) {
				head2 = head2.next;
			}
		}
		
		while (head1 != null && head2 != null) {
			if (head1.data == head2.data) {
				return head1;// or head2;
			}
			head1 = head1.next;
			head2 = head2.next;
		}
		return head1;// or head2; Here it will be null, since we have checked all the nodes in both lists.
		
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
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(5);
		Node node4 = new Node(10);
		Node node5 = new Node(30);
		Node node6 = new Node(40);
		Node node7 = new Node(50);
		Node node8 = new Node(5);
		//Node node8 = new Node(15);
		Node node9 = new Node(10);
		//Node node9 = new Node(100);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		
		Node node = intersectPoint(node1, node5);
		
		if (node != null) {
			System.out.println(node.data);
		} else {
			System.out.println("null");
		}
		
		}
		
		}
		
		class Node {
		Node next;
		int data;
		
		public Node(int data) {
		this.data = data;
		}
		}*/