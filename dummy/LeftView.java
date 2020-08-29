/*
 * package dummy;
 * 
 * public class LeftView { public void leftview(Node root){ if(root == null){
 * return; } System.out.print(root.data+", ");
 * 
 * while(root.left != null){ root = root.left; System.out.print(root.data+", ");
 * }
 * 
 * leftview(root.right);
 * 
 * }
 * 
 * public static void main(String[] args) { Node root = new Node(1); Node n2 =
 * new Node(2); Node n3 = new Node(3); Node n4 = new Node(4); Node n5 = new
 * Node(5); Node n6 = new Node(6); Node n7 = new Node(7); Node n8 = new Node(8);
 * Node n9 = new Node(9); Node n10 = new Node(10); Node n11 = new Node(11); Node
 * n12 = new Node(12);
 * 
 * 
 * root.left = n2; n2.left = n3; n3.left = n4; n4.right = n5; n5.left = n6;
 * n6.right = n7; n2.right = n8; n3.right = n9; root.right = n10; n10.left =
 * n11; n11.right = n12;
 * 
 * LeftView bt = new LeftView(); bt.leftview(root); }
 * 
 * }
 * 
 * class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data =data; } }
 */