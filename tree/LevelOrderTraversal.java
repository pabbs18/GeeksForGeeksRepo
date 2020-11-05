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
public class LevelOrderTraversal {

	public static void levelOrderTraversal(Node root) {
		if (root == null) {
			return;
		}

		Queue<Node> queue = new LinkedList<>();

		queue.offer(root);

		while (!queue.isEmpty()) {
			Node node = queue.poll();

			System.out.print(node.data + " ");

			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
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

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;

		levelOrderTraversal(node1);

	}

}
