/*
 * package dummy;
 * 
 * import java.util.LinkedList; import java.util.Queue;
 * 
 * public class LinkedListToBinaryTree {
 * 
 * public TreeNode convert(Node head, TreeNode root){ if(head == null){ return
 * null; }
 * 
 * root = new TreeNode(head.data); Queue<TreeNode> queue = new LinkedList<>();
 * queue.offer(root); head = head.next;
 * 
 * while(head != null){ TreeNode parent = queue.poll(); TreeNode rightChild =
 * null; TreeNode leftChild = null; leftChild = new TreeNode(head.data); head =
 * head.next; queue.offer(leftChild); if(head != null){ rightChild = new
 * TreeNode(head.data); head= head.next; queue.offer(rightChild); } parent.left
 * = leftChild; parent.right = rightChild; } return root; }
 * 
 * public void inOrderTraversal(TreeNode root){ if(root == null){ return ; }
 * if(root.left != null){ inOrderTraversal(root.left); }
 * System.out.println(root.data); if(root.right != null){
 * inOrderTraversal(root.right); } }
 * 
 * public static void main(String[] args) { Node n1 = new Node(1); Node n2 = new
 * Node(2); Node n3 = new Node(3); Node n4 = new Node(4); Node n5 = new Node(5);
 * 
 * n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;
 * 
 * LinkedListToBinaryTree ob = new LinkedListToBinaryTree(); TreeNode root =
 * null; root = ob.convert(n1, root); ob.inOrderTraversal(root);
 * 
 * }
 * 
 * } class Node{ Node next; int data;
 * 
 * public Node(int data){ this.data = data; } }
 * 
 * class TreeNode{ TreeNode left; TreeNode right; int data;
 * 
 * public TreeNode(int data){ this.data = data; } }
 * 
 * 
 * 
 * 
 * 
 * 
 */