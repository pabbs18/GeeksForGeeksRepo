/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class SubarrayWithGivenSum {

	public static void findIndexes(int[] a, int x) {
		if (a == null || a.length == 0 || x <= 0) {
			System.out.println("No subarray found");
			return;
		}

		int sum = 0;
		int start = 0;
		int i = start;
		//make sure start is also not out of index
		while (i < a.length) {
			if (sum == x) {
				break;
			}

			//otherwise add next element to sum			
			sum += a[i];

			//if sum exceeds given value, reduce the first element value from sum
			while (sum > x) {
				if (start < a.length) {
					sum = sum - a[start];
					start++;
				}
			}
			i++;
		}
		if (i == a.length) {
			System.out.println("No subarray found");
			return;
		}
		//decrement i, as it increases by 1 if sum==x before a[i] is used
		i--;
		System.out.println("start: " + start + "  end: " + i);

	}

	public static void main(String[] args) {
		int[] a = { 1, 4 };//{ 1, 4, 0, 0, 3, 10, 5 };//{ 1, 4, 20, 3, 10, 5 };//{ 1, 2, 3, 7, 5 };
		findIndexes(a, 0);

	}

}
