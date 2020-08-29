/*
 * package dummy;
 * 
 * public class CheckIfSubTree {
 * 
 * public boolean isSubtree(Node root1, Node root2){ if(root1 == null || root2
 * == null){ return true; }
 * 
 * if(contains(root1,root2)){ if(isIdentical(root1,root2)){ return true; } }
 * 
 * return false; }
 * 
 * public boolean contains(Node root1, Node root2){ if(root1.data ==
 * root2.data){ return true; } while(root1.left != null){ boolean l =
 * contains(root1.left, root2); } while(root1.right != null){
 * contains(root1.right, root2);
 * 
 * } return false; }
 * 
 * public boolean isIdentical(Node root1, Node root2){ if(root1 == null && root2
 * == null){ return true; } if((root1 == null && root2 !=null) || (root2 == null
 * && root1 != null)){ return false; } if(root1.data == root2.data){ boolean
 * leftTree = isIdentical(root1.left, root2.left); boolean rightTree =
 * isIdentical(root1.right, root2.right); if((leftTree && rightTree) == true ){
 * return true; } } return false; }
 * 
 * public static void main(String[] args) {
 * 
 * Node n26 = new Node(26); Node n10 = new Node(10); Node n3 = new Node(3); Node
 * n4 = new Node(4); Node n6 = new Node(6); Node nd3 = new Node(3); Node n30 =
 * new Node(30);
 * 
 * Node m10 = new Node(10); Node m4 = new Node(4); Node m6 = new Node(6); Node
 * m30 = new Node(30);
 * 
 * n26.left = n10; n26.right = n3; n10.left = n4; n10.right = n6; n3.right =
 * nd3; n6.left = n30;
 * 
 * m10.left = m4; m10.right = m6; m6.left = m30;
 * 
 * CheckIfSubTree bt = new CheckIfSubTree();
 * System.out.println(bt.isSubtree(n26,m10));
 * 
 * 
 * }
 * 
 * } class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */