/*package dummy;

import java.util.HashSet;
import java.util.Set;

public class NodeAtADistanceK {

	public void findNodes(Node root, int k){
		if(root == null || k <0){
			return;
		}
		int treeHeight = 4;
		int[] arr = new int[treeHeight];
		Set<Integer> set = new HashSet<>();
		findNodes(root, arr, set, k, 0);
		for(Integer i: set){
			System.out.print(i+" ");
		}
	}
	
	public void findNodes(Node root, int[] arr, Set<Integer> set, int k, int index){
		if(root == null){
			return;
		}
		
		arr[index] = root.data;
		
		if(root.left == null && root.right == null && index-k >=0){
			set.add(arr[index-k]);
			return;
		}
		
		findNodes(root.left, arr, set, k, index+1);
		findNodes(root.right, arr, set, k, index+1);
		
	}
	public static void main(String[] args) {
		Node n2 = new Node(2);
		
		Node n7 = new Node(7);
		Node n9 = new Node(9);
		Node n10 = new Node(10);
		
		Node n6 = new Node(6);
		Node n3 = new Node(3);
		Node n5 = new Node(5);
		Node n11 = new Node(11);
		
		n2.left = n7;
		n2.right = n9;
		n7.left = n10;
		n7.right = n6;
		n6.left = n5;
		n6.right = n11;
		n9.right = n3;
		
		NodeAtADistanceK bt = new NodeAtADistanceK();
		
		bt.findNodes(n2, 1);
		

	}

}

 * class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */