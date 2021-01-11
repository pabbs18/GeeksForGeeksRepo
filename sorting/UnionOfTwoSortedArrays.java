/**
 * 
 */
package sorting;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class UnionOfTwoSortedArrays {

	public static Set<Integer> union(int[] a, int[] b) {
		if (a == null || a.length == 0 && b == null || b.length == 0) {
			return null;
		}
		Set<Integer> set = new HashSet<>();

		if (a == null || a.length == 0) {
			for (Integer i : a) {
				set.add(i);
			}
			return set;
		}

		if (b == null || b.length == 0) {
			for (Integer i : b) {
				set.add(i);
			}
			return set;
		}

		int i = 0;
		int j = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				set.add(a[i]);
				i++;
			} else if (a[i] == b[j]) {
				set.add(a[i]);
				i++;
				j++;
			} else {
				set.add(b[j]);
				j++;
			}
		}

		while (i < a.length) {
			set.add(a[i++]);
		}

		while (j < b.length) {
			set.add(b[j++]);
		}

		return set;
	}

	public static void print(Set<Integer> set) {
		if (set == null) {
			System.out.println("Null set");
			return;
		}

		for (Integer i : set) {
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 1, 1 };//{ 2, 2, 3, 4, 5 };//{ 1, 2, 3, 4, 5 };
		int[] b = { 2, 2, 2, 2, 2 };//{ 1, 1, 2, 3, 4 };//{ 1, 2, 3 };

		Set<Integer> set = union(a, b);

		print(set);

	}

}
