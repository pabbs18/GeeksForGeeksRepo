package dummy;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
	
	public static void generate(int n){
		if(n<=0){
			return;
		}
		Queue<String> queue = new LinkedList<>();
		
		queue.add("1");
		
		while(n-->0){
			String s = queue.peek();
			queue.poll();
			
			System.out.println(s);
			queue.add(s+"0");
			queue.add(s+"1");
		}
	}
	public static void main(String[] args) {
		generate(5);

	}

}
