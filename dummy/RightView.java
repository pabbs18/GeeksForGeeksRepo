/*
 * package dummy;
 * 
 * import java.util.LinkedList; import java.util.Queue;
 * 
 * 
 * public class RightView {
 * 
 * public void rightView(Node root){ if(root == null){ return; }
 * 
 * Queue<Node> q1 = new LinkedList<>(); Queue<Node> q2 = new LinkedList<>();
 * 
 * q1.offer(root); while(!q1.isEmpty() || !q2.isEmpty()){
 * System.out.println(q1.peek().data); while(!q1.isEmpty()){
 * 
 * Node node = q1.poll(); if(node.right != null){
 * System.out.println("adding to q2:"+node.right.data); q2.offer(node.right);
 * 
 * } if(node.left != null){ System.out.println("adding to q2:"+node.left.data);
 * q2.offer(node.left); }
 * 
 * }
 * 
 * System.out.println(q2.peek().data); while(!q2.isEmpty()){ Node node =
 * q2.poll(); if(node.right != null){
 * System.out.println("adding to q1:"+node.right.data); q1.offer(node.right); }
 * if(node.left != null){ System.out.println("adding to q1:"+node.left.data);
 * q1.offer(node.left); }
 * 
 * } } } public static void main(String[] args) { Node root = new Node(1); Node
 * n2 = new Node(2); Node n3 = new Node(3); Node n4 = new Node(4); Node n5 = new
 * Node(5); Node n6 = new Node(6); Node n7 = new Node(7); Node n8 = new Node(8);
 * 
 * root.left = n2; root.right = n3; n2.left = n4; n2.right = n5; n3.left = n6;
 * n3.right = n7; n4.right = n8;
 * 
 * RightView bt = new RightView(); bt.rightView(root);
 * 
 * }
 * 
 * } class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */