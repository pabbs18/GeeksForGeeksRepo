/**
 * 
 */
/*
package linkedList;

import java.util.HashMap;
import java.util.Map;

*//**
	 * @author Neha Gaur
	 * @author Prabhanjan
	 * 
	 *         This uses linear space
	 *//*
		public class CloneALinkedListRandomPointers {
		
		public static Node copyLinkedList(Node head) {
			if (head == null) {
				return head;
			}
		
			Map<Node, Node> map = new HashMap<>();
		
			Node curr = head;
			//create a mapping of each node from original list to a corresponding new Node in the new list
			while (curr != null) {
				map.put(curr, new Node(curr.data));
				curr = curr.next;
			}
			//bring back curr to head
			curr = head;
			// head2 will be the head of clone list
			Node head2 = map.get(curr);
			//wire the new list using mapping from original list
			while (curr != null) {
				map.get(curr).next = map.get(curr.next);
				map.get(curr).random = map.get(curr.random);
				curr = curr.next;
			}
		
			return head2;
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
		
			Node head = copyLinkedList(node1);
		
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