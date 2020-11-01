/**
 * 
 */
package hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class UnionOfTwoArrays {

	public static void union(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return;
		}

		Set<Integer> set = new HashSet<>();

		for (Integer i : a) {
			set.add(i);
		}

		for (Integer i : b) {
			set.add(i);
		}

		print(set);
	}

	public static void print(Set<Integer> set) {
		for (Integer i : set) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 89, 24, 75, 11, 23, 24 };
		int[] b = { 89, 2, 4 };

		union(a, b);

	}

}
