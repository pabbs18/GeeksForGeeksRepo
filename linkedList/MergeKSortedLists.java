/**
 * 
 */
/*
package linkedList;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 * 
	 *         https://www.techiedelight.com/efficiently-merge-k-sorted-linked-lists/
	 *//*
		public class MergeKSortedLists {
		
		public static Node mergeLists(Node left, Node right) {
			if (left == null) {
				return right;
			}
			if (right == null) {
				return left;
			}
		
			if (left.data <= right.data) {
				left.next = mergeLists(left.next, right);
				return left;
			} else {
				right.next = mergeLists(left, right.next);
				return right;
			}
		
		}
		
		public static Node mergeKLists(Node[] list, int k) {
			int last = k - 1;
		
			while (last != 0) {
				int i = 0;
				int j = last;
		
				while (i < j) {
					list[i] = mergeLists(list[i], list[j]);
		
					i++;
					j--;
		
					if (i >= j) {
						last = j;
					}
				}
			}
			return list[0];
		}
		
		public static void printList(Node node) {
			while (node != null) {
				System.out.print(node.data + " -> ");
				node = node.next;
			}
			System.out.print("null");
		}
		
		public static void main(String[] args) {
		
			int k = 3;
			Node[] list = new Node[k];
		
			list[0] = new Node(1);
			list[0].next = new Node(5);
			list[0].next.next = new Node(7);
		
			list[1] = new Node(2);
			list[1].next = new Node(3);
			list[1].next.next = new Node(6);
			list[1].next.next.next = new Node(9);
		
			list[2] = new Node(4);
			list[2].next = new Node(8);
			list[2].next.next = new Node(10);
		
			Node head = mergeKLists(list, k);
			printList(head);
		
		}
		
		}
		
		class Node {
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		}*/