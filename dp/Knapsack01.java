package dp;

public class Knapsack01 {

	public static int knapsack(Obj[] arr, int capacity) {
		if (capacity <= 0 || arr == null) {
			return 0;
		}

		int[][] dp = new int[arr.length + 1][capacity + 1];

		for (int col = 0; col <= capacity; col++) {
			dp[0][col] = 0;
		}

		for (int row = 0; row <= arr.length; row++) {
			dp[row][0] = 0;
		}

		for (int row = 1; row <= arr.length; row++) {
			for (int col = 1; col <= capacity; col++) {
				//don't use the current object
				int dontUseTheCurrentObject = dp[row - 1][col];

				//use the current object
				int useTheCurrentObject = 0;
				if (col >= arr[row - 1].weight) {
					useTheCurrentObject = arr[row - 1].value + dp[row - 1][col - arr[row - 1].weight];
				}

				dp[row][col] = Math.max(dontUseTheCurrentObject, useTheCurrentObject);
			}
		}

		for (int row = 0; row <= arr.length; row++) {
			for (int col = 0; col <= capacity; col++) {
				System.out.print(dp[row][col] + "  | ");
			}
			System.out.println();
		}

		return dp[arr.length][capacity];
	}

	public static void main(String[] args) {
		Obj obj1 = new Obj(5, 60);
		Obj obj2 = new Obj(3, 50);
		Obj obj3 = new Obj(4, 70);
		Obj obj4 = new Obj(2, 30);

		Obj[] arr = { obj1, obj2, obj3, obj4 };

		knapsack(arr, 5);

	}

}

class Obj {
	int weight;
	int value;

	public Obj(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}
}
