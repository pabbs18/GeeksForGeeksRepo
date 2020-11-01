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
 * Hash all the numbers that can be generated using the digits 1, 2, and 3.
	Traverse the input array and just see if the array element exists in the hash.
 */
public class NumbersContaining12Or3 {

	/* public static void numbersContaining12OR3(int[] arr) {
	 * if (arr == null || arr.length == 0) {
	 * return;
	 * }
	 * List<Integer> list = new ArrayList<>();
	 * for (Integer i : arr) {
	 * int n = i;
	 * while (n != 0) {
	 * int n = i % 10;
	 * if (n == 1 || n == 2 || n == 3) {
	 * list.add(i);
	 * break;
	 * } else {
	 * n = i / 10;
	 * }
	 * }
	 * }
	 * } */

	public static void numbersContaining123(int[] arr) {
		int num = 1; // used to store the number from get() and will be multiplied with 10 to generate next possible numbers
		int num2 = 1;// to keep track of max limit

		Map<Integer, Integer> map = new HashMap<>();

		int index = 1;// index to get the element from the array
		int ind = 3; // index used to store subsequent generated numbers 
		int max = 100000;

		// base numbers used to generate further numbers made of 1,2 or 3 only
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);

		while (num2 < max) {

			num = map.get(index);
			//eg: if num =1, then below condition will give 1*10 + 1 = 11
			if (((num * 10) + 1) < max) {
				ind = ind + 1;
				map.put(ind, num * 10 + 1);
			}
			//eg: if num =1, then below condition will give 1*10 + 2 = 12
			if (((num * 10) + 2) < max) {
				ind = ind + 1;
				map.put(ind, num * 10 + 2);
			}
			//eg: if num =1, then below condition will give 1*10 + 3 = 13
			if (((num * 10) + 3) < max) {
				ind = ind + 1;
				map.put(ind, num * 10 + 3);
			}

			index++;// to get the next indexed number from the hashmap
			num2 = num * 10 + 3;//  we use highest number calculated in this loop to stay with in the max limit
		}

		//Traverse the input array and just see if the array element exists in the hash.
		for (Integer i : arr) {
			if (map.containsValue(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 123, 1232, 456, 234, 32145 };
		numbersContaining123(arr);

	}

}
