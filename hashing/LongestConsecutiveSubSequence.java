/**
 * 
 */
package hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class LongestConsecutiveSubSequence {

	public static void longestConsecutiveSubSequence(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}

		Map<Integer, Boolean> map = new HashMap<>();

		// make all the numbers as starting point of their sequence(which is not true)
		for (Integer i : arr) {
			map.put(i, true);
		}

		//check in the hashmap, if a number is really the starting point of the sequence by checking 
		// if there is a number prior to that number

		for (Integer i : arr) {
			if (map.containsKey(i - 1)) {
				map.put(i, false);
			}
		}

		//now take only that are true and check if there are numbers after that 
		//in a consecutive manner in the hashMap get the length of their sequence

		int startingPoint = 0;
		int max = 0;

		for (Integer i : arr) {
			if (map.get(i) == true) {
				int l = 1;
				int sPoint = i;

				while (map.containsKey(i + l)) {
					l++;
				}
				if (l > max) {
					max = l;
					startingPoint = sPoint;
				}
			}
		}

		System.out.println("Length of LongestConsecutiveSubSequence : " + max);
		System.out.println("Subequence being: ");
		print(startingPoint, max);

	}

	public static void print(int start, int n) {
		while (n != 0) {
			System.out.print(start + " ");
			start++;
			n--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42 };

		longestConsecutiveSubSequence(arr);
	}

}
