/*
 * package dummy;
 * 
 * 
 * 
 * public class SwapBST { Node firstElement ; Node lastElement ; Node
 * previousElement ;
 * 
 * public void modifiedInOrder(Node root){ if(root == null){ return; }
 * 
 * modifiedInOrder(root.left);
 * 
 * if(previousElement != null && previousElement.data > root.data){
 * if(firstElement == null){ firstElement = previousElement; } lastElement =
 * root; }
 * 
 * previousElement = root;
 * 
 * modifiedInOrder(root.right); }
 * 
 * public void swap(){
 * 
 * 
 * int temp = firstElement.data; firstElement.data = lastElement.data;
 * lastElement.data = temp; }
 * 
 * public void printInorder(Node root){ if(root == null){ return; }
 * printInorder(root.left); System.out.print(root.data+", ");
 * printInorder(root.right); }
 * 
 * public static void main(String[] args) { Node root = new Node(10); Node n1 =
 * new Node(15); Node n2 = new Node(5); Node n3 = new Node(4); Node n4 = new
 * Node(7); Node n5 = new Node(14); Node n6 = new Node(17);
 * 
 * root.left = n1; root.right = n2;
 * 
 * n1.left = n3; n1.right = n4;
 * 
 * n2.left = n5; n2.right = n6;
 * 
 * SwapBST bst = new SwapBST();
 * 
 * bst.printInorder(root); System.out.println(); bst.modifiedInOrder(root);
 * 
 * bst.swap(); bst.printInorder(root); }
 * 
 * } class Node{ Node left; Node right; int data;
 * 
 * public Node(int data) { this.data = data; } }
 */