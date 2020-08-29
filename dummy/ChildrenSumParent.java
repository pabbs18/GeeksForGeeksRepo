/*
 * package dummy;
 * 
 * public class ChildrenSumParent {
 * 
 * public boolean isSumProperty(Node root){ if(root == null){ return true; }
 * 
 * if(root.left == null && root.right == null){ return true; }
 * 
 * if(root.left == null){ if(root.data == root.right.data){ return
 * isSumProperty(root.right); } }
 * 
 * if(root.right == null){ if(root.data == root.left.data){ return
 * isSumProperty(root.left); } }
 * 
 * if(root.left != null && root.right != null && root.data == root.left.data +
 * root.right.data){ boolean leftSubTree = isSumProperty(root.left); boolean
 * rightSubTree = isSumProperty(root.right);
 * 
 * if(leftSubTree == true && rightSubTree == true){ return true; } }
 * 
 * return false; } public static void main(String[] args) { Node root = new
 * Node(10); Node n2 = new Node(10); Node n3 = new Node(10); Node n4 = new
 * Node(5); Node n5 = new Node(5);
 * 
 * 
 * root.left = n2; n2.right = n3; n3.left = n4; n4.right = n5;
 * 
 * ChildrenSumParent bt = new ChildrenSumParent();
 * 
 * System.out.println(bt.isSumProperty(root)); }
 * 
 * }
 * 
 * class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */