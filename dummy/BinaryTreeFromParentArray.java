/*
 * package dummy;
 * 
 * import java.util.HashMap; import java.util.Map;
 * 
 * public class BinaryTreeFromParentArray {
 * 
 * public Node buildBT(int[] parent){ if(parent == null){ return null; }
 * Map<Integer, Node> map = new HashMap<>(); System.out.println("created map");
 * for(int i=0; i<parent.length; i++){ map.put(i, new Node(i)); }
 * System.out.println("added to map"); Node root = null; for(int i=0;
 * i<parent.length; i++){ if(parent[i] == -1){
 * System.out.println("Got the root"); root = map.get(i); } else{ Node node =
 * map.get(parent[i]); if(node.left != null){
 * 
 * node.right = map.get(i); System.out.println("node. right"); } else{ node.left
 * = map.get(i); System.out.println("node.left"+ node.left.data); } } }
 * 
 * return root; }
 * 
 * public void inOrder(Node root){ if(root == null){ return; }
 * inOrder(root.left); System.out.print(root.data+" "); inOrder(root.right); }
 * public static void main(String[] args) { int[] arr = {-1, 0, 0, 1, 1, 3, 5};
 * BinaryTreeFromParentArray bt = new BinaryTreeFromParentArray(); Node node =
 * bt.buildBT(arr); bt.inOrder(node);
 * 
 * }
 * 
 * } class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */