/**
 * 
 */
package tree;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class VerticalWidthOfBinaryTree {

	public static int verticalWidthOfBinaryTree(Node root) {
		if (root == null) {
			return 0;
		}
		Set<Integer> set = new HashSet<>();
		root.vLevel = 0;
		assignLevel(root, set);

		return set.size();
	}

	public static void assignLevel(Node root, Set<Integer> set) {

		set.add(root.vLevel);

		if (root.left != null) {
			root.left.vLevel = root.vLevel - 1;
			assignLevel(root.left, set);
		}

		if (root.right != null) {
			root.right.vLevel = root.vLevel + 1;
			assignLevel(root.right, set);
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
		Node node9 = new Node(9);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node6.right = node8;
		node7.right = node9;

		System.out.println("verticalWidth: " + verticalWidthOfBinaryTree(node1));

	}

}
