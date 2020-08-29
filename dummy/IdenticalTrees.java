/*
 * package dummy;
 * 
 * public class IdenticalTrees {
 * 
 * public boolean isIdentical(Node root1, Node root2){ if(root1 == null && root2
 * == null){ return true; } if((root1 == null && root2 != null) || (root1 !=
 * null && root2 == null)){ return false; }
 * 
 * if(root1.data == root2.data){ boolean leftSubTree = isIdentical(root1.left,
 * root2.left); boolean rightSubTree = isIdentical(root1.right, root2.right);
 * if(leftSubTree == true && rightSubTree == true){ return true; } } return
 * false; } public static void main(String[] args) { IdenticalTrees bt = new
 * IdenticalTrees();
 * 
 * Node root1 = new Node(10); Node n1 = new Node(15); Node n2 = new Node(5);
 * Node n3 = new Node(4); Node n4 = new Node(7); Node n5 = new Node(14); Node n6
 * = new Node(7); Node n7 = new Node(7); Node n8 = new Node(8); Node n9 = new
 * Node(9); Node n10 = new Node(10);
 * 
 * 
 * root1.left = n1; n1.left= n2;
 * 
 * n2.left = n3; n1.right = n4; n4.right = n7; n7.right = n8; n8.left = n9;
 * n9.right = n10;
 * 
 * n3.right = n5; n5.left = n6;
 * 
 * Node root2 = new Node(10); Node m1 = new Node(15); Node m2 = new Node(5);
 * Node m3 = new Node(4); Node m4 = new Node(7); Node m5 = new Node(14); Node m6
 * = new Node(7); Node m7 = new Node(7); Node m8 = new Node(8); Node m9 = new
 * Node(9); Node m10 = new Node(10);
 * 
 * 
 * root2.left = m1; m1.left= m2;
 * 
 * m2.left = m3; m1.right = m4; m4.right = m7; m7.right = m8; m8.left = m9;
 * m9.right = m10;
 * 
 * m3.right = m5; m5.left = m6;
 * 
 * System.out.println(bt.isIdentical(root1, root2));
 * 
 * }
 * 
 * }
 * 
 * class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */