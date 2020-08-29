package dummy;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {

	public Queue<Integer> reverse(Queue<Integer> queue){
		if(queue == null|| queue.size() == 0){
			return null;
		}
		/*
		 * if(queue.size() == 1){ return queue; }
		 */
		Stack<Integer> stack = new Stack<>();
		
		while(!queue.isEmpty()){
			stack.push(queue.poll());
		}
		
		while(!stack.isEmpty()){
			queue.add(stack.pop());
		}
		
		return queue;
	}
	
	public static void main(String[] args) {
		ReverseAQueue rq = new ReverseAQueue();
		 
		 Queue<Integer> qu = new LinkedList<>();
		 qu.add(1);
		 qu.add(2);
		 qu.add(3);
		 qu.add(4);
		 qu.add(5);
		 qu.add(6);
		 
		 Queue<Integer> q = rq.reverse(qu);
		 
		
		  for(Integer i:q){ 
		  System.out.print(i+" "); 
		  }
		 
		
		
	}

}
