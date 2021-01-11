/**
 * 
 */
package searching;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * https://www.techiedelight.com/find-kth-smallest-element-array/
 * 
 * In a maxheap of size k, add elements one by one. Maxheap removes largest elements first.
 *  At the end you'll be left with k smallest elements. And at the root you'll have largest of the
 *  k smallest elements.
 * 
 */
public class KthSmallestElement {

	public static int kthSmallest(int[] a, int k) {
		if (a == null || a.length == 0) {
			return -1;
		}
		if (k > a.length) {
			return -1;
		}

		Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < k; i++) {
			pq.add(a[i]);
		}

		for (int i = k; i < a.length; i++) {
			// add only if next incoming element is smaller than the current root
			// we only want the smaller elements

			if (a[i] < pq.peek()) {
				pq.poll();
				pq.add(a[i]);
			}
		}

		return pq.peek();
	}

	public static void main(String[] args) {
		int[] a = { 4, 3, 7, 6, 5 };//{ 3, 5, 4, 2, 9 };
		System.out.println(kthSmallest(a, 4));

	}

}
