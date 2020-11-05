/**
 * 
 */
package tree;

import java.util.Stack;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class LevelOrderTraversalInSpiralForm {

	public static void levelOrderTraversalInSpiralForm(Node root) {
		if (root == null) {
			return;
		}

		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();

		stack1.push(root);

		// R->L
		while (!stack1.isEmpty()) {
			Node node = stack1.pop();
			System.out.print(node.data + " ");
			if (node.right != null) {
				stack2.push(node.right);
			}
			if (node.left != null) {
				stack2.push(node.left);
			}
		}

		//push L -> R in stack 1
		while (!stack2.isEmpty()) {
			Node node = stack2.pop();
			System.out.print(node.data + " ");
			if (node.left != null) {
				stack1.push(node.left);
			}
			if (node.right != null) {
				stack1.push(node.right);
			}
		}

		// once all the pushing is complete, pop from both the stacks if any elemets left

		while (!stack1.isEmpty()) {
			Node node = stack1.pop();
			System.out.print(node.data + " ");
		}

		while (!stack2.isEmpty()) {
			Node node = stack2.pop();
			System.out.print(node.data + " ");
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

		levelOrderTraversalInSpiralForm(node1);

	}

}
