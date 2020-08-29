/*
 * package dummy;
 * 
 * public class BalancedBinaryTree {
 * 
 * public boolean isBalanced(Node root){ if(root == null){ return true; }
 * if(modifiedPostorder(root)== -1){ return false; } return true; }
 * 
 * public int modifiedPostorder(Node node){ if(node == null){ return 0; }
 * 
 * int leftHeight = modifiedPostorder(node.left); if(leftHeight == -1){
 * System.out.println("Skipping right subtree"); return -1; }
 * 
 * int rightHeight = modifiedPostorder(node.right); if(rightHeight == -1){
 * return -1; } if(Math.abs(leftHeight - rightHeight)>1){ return -1; }
 * 
 * return Math.max(leftHeight, rightHeight)+1; }
 * 
 * public static void main(String[] args) { Node root = new Node(1); Node n2 =
 * new Node(2); Node n3 = new Node(3); Node n4 = new Node(4); Node n5 = new
 * Node(5); Node n6 = new Node(6); Node n7 = new Node(7); Node n8 = new Node(8);
 * Node n9 = new Node(9); Node n10 = new Node(10); Node n11 = new Node(11); Node
 * n12 = new Node(12); Node n13 = new Node(13); Node n14 = new Node(14); Node
 * n15 = new Node(15); Node n16 = new Node(16); Node n17 = new Node(17); Node
 * n18 = new Node(18); Node n19 = new Node(19);
 * 
 * 
 * root.left = n2; root.right = n3; n2.left = n4; n2.right = n5; n3.left = n6;
 * n3.right = n7; n4.left = n8; n4.right= n9; n5.left= n10; n5.right = n11;
 * n6.left = n12; n6.right = n13; n7.left = n14; n7.right = n15; n8.left = n16;
 * n16.left = n17; n17.left =n18; n18.left = n19;
 * 
 * BalancedBinaryTree bt = new BalancedBinaryTree();
 * System.out.println(bt.isBalanced(root)); }
 * 
 * } class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */