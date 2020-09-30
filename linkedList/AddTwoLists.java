/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 *//*
		public class AddTwoLists {
		
		public static int addLists(Node head1, Node head2) {
			int num1 = getNumber(head1);
			int num2 = getNumber(head2);
		
			int sum = num1 + num2;
		
			return sum;
		}
		
		public static int getNumber(Node head) {
			if (head == null) {
				return 0;
			}
			Node node = head;
			String num = "";
			while (node != null) {
				num = num + node.data;
				node = node.next;
			}
		
			return Integer.parseInt(num);
		}
		
		public static void main(String[] args) {
			Node node1 = new Node(4);
			Node node2 = new Node(5);
		
			Node node3 = new Node(3);
		
			Node node4 = new Node(4);
		
			Node node5 = new Node(5);
		
			node1.next = node2;
			node3.next = node4;
			node4.next = node5;
		
			System.out.println(addLists(node1, node3));
		
		}
		
		}
		
		class Node {
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		}*/