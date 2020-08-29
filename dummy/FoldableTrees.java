/*
 * package dummy;
 * 
 * public class FoldableTrees {
 * 
 * public boolean isFoldable(Node root){ if(root == null){ return true; }
 * 
 * return isFoldable(root.left, root.right); }
 * 
 * public boolean isFoldable(Node node1, Node node2){ if(node1 == null && node2
 * == null){ return true; } if(node1 == null && node2 != null || node2 == null
 * && node1 != null){ return false; }
 * 
 * return isFoldable(node1.left, node2.right) && isFoldable(node2.left,
 * node1.right); } public static void main(String[] args) { Node n1 = new
 * Node(1); Node n2 = new Node(2); Node n3 = new Node(3); Node n4 = new Node(4);
 * Node n5 = new Node(5);
 * 
 * n1.left = n2; n1.right = n3; n2.right = n4; n3.right = n5;
 * 
 * FoldableTrees bt = new FoldableTrees();
 * 
 * System.out.println(bt.isFoldable(n1));
 * 
 * }
 * 
 * } class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */