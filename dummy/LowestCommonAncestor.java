/*
 * package dummy;
 * 
 * public class LowestCommonAncestor { public Node lca(Node root, int x, int y){
 * if(root == null){ return null; } if(root.data ==x || root.data == y){ return
 * root; } Node leftTreeResult = lca(root.left, x,y); Node rightTreeResult =
 * lca(root.right, x,y);
 * 
 * if(leftTreeResult == null){ return rightTreeResult; } if(rightTreeResult ==
 * null){ return leftTreeResult; } return root; }
 * 
 * public static void main(String[] args) { Node root = new Node(1); Node n2 =
 * new Node(2); Node n3 = new Node(3); Node n4 = new Node(4); Node n5 = new
 * Node(5); Node n6 = new Node(6); Node n7 = new Node(7); Node n8 = new Node(8);
 * 
 * root.left = n2; root.right = n3; n2.left = n4; n2.right = n5; n3.left = n6;
 * n3.right = n7; n4.right = n8; LowestCommonAncestor bt = new
 * LowestCommonAncestor();
 * 
 * Node node = bt.lca(root,8,4); System.out.println(node.data); }
 * 
 * } class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */