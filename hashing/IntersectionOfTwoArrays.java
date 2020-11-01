/**
 * 
 */
package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class IntersectionOfTwoArrays {

	public static void numberOfElementsInIntersection(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return;
		}

		Map<Integer, Integer> map = new HashMap<>();
		Stack<Integer> stack = new Stack<>();

		for (Integer i : a) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Integer i : b) {
			int num = map.getOrDefault(i, 0);
			if (num == 0 || num > 1) {
				continue;
			} else {

				if (num == 1) {
					stack.push(i);
				}
			}
		}

		print(stack);
	}

	public static void print(Stack<Integer> stack) {
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 89, 24, 75, 11, 23, 24 };
		int[] b = { 89, 2, 4 };

		numberOfElementsInIntersection(a, b);
	}

}
