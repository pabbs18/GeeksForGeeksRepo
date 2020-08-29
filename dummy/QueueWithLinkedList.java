/*package dummy;

public class QueueWithLinkedList {
	Node front = null;
	Node rear = null;
	
	public void enque(int i){
		Node node = new Node(i);
		
		if(rear == null){
			front = rear= node;
			return;
		}
		
		rear.next = node;
		rear = node;
	}
	
	public int deque(){
		if(front == null){
			return Integer.MIN_VALUE;
		}
		Node temp = front;
		front = front.next;
		
		if(front == null){
			rear = null;
		}
		
		int value = temp.data;
		return value;
	}
	
	public int peek(){
		if(front != null){
			return front.data;
		}
		else{
			return Integer.MIN_VALUE;
		}
	}
	public static void main(String[] args) {
		QueueWithLinkedList queue  = new QueueWithLinkedList();
		queue.enque(1);
		queue.enque(2);
		queue.enque(3);
		queue.enque(4);
		queue.enque(5);
		queue.enque(6);
		
		System.out.println("Peek is: "+queue.peek());
		
		System.out.println("Deleted "+queue.deque());
		
		System.out.println("Peek: "+queue.peek());
		
		System.out.println("Deleted "+queue.deque());
		System.out.println("Deleted "+queue.deque());
		System.out.println("Deleted "+queue.deque());
		System.out.println("Deleted "+queue.deque());
		
		System.out.println("Peek: "+queue.peek());
		

	}

}
class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
	}
}*/