/*
 * package dummy;
 * 
 * public class DiameterOfATree {
 * 
 * static int[] heigt = new int[14]; public int diameter(Node root){ if(root ==
 * null){ return 0; }
 * 
 * int leftSubTreeHeight = root.left == null? 0: heigt[root.left.index];
 * 
 * int rightSubTreetHeight = root.right == null? 0:heigt[root.right.index];
 * 
 * int leftSubTreeDiameter = diameter(root.left);
 * 
 * int rightSubTreeDiameter = diameter(root.right);
 * 
 * int diameterPassingViaRoot = leftSubTreeHeight + rightSubTreetHeight +1;
 * 
 * int diameterNotPassingViaRoot = Math.max(leftSubTreeDiameter,
 * rightSubTreeDiameter);
 * 
 * int diameterOfTree = Math.max(diameterPassingViaRoot,
 * diameterNotPassingViaRoot);
 * 
 * return diameterOfTree; }
 * 
 * public int heightOfATree(Node root){ if(root == null){ return 0; }
 * 
 * int leftSubTreeHeight = heightOfATree(root.left); int rightSubTreeHeight =
 * heightOfATree(root.right);
 * 
 * int height = Math.max(leftSubTreeHeight, rightSubTreeHeight) +1;
 * 
 * heigt[root.index] = height;
 * 
 * return height;
 * 
 * } public static void main(String[] args) { DiameterOfATree bt = new
 * DiameterOfATree();
 * 
 * Node root = new Node(10,0); Node n1 = new Node(15,1); Node n2 = new
 * Node(5,2); Node n3 = new Node(4,3); Node n4 = new Node(7,4); Node n5 = new
 * Node(14,5); Node n6 = new Node(17,6); Node n7 = new Node(7,7); Node n8 = new
 * Node(8,8); Node n9 = new Node(9,9); Node n10 = new Node(10,10); Node n11 =
 * new Node(10,11); Node n12 = new Node(10,12); Node n13 = new Node(10,13);
 * 
 * root.left = n1; root.right = n2; n1.left = n3; n1.right = n4; n2.right = n5;
 * n4.left = n6; n4.right = n7; n5.right = n8; n8.left = n9; n8.right = n10;
 * n9.left = n11; n9.right = n12; n10.right = n13;
 * 
 * bt.heightOfATree(root);
 * 
 * 
 * System.out.println(bt.diameter(root));
 * 
 * }
 * 
 * } class Node{ Node left; Node right; int data; int index;
 * 
 * public Node(int data, int index){ this.data = data; this.index = index; } }
 */