/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 * 
	 *         This uses Constant space
	 * 
	 *         https://github.com/bephrem1/backtobackswe/tree/master/Linked%20Lists/CloneLinkedListWithRandomPointers
	 * 
	 *         https://www.geeksforgeeks.org/clone-linked-list-next-random-pointer-o1-space/
	 *//*
		public class CloneLinkedListWithRandomPointers {
		
		public static Node copyList(Node head) {
			if (head == null) {
				return null;
			}
		
			// 1st pass: place each cloned list's nodes between each original list's nodes
			Node curr = head;
		
			while (curr != null) {
				Node node = new Node(curr.data);
				node.next = curr.next;
				curr.next = node;
		
				curr = node.next;
			}
			//2nd pass: Assign random pointers in the cloned list
			curr = head;
			while (curr != null) {
				if (curr.random != null) {
					curr.next.random = curr.random.next;
				}
				curr = curr.next == null ? curr.next : curr.next.next;
			}
			// 3rd pass: restore original list and make cloned list independent and connected
			curr = head;
			Node cloneCurr = head.next;
			Node cloneHead = cloneCurr;
		
			while (curr != null && cloneCurr != null) {
				if (curr.next != null && cloneCurr.next != null) {
					curr.next = cloneCurr.next;
					cloneCurr.next = curr.next.next;
				}
				curr = curr.next;
				cloneCurr = cloneCurr.next;
			}
		
			return cloneHead;
		}
		
		public static void print(Node head) {
			Node node = head;
		
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
			System.out.println();
			node = head;
			while (node != null) {
				System.out.println(
						node.random == null ? node.data + ".random = null" : node.data + ".random = " + node.random.data);
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
			Node node8 = new Node(8);
		
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			node5.next = node6;
			node6.next = node7;
			node7.next = node8;
		
			node1.random = node3;
			node3.random = node5;
			node5.random = node2;
			node2.random = node1;
		
			Node head = copyList(node1);
		
			print(head);
		
		}
		
		}
		
		class Node {
		Node next;
		Node random;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		}*/