/**
 * 
 */
package tree;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class ChildrenSumParent {

	public static boolean sumOfChildern(Node root) {
		if (root == null) {
			return true;
		}

		int rut = root.data;
		int leftNode = root.left == null ? 0 : root.left.data;
		int rightNode = root.right == null ? 0 : root.right.data;

		if (leftNode == 0 && rightNode == 0) {
			return true;
		}

		if (rut == leftNode + rightNode) {

			boolean leftSubTree = sumOfChildern(root.left);

			boolean rightSubTree = sumOfChildern(root.right);

			if (leftSubTree && rightSubTree) {

				return true;
			}
		}

		return false;
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

		System.out.println(sumOfChildern(node1));

	}

}
