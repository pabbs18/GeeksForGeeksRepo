/*package dummy;

//public class Queue {
	
	int[] array = new int[10000];
	int front =0;
	int rear =0;
		int size = 0;
	public void insert(int i){
		if(size == array.length){
			return;
		}
		array[rear++] = i;
		size++;
	}
	
	public int delete(){
		
		if(front == rear || size == array.length){
			return Integer.MIN_VALUE;
		}
		return array[front++];		
	}
	
	public int peek(){
		if(front == rear || size == array.length){
			return Integer.MIN_VALUE;
		}
		 return array[front];
	}
	public static void main(String[] args) {
		Queue queue  = new Queue();
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);
		queue.insert(6);
		
		System.out.println("Peek: "+queue.peek());
		
		System.out.println("Deleted "+queue.delete());
		
		System.out.println("Peek: "+queue.peek());
		
		System.out.println("Deleted "+queue.delete());
		System.out.println("Deleted "+queue.delete());
		System.out.println("Deleted "+queue.delete());
		System.out.println("Deleted "+queue.delete());
		
		System.out.println("Peek: "+queue.peek());
		
		

	}

}
*/