/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class SquareRoot {

	public static int squareRoot(int x) {

		int low = 0;
		int high = x;
		int ans = 0;
		return squareRoot(x, low, high, ans);
	}

	public static int squareRoot(int x, int low, int high, int ans) {
		while (low <= high) {
			System.out.println();
			int mid = low + (high - low) / 2;
			System.out.print("Mid: " + mid + " ");

			int midIntoMid = mid * mid;
			System.out.print("midIntoMid: " + midIntoMid + " ");
			if (midIntoMid == x) {
				return mid;
			}

			if (midIntoMid < x) {
				ans = mid;// why put mid here??
				System.out.print("Answer: " + ans + " ");
				return squareRoot(x, mid + 1, high, ans);
			}

			return squareRoot(x, low, mid - 1, ans);
		}
		System.out.println();
		return ans;
	}

	public static void main(String[] args) {
		System.out.println("squareRoot: " + squareRoot(1023));

	}

}
