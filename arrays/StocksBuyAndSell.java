/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class StocksBuyAndSell {

	public static int stockBuyAndSell(int[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}

		int amount = 0;
		int min = 0;
		int max = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[max]) {
				max = i;
			}
			if (a[i] < a[min]) {
				if (min < max) {
					amount += a[max] - a[min];
				}
				min = i;
				max = i;
			}
		}

		if (min < max) {
			amount += a[max] - a[min];
		}

		return amount;
	}

	public static void main(String[] args) {
		int[] a = { 4, 2, 2, 2, 4 };
		//{ 7, 6, 4, 3, 1 };//{ 7, 1, 5, 3, 6, 4 };//{ 100, 180, 260, 310, 40, 535, 695 };
		System.out.println(stockBuyAndSell(a));
	}

}
