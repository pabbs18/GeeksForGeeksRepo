/*
 * package dummy;
 * 
 * public class VerticalWidth { int count = 0;
 * 
 * public int verticalWidth(Node root){ if(root == null){ return 0; } count =1;
 * 
 * goDeepLeft(root); goDeepRight(root);
 * 
 * return count; }
 * 
 * public void goDeepLeft(Node root){ while(root.left != null){ count ++; root =
 * root.left; } }
 * 
 * public void goDeepRight(Node root){ while(root.right != null){ count ++; root
 * = root.right; } } public static void main(String[] args) {
 * 
 * 
 * Node root = new Node(10); Node n1 = new Node(15); Node n2 = new Node(5); Node
 * n3 = new Node(4); Node n4 = new Node(7); Node n5 = new Node(14); Node n6 =
 * new Node(17); Node n7 = new Node(7); Node n8 = new Node(8);
 * 
 * root.left = n1; root.right = n2; //n1.left = n3; //n1.right = n4; //n2.left =
 * n5; //n2.right = n6; //n5.right = n7; //n6.right = n8;
 * 
 * VerticalWidth bt = new VerticalWidth();
 * 
 * System.out.println(bt.verticalWidth(root)); }
 * 
 * } class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */