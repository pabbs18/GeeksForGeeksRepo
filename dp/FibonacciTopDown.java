package dp;

public class FibonacciTopDown {

	public static int findNth(int n) {
		if (n < 0) {
			return -1;
		}
		int[] array = new int[n + 1];
		int j = findNth(n, array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		return j;
	}

	public static int findNth(int n, int[] array) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		array[n] = findNth(n - 1, array) + findNth(n - 2, array);

		return array[n];
	}

	public static void main(String[] args) {
		System.out.println(findNth(7));

	}

}
