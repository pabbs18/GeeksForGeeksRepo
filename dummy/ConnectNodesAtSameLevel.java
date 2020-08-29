/*
 * package dummy;
 * 
 * import java.util.LinkedList; import java.util.Queue;
 * 
 * public class ConnectNodesAtSameLevel { Node prev; Node current; public void
 * connect(Node root){ if(root == null){ return; }
 * 
 * Queue<Node> queue = new LinkedList<>(); queue.offer(root); queue.offer(null);
 * 
 * while(!queue.isEmpty()){ Node node = queue.poll();
 * 
 * 
 * 
 * if(node == null){ current.right = null; current = current.right; if(!
 * queue.isEmpty()){ queue.offer(null); } } else{ current = node;
 * 
 * if(prev != null){ prev.right = current; }
 * 
 * System.out.print(node.data+" ");
 * 
 * if(node.left != null){ queue.offer(node.left); } if(node.right != null){
 * queue.offer(node.right); } }
 * 
 * prev = current; } } public static void main(String[] args) { Node n1 = new
 * Node(1); Node n2 = new Node(2); Node n3 = new Node(3); Node n4 = new Node(4);
 * Node n5 = new Node(5); Node n6 = new Node(6); Node n7 = new Node(7);
 * 
 * n1.left = n2; n1.right = n3; n2.left = n4; n2.right = n5; n3.left = n6;
 * n3.right = n7;
 * 
 * ConnectNodesAtSameLevel bt = new ConnectNodesAtSameLevel(); bt.connect(n1);
 * System.out.println();
 * System.out.println(n6.right==null?"null":n6.right.data);
 * 
 * 
 * }
 * 
 * } class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */