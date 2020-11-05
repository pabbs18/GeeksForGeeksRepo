/**
 * 
 */
package tree;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class DetermineIfTwoTreesAreIdentical {

	public static boolean isIdentical(Node root1, Node root2) {

		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}

		if (root1.data == root2.data) {
			boolean isLeftSubTreeIdentical = isIdentical(root1.left, root2.left);
			boolean isRightSubTreeIdentical = isIdentical(root1.right, root2.right);

			if (isLeftSubTreeIdentical && isRightSubTreeIdentical) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);

		Node node11 = new Node(1);
		Node node21 = new Node(2);
		Node node31 = new Node(31);
		Node node41 = new Node(4);
		Node node51 = new Node(5);
		Node node61 = new Node(6);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node4.left = node5;
		node3.left = node6;

		node11.left = node21;
		node11.right = node31;
		node21.left = node41;
		node41.left = node51;
		node31.left = node61;

		System.out.println(isIdentical(node1, node11) == true ? "Identical" : "Not Identical");

	}

}
