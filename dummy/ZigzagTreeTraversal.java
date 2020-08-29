/*package dummy;


import java.util.Stack;

public class ZigzagTreeTraversal {
		
	public void zigzagTraversal(Node root){
		if(root == null){
			return;
		}
		
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		
		stack1.push(root);
		
		while(! stack1.isEmpty() || !stack2.isEmpty()){
		
				while(!stack1.isEmpty()){
					Node node = stack1.pop();
					System.out.print(node.data+" ");
					if(node.left != null){
					stack2.push(node.left);
					}
					if(node.right != null){
					stack2.push(node.right);
					}
				}
				
				while(!stack2.isEmpty()){
					Node node = stack2.pop();
					System.out.print(node.data+" ");
					if(node.right != null){
					stack1.push(node.right);
					}
					if(node.left != null){
					stack1.push(node.left);
					}
				}
		}
	}
	public static void main(String[] args) {
		Node n71 = new Node(7);
		
		Node n91 = new Node(9);
		Node n72 = new Node(7);
		Node n81 = new Node(8);
		Node n82 = new Node(8);
	
		Node n6 = new Node(6);
		Node n10 = new Node(10);
		
		Node n92 = new Node(9);
		
		n71.left = n91;
		n71.right = n72;
		n91.left = n81;
		n91.right = n82;
		n72.left = n6;
		n81.left = n10;
		n81.right = n92;
		
		
		
		ZigzagTreeTraversal bt = new ZigzagTreeTraversal();
		
		bt.zigzagTraversal(n71);

	}

}

 * class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; }
 * 
 * }
 */