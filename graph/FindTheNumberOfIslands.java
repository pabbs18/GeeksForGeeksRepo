/**
 * 
 */
package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class FindTheNumberOfIslands {

	public static int numberOfIslands(List<List<Integer>> list, int m, int n) {
		if (list == null) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (list.get(i).get(j) == 1) {
					findNeighbours(list, i, j);
					count++;
				}
			}
		}
		return count;
	}

	public static void findNeighbours(List<List<Integer>> list, int m, int n) {
		if (m < 0 || n < 0 || m > list.size() - 1 || n > list.get(0).size() - 1) {
			return;
		}

		if (list.get(m).get(n) == 1) {
			list.get(m).set(n, 0);
			findNeighbours(list, m - 1, n);
			findNeighbours(list, m + 1, n);
			findNeighbours(list, m, n - 1);
			findNeighbours(list, m, n + 1);

		}
		return;
	}

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();

		Integer[] a = new Integer[] { 1, 1, 0, 0, 0 };
		Integer[] b = new Integer[] { 0, 1, 0, 0, 1 };
		Integer[] c = new Integer[] { 1, 0, 0, 1, 1 };
		Integer[] d = new Integer[] { 0, 0, 0, 0, 0 };
		Integer[] e = new Integer[] { 1, 0, 1, 0, 1 };

		List<Integer> l1 = Arrays.asList(a);
		List<Integer> l2 = Arrays.asList(b);
		List<Integer> l3 = Arrays.asList(c);
		List<Integer> l4 = Arrays.asList(d);
		List<Integer> l5 = Arrays.asList(e);
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		list.add(l5);

		System.out.println(numberOfIslands(list, 5, 5));

	}

}
