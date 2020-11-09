/**
 * 
 */
package tree;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class MirrorTree {

	public static Node mirror(Node root) {
		if (root == null) {
			return null;
		}
		//trust that leftSubTree and rightSubTree will take care of themselves when you pass them through 
		//the mirror function

		mirror(root.left);
		mirror(root.right);

		// once you've mirrored them, just swap them 
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;

		//return root;
		return root;

	}

	public static void printPreOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		printPreOrder(root.left);
		printPreOrder(root.right);
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;

		System.out.println("Before");
		printPreOrder(node1);
		System.out.println("\n");
		System.out.println("After");

		Node head = mirror(node1);
		printPreOrder(head);

	}

}
