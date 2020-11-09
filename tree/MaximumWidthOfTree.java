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
public class MaximumWidthOfTree {

	public static int maximumWidthOfTree(Node root) {
		if (root == null) {
			return 0;
		}

		Queue<Node> queue = new LinkedList<>();
		int count = 0;
		int max = Integer.MIN_VALUE;

		queue.offer(root);
		queue.offer(null);

		while (!queue.isEmpty()) {

			Node node = queue.poll();
			if (node == null) {
				queue.offer(null);
				max = count > max ? count : max;
				count = 0;
				if (queue.peek() == null) {
					break;
				}
			}

			if (node != null && node.left != null) {
				queue.offer(node.left);
				count++;
			}

			if (node != null && node.right != null) {
				queue.offer(node.right);
				count++;
			}
		}

		return max == Integer.MIN_VALUE ? 0 : max;

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

		System.out.println("Max width: " + maximumWidthOfTree(node1));

	}

}
