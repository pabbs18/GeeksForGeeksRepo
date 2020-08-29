/*package dummy;

import java.util.ArrayList;
import java.util.List;

public class SerializeAndDeSerialize {

	static List<Integer> arrList = new ArrayList<>();
	public void serialize(Node root){
		if(root == null){
			arrList.add(-1);
			return;
		}
		arrList.add(root.data);
		serialize(root.left);
		serialize(root.right);
	}
	
	int index =0;
	
	public Node deSerialize(List<Integer> arrList){
	
		if(arrList.get(index) == -1 || index == arrList.size()){
			index++;
			return null;
		}
		
		Node root = new Node(arrList.get(index));
		index ++;
		root.left = deSerialize(arrList);
		root.right = deSerialize(arrList);
		
		return root;
		
	}
	
	public void preOrder(Node root){
		if(root == null){
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(5);
		
		Node n2 = new Node(10);
		Node n3 = new Node(3);
		Node n4 = new Node(9);
		Node n5 = new Node(8);
	
		Node n6 = new Node(4);
		Node n7 = new Node(7);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		
		SerializeAndDeSerialize bt = new SerializeAndDeSerialize();
		
		bt.serialize(n1);
		int i = 0;
		while(i<arrList.size()){
			System.out.print(arrList.get(i)+" ");
			i++;
		}
		
		Node rt = bt.deSerialize(arrList);
		System.out.println();
		bt.preOrder(rt);

	}

}

 * class Node{ Node left; Node right; int data;
 * 
 * public Node(int data){ this.data = data; } }
 */