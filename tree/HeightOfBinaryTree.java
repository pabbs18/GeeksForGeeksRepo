/**
 * 
 */
package tree;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class HeightOfBinaryTree {

	public static int heightOfBinaryTree(Node root) {
		if (root == null) {
			return 0;
		}
		return Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right)) + 1;
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node4.left = node5;
		node3.left = node6;

		System.out.println(heightOfBinaryTree(node1));

	}

}
