package stack;

/* https://leetcode.com/problems/online-stock-span/discuss/640358/JAVA-Solution-With-visualization-and-easy-explained! */

import java.util.Stack;

public class StockSpan {

	private static Stack<int[]> stack = new Stack<>();

	public static int next(int price) {
		int span = 1;
		while (!stack.isEmpty() && price > stack.peek()[0]) {
			span += stack.peek()[1];
			stack.pop();
		}

		stack.push(new int[] { price, span });
		return span;
	}

	public static void stockSpan(int[] arr) {
		if (arr.length == 0) {
			System.out.println("Invalid");
		}

		for (Integer i : arr) {
			System.out.print(next(i) + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
		stockSpan(arr);

	}

}
