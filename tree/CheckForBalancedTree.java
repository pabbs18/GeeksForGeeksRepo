/**
 * 
 */
package tree;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class CheckForBalancedTree {

	public static boolean isBalanced(Node root) {
		if (root == null) {
			return true;
		}
		int leftSubtreeHeight = height(root.left);
		int rightSubTreeHeight = height(root.right);

		if (Math.abs(leftSubtreeHeight - rightSubTreeHeight) > 1) {
			return false;
		}

		return true;
	}

	public static int height(Node root) {
		if (root == null) {
			return 0;
		}

		int leftSubTreeHeight = height(root.left);
		int rightSubTreeHeight = height(root.right);

		return Math.max(leftSubTreeHeight, rightSubTreeHeight) + 1;
	}

	public static void main(String[] args) {
		Node node1 = new Node(10);
		Node node2 = new Node(8);
		Node node3 = new Node(2);
		Node node4 = new Node(3);
		Node node5 = new Node(5);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node4.left = node5;

		System.out.println(isBalanced(node1) == true ? "Balanced" : "Not Balanced");

	}

}
