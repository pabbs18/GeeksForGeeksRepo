/*package dummy;

public class CountSubTreesHavingSameSum {
	static int count = 0;
	public int countSubTrees(Node root, int x){
		if(root == null){
			return 0;
		}
		
		int leftSubTreeSum = countSubTrees(root.left, x);
		int rightSubTreeSum = countSubTrees(root.right, x);
		
		int sum = leftSubTreeSum + rightSubTreeSum + root.data;
		
		if(sum == x){
			count ++;
		}
		
		return sum;
	}
	public static void main(String[] args) { 
		Node n1 = new Node(5);
		
		Node n2 = new Node(-10);
		Node n3 = new Node(3);
		Node n4 = new Node(9);
		Node n5 = new Node(8);
	
		Node n6 = new Node(-4);
		Node n7 = new Node(7);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		
		CountSubTreesHavingSameSum bt = new CountSubTreesHavingSameSum();
		bt.countSubTrees(n1, 7);
		System.out.println(count);
		

	}

}

  class Node{ Node left; Node right; int data;
  
  public Node(int data){ this.data = data; } }
 */