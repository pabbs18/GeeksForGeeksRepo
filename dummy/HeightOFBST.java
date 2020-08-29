/*
 * package dummy;
 * 
 * 
 * public class HeightOFBST {
 * 
 * int[] dp = new int[11];
 * 
 * public int findHeight(Node root, int height){ if(root == null){ return 0; }
 * 
 * 
 * int lheight = findHeight(root.left, height) ;
 * 
 * 
 * int rheight = findHeight(root.right, height);
 * 
 * 
 * 
 * int h = Math.max(lheight, rheight) +1;
 * 
 * dp[root.index] = h;
 * 
 * return h;
 * 
 * 
 * }
 * 
 * public static void main(String[] args) { HeightOFBST bst = new HeightOFBST();
 * Node root = new Node(10,0); Node n1 = new Node(15,1); Node n2 = new
 * Node(5,2); Node n3 = new Node(4,3); Node n4 = new Node(7,4); Node n5 = new
 * Node(14,5); Node n6 = new Node(17,6); Node n7 = new Node(7,7); Node n8 = new
 * Node(8,8); Node n9 = new Node(9,9); Node n10 = new Node(10,10);
 * 
 * 
 * 
 * 
 * root.left = n1; n1.left= n2;
 * 
 * n2.left = n3; n1.right = n4; n4.left = n7; n7.right = n8; n8.left = n9;
 * n9.right = n10;
 * 
 * n3.right = n5; n5.left = n6;
 * 
 * 
 * 
 * int height = bst.findHeight(root, 0); System.out.println(height); for(int
 * i=0; i<bst.dp.length; i++){
 * System.out.println("Height of Node "+i+" is "+bst.dp[i]); } }
 * 
 * } class Node{ Node left; Node right; int data; int index;
 * 
 * public Node(int data, int index){ this.data = data; this.index = index;
 * 
 * } }
 */