/*
package dummy;

public class BinaryTreeToCDLL { Node head; static Node prev = null;

public void convertBTtoDLL(Node current){ if(current == null){ return; }

//process the left node convertBTtoDLL(current.left);

//process the current node if(prev == null){ head = current; } else{
prev.right = current; current.left = prev; } prev = current;

//process the right node convertBTtoDLL(current.right); }

public void convertDllToCDll(){ prev.right = head; head.left = prev; }

public void printCDLL(){ Node iterator = head; int count =0;

do{ System.out.print(iterator.data+" "); iterator = iterator.right;
if(iterator == head){ count++; } } while(count <=2);

System.out.println(); } public static void main(String[] args) { Node n1 =
new Node(1); Node n2 = new Node(2); Node n3 = new Node(3); Node n4 = new
Node(4); Node n5 = new Node(5); Node n6 = new Node(6); Node n7 = new Node(7);

n1.left = n2; n1.right = n3; n2.left = n4; n2.right = n5; n3.left = n6;
n3.right = n7;



BinaryTreeToCDLL bt = new BinaryTreeToCDLL();

bt.convertBTtoDLL(n1);

bt.convertDllToCDll();

bt.printCDLL();


}

}

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
	this.data = data;
    }
}
*/