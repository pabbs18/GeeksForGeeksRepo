/*
 * package dummy;
 * 
 * import java.util.HashMap; import java.util.Map; import
 * java.util.concurrent.atomic.AtomicInteger;
 * 
 * public class TreeFromPostOrderInorder { public Node construct(int[] inOrder,
 * int[] postOrder){ if(inOrder == null || postOrder == null || inOrder.length
 * != postOrder.length){ return null; }
 * 
 * int n = inOrder.length;
 * 
 * Map<Integer, Integer> map = new HashMap<>(); for(int i=0; i<n ;i++){
 * map.put(inOrder[i], i); } AtomicInteger index = new AtomicInteger(n-1);
 * return construct(0, n-1, postOrder, index, map); }
 * 
 * public Node construct(int inOrderStart, int inOrderEnd, int[] postOrder,
 * AtomicInteger pIndex, Map<Integer, Integer> map){
 * if(inOrderStart>inOrderEnd){ return null; }
 * 
 * Node root = new Node(postOrder[pIndex.getAndDecrement()]); int
 * rootIndexInInOrder = map.get(root.data); root.right =
 * construct(rootIndexInInOrder+1, inOrderEnd, postOrder, pIndex, map);
 * root.left = construct(inOrderStart, rootIndexInInOrder-1, postOrder, pIndex,
 * map);
 * 
 * return root; }
 * 
 * public void inorderTraversal(Node root) { if (root == null) { return; }
 * 
 * inorderTraversal(root.left); System.out.print(root.data + " ");
 * inorderTraversal(root.right); }
 * 
 * // Recursive function to perform postorder traversal of a binary tree public
 * void postorderTraversal(Node root) { if (root == null) { return; }
 * 
 * postorderTraversal(root.left); postorderTraversal(root.right);
 * System.out.print(root.data + " "); }
 * 
 * public static void main(String[] args) { int[] inorder = { 4, 2, 1, 7, 5, 8,
 * 3, 6 }; int[] postorder = { 4, 2, 7, 8, 5, 6, 3, 1 };
 * TreeFromPostOrderInorder bt = new TreeFromPostOrderInorder();
 * 
 * Node root = bt.construct(inorder, postorder);
 * 
 * System.out.print("Inorder	  : "); bt.inorderTraversal(root);
 * System.out.print("\nPostorder : "); bt.postorderTraversal(root);
 * 
 * }
 * 
 * } class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */