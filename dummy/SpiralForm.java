/*
 * package dummy;
 * 
 * import java.util.Stack;
 * 
 * public class SpiralForm {
 * 
 * public void traverse(Node root){
 * 
 * if(root == null){ return; }
 * 
 * int maxSize = 0; //for problem: maximum width of the tree Stack<Node> stack1
 * = new Stack<>(); Stack<Node> stack2 = new Stack<>();
 * 
 * 
 * stack1.push(root); maxSize = stack1.size()>maxSize? stack1.size():maxSize;
 * 
 * while(!stack1.isEmpty() || !stack2.isEmpty()){
 * 
 * while(!stack1.isEmpty()){
 * 
 * Node node = stack1.pop(); System.out.print(node.data+", ");
 * 
 * if(node.right != null){ stack2.push(node.right); } if(node.left != null){
 * stack2.push(node.left); } } maxSize = stack2.size()>maxSize?
 * stack2.size():maxSize; System.out.println(); while(!stack2.isEmpty()){
 * 
 * Node node = stack2.pop(); System.out.print(node.data+", ");
 * 
 * if(node.left != null){ stack1.push(node.left); } if(node.right != null){
 * stack1.push(node.right); }
 * 
 * } maxSize = stack1.size()>maxSize? stack1.size():maxSize;
 * System.out.println();
 * 
 * } System.out.println("max width: "+ maxSize); }
 * 
 * 
 * public static void main(String[] args) { Node root = new Node(1); Node n2 =
 * new Node(2); Node n3 = new Node(3); Node n4 = new Node(4); Node n5 = new
 * Node(5); Node n6 = new Node(6); Node n7 = new Node(7); Node n8 = new Node(8);
 * Node n9 = new Node(9); Node n10 = new Node(10); Node n11 = new Node(11); Node
 * n12 = new Node(12); Node n13 = new Node(13); Node n14 = new Node(14); Node
 * n15 = new Node(15);
 * 
 * 
 * root.left = n2; root.right = n3; n2.left = n4; n2.right = n5; n3.left = n6;
 * n3.right = n7; n4.left = n8; n4.right= n9; n5.left= n10; n5.right = n11;
 * n6.left = n12; n6.right = n13; n7.left = n14; n7.right = n15;
 * 
 * 
 * SpiralForm bt = new SpiralForm(); bt.traverse(root); }
 * 
 * } class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */