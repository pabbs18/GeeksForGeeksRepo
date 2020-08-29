/*
 * package dummy;
 * 
 * 
 * 
 * public class MirrorTree { public void buildMirrorTree(Node root){ if(root ==
 * null){ return; } else{ Node temp;
 * 
 * buildMirrorTree(root.left); buildMirrorTree(root.right);
 * 
 * temp = root.left; root.left = root.right; root.right = temp; }
 * 
 * }
 * 
 * public void inOrder(Node root){
 * 
 * if(root == null){ return; } if(root.left != null){ inOrder(root.left); }
 * 
 * System.out.print(root.data+", ");
 * 
 * if(root.right != null){ inOrder(root.right); } } public static void
 * main(String[] args) { MirrorTree mt = new MirrorTree();
 * 
 * Node root = new Node(10); Node n1 = new Node(20); Node n2 = new Node(30);
 * Node n3 = new Node(40); Node n4 = new Node(60);
 * 
 * root.left = n1; root.right = n2; n1.left = n3; n1.right = n4;
 * 
 * System.out.println("Before: "); mt.inOrder(root); System.out.println();
 * mt.buildMirrorTree(root); System.out.println("After: "); mt.inOrder(root); }
 * 
 * } class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */