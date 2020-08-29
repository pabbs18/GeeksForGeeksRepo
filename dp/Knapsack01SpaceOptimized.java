package dp;

public class Knapsack01SpaceOptimized {

	public static int knapsack(Item[] arr, int capacity) {
		if (arr.length == 0 || arr == null || capacity <= 0) {
			return 0;
		}

		int[] dp = new int[capacity + 1];

		for (int k = 0; k <= capacity; k++) {
			dp[k] = 0;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= capacity; j++) {

				int dontPickTheItem = dp[j];
				int pickTheItem = 0;

				if (j >= arr[i].weight) {
					pickTheItem = arr[i].value + dp[j - arr[i].weight];
				}

				dp[j] = Math.max(pickTheItem, dontPickTheItem);
			}
		}
		return dp[capacity];

	}

	public static void main(String[] args) {
		Item item1 = new Item(5, 60);
		Item item2 = new Item(3, 50);
		Item item3 = new Item(4, 70);
		Item item4 = new Item(2, 30);

		Item[] arr = { item1, item2, item3, item4 };

		System.out.println(knapsack(arr, 5));

	}

}

class Item {
	int weight;
	int value;

	public Item(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}
}