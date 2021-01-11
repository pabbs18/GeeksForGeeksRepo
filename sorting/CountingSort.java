/**
 * 
 */
package sorting;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * https://www.youtube.com/watch?v=p-OyKUgIrx4
 */
public class CountingSort {

	public static int[] countingSort(int[] arr) {
		if (arr == null || arr.length == 0) {
			return null;
		}

		int min = getMin(arr);
		int max = getMax(arr);

		int range = max - min + 1;

		int[] farr = new int[range];

		// fill the frequency array
		for (int i = 0; i < arr.length; i++) {
			int index = arr[i] - min;
			farr[index]++;
		}

		//convert frequency array to prefix sum array

		for (int i = 1; i < farr.length; i++) {
			farr[i] = farr[i] + farr[i - 1];
		}

		int[] ans = new int[arr.length];

		//reverse fill the ans array
		for (int i = arr.length - 1; i >= 0; i--) {
			//get the value
			int val = arr[i];

			//get the val's deveserved position from farr (prefixed array)
			int pos = farr[val - min];

			//reduce by one so that we get the array index from 0
			int index = pos - 1;

			//put the val ar the index in the ans array
			ans[index] = val;

			//reduce the frequency by 1 in farr(prefixed array)
			farr[val - min]--;
		}
		//return ans array
		return ans;
	}

	public static int getMin(int[] arr) {

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int getMax(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int[] stringToIntArray(String s) {
		int[] num = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			num[i] = s.charAt(i) - '0';
		}

		return num;
	}

	public static String convertIntArrToString(int[] num) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < num.length; i++) {
			int a = num[i];
			char c = (char) (a + '0');
			sb.append(c);
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		int[] num = stringToIntArray(s);
		num = countingSort(num);
		System.out.println(convertIntArrToString(num));
	}

}
