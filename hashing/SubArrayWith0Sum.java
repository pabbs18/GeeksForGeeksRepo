/**
 * 
 */
package hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * build a prefix sum array
 * 
 * https://www.youtube.com/watch?v=rpZfxmHTvJc
 * 
 * Hardik Raj
	6 months ago
	Explanation:
	Suppose we have the prefix sums as : 1, 5, 3, 1, 6, 2, 5
	Now see as we move from prefix sum 1->5 we have an increment of 4. 
	This means our sub-array has [4] or [1,2,1] or [2,2], basically elements that add upto 4.
	Now as we go from 5->1, we again have a drop of 4, 
	so our sub-array can have elements as [-4] , [-5,1] or [10,-16,2], basically which makes our sum as -4. 
	Now as we are considering a contiguous sub-array, 
	the elements causing increment by 4 and decrement by 4 will come in the same sub-array making the sum as 0 
 * 
 */
public class SubArrayWith0Sum {

	public static boolean zeroSumSubarray(int[] arr) {
		if (arr == null || arr.length == 0) {
			return false;
		}
		Map<Integer, Integer> map = new HashMap<>();
		int[] a = buildPrefixSumArray(arr);

		for (int i : a) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		//logger statement
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " :" + entry.getValue());
		}
		System.out.println();

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 2) {
				return true;
			}
		}

		return false;
	}

	public static int[] buildPrefixSumArray(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i] + arr[i - 1];
		}

		for (Integer i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		return arr;
	}

	public static void main(String[] args) {
		//int[] a = { -3, 2, 3, 1, 6 };

		int[] a = { 6, -1, -3, 4, -2, 2, 4, 6, -12, -7 };

		System.out.println(zeroSumSubarray(a));
	}

}
