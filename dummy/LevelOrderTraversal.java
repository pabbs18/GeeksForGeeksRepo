/*
 * package dummy;
 * 
 * import java.util.LinkedList; import java.util.Queue;
 * 
 * public class LevelOrderTraversal { Queue<Node> queue = new LinkedList<>();
 * public void traverse(Node root){ if(root == null){ return; }
 * queue.offer(root); queue.offer(null); while(! queue.isEmpty()){ Node node =
 * queue.poll();
 * 
 * if(node == null){ System.out.println("$"); if(! queue.isEmpty()){
 * queue.offer(null); } } else{
 * 
 * if(node.left != null) { queue.offer(node.left); } if(node.right != null){
 * queue.offer(node.right); } System.out.print(node.data+", "); } } }
 * 
 * public static void main(String[] args) { Node root = new Node(1); Node n2 =
 * new Node(2); Node n3 = new Node(3); Node n4 = new Node(4); Node n5 = new
 * Node(5);
 * 
 * 
 * root.left = n2; root.right = n3; n2.left = n4; n2.right = n5;
 * 
 * LevelOrderTraversal bt = new LevelOrderTraversal(); bt.traverse(root);
 * 
 * }
 * 
 * } class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data= data; } }
 */