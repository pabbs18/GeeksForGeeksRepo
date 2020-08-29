package dummy;

import java.util.Stack;

public class StackQueue {
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	
	public void enque(int i){
		stack1.push(i);
	}
	
	public int deque(){
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());				
			}
		}
		return stack2.pop();
	}
	
	public int peek(){
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());				
			}
		}
		return stack2.peek();
	}
	
	public static void main(String[] args) {		
		StackQueue queObj = new StackQueue();
		 queObj.enque(1);
		 queObj.enque(2);
		 queObj.enque(3);
		 queObj.enque(4);
		 queObj.enque(5);
		 
		 System.out.println(queObj.peek());
		 
		 queObj.deque();
		 queObj.deque();
		 queObj.deque();
		System.out.println(queObj.peek());
	}

}
