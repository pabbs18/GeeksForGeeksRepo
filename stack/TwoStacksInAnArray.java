package stack;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * @implNote This code implements 2 stacks in a single Array.
 */
public class TwoStacksInAnArray {
	private static int[] arr = new int[5];
	private static int top1 = -1;
	private static int top2 = arr.length;

	public static void initialize() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public static void push1(int num) {
		if (top1 < arr.length - 1 && arr[top1 + 1] == Integer.MIN_VALUE) {
			top1++;
			arr[top1] = num;
		}
		return;
	}

	public static void push2(int num) {
		if (top2 > 0 && arr[top2 - 1] == Integer.MIN_VALUE) {
			top2--;
			arr[top2] = num;
		}
		return;
	}

	public static int pop1() {
		if (top1 == -1) {
			return Integer.MIN_VALUE;
		}
		int value = arr[top1];
		arr[top1] = Integer.MIN_VALUE;
		top1--;
		return value;
	}

	public static int pop2() {
		if (top2 == arr.length) {
			return Integer.MIN_VALUE;
		}
		int value = arr[top2];
		arr[top2] = Integer.MIN_VALUE;
		top2++;
		return value;
	}

	public static void main(String[] args) {
		initialize();
		for (int i = 0; i < 3; i++) {
			push1(i + 10);
		}
		push2(6);
		System.out.println("Array values");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Popped: " + pop2());
		System.out.println("Popped: " + pop2());
		System.out.println("Popped: " + pop2());
		System.out.println("Array values");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
