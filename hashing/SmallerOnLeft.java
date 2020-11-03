/**
 * 
 */
package hashing;

import java.util.TreeSet;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * Using lower(element) method from TreeSet class, 
 * gives us the greatest element in this set strictly less than the given element, 
 * or null if there is no such element.
 */
public class SmallerOnLeft {

	public static void smallerOnLeft(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}
		TreeSet<Integer> treeSet = new TreeSet<>();
		int[] result = new int[arr.length];

		result[0] = -1;// no element next to first element
		treeSet.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			int element = arr[i];
			treeSet.add(element);
			Integer smaller = treeSet.lower(element);
			if (smaller != null) {
				result[i] = smaller;
			} else {
				result[i] = -1;
			}
		}

		print(result);
	}

	public static void print(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}

		for (Integer i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 1 };
		smallerOnLeft(arr);
	}

}
