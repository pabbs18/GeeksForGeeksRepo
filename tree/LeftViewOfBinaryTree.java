/**
 * 
 */
package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class LeftViewOfBinaryTree {

	public static void leftView(Node root) {
		if (root == null) {
			return;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		queue.offer(null);
		System.out.println(root.data);

		while (!queue.isEmpty()) {
			Node node = queue.poll();

			if (node == null) {
				queue.offer(null);
				if (queue.peek() == null) {
					break;
				} else {
					System.out.println(queue.peek().data);
				}
			}

			else {
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
			}
		}
	}

	public static void main(String[] args) {
		Node node1 = new Node(10);
		Node node2 = new Node(8);
		Node node3 = new Node(2);
		Node node4 = new Node(3);
		Node node5 = new Node(5);
		Node node6 = new Node(2);
		Node node7 = new Node(9);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;

		leftView(node1);

	}

}
