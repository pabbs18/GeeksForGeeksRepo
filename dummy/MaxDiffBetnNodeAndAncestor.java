/*package dummy;

public class MaxDiffBetnNodeAndAncestor {
	
	
		
		static int res = Integer.MIN_VALUE;
			
	
	
	public int maxDiff(Node root){
	
	//			10
	//		   /  \
	//		 null  9
	
	// when we reach left sub tree and it s null, we should return max value so that min(max value, 9) is 9 and 10 -9 =1.
	// we cannot assume that just because there is null, its value is 0, since 0 can also be a node. 
	//We can't assume MIN_VAL since  min(minval, something) is always min. 
	//Hence its safe to assume that if there is null, 
	//then its a max val, so that between a maxval and a real number , the min is always a real number
		if(root == null){
			return Integer.MAX_VALUE;
		}
		//if its a leaf node, return its data.
		if(root.left == null && root.right == null){
			return root.data;
		}
		
		int minVal = Math.min(maxDiff(root.left), maxDiff(root.right));
		
		int diff = root.data - minVal;
		
		res = Math.max(res, diff);
		
		return Math.min(minVal, root.data);
		
	}
	public static void main(String[] args) {
		Node n1 = new Node(8);
		Node n2 = new Node(3);
		Node n3 = new Node(10);
		Node n4 = new Node(1);
		Node n5 = new Node(6);
		Node n6 = new Node(14);
		Node n7 = new Node(4);
		Node n8 = new Node(7);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;
		n5.left = n7;
		n5.right = n8;
		
		MaxDiffBetnNodeAndAncestor bt = new MaxDiffBetnNodeAndAncestor();
		bt.maxDiff(n1);
		System.out.println(res);

	}

}

  class Node{ Node left; Node right; int data;
  
  public Node(int data){ this.data = data; } }
 */