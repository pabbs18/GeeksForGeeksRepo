/**
 * 
 */
package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * https://www.youtube.com/watch?v=JrzIgYS3SqM
 * 
 * Watch this video for first 9 mins only for the explanation.
 * 
 * Then 
 * Refer this code: https://practice.geeksforgeeks.org/problems/minimum-swaps/1/?track=PC-W3-Sor&batchId=127
 */
public class MinimumSwapsToSort {

	static class Pair {
		int element;
		int index;

		public Pair(int element, int index) {
			this.element = element;
			this.index = index;
		}
	}

	public static int MinimumSwapsToSort(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		List<Pair> list = new ArrayList<>();
		//add elements and their index to the list 
		for (int i = 0; i < arr.length; i++) {
			list.add(new Pair(arr[i], i));
		}

		// sort the list based of array values

		Collections.sort(list, new Comparator<Pair>() {
			public int compare(Pair o1, Pair o2) {
				if (o1.element > o2.element) {
					return 1;
				}
				return -1;
			}
		});

		// Now the elements are there in their correct position. 
		//Compare the sorted list against the unsorted one, to get number of swaps req'd

		int ans = 0;

		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			visited[i] = false;
		}

		for (int i = 0; i < arr.length; i++) {

			//if already marked visited or if the index value of an element is at its correct index
			if (visited[i] == true || list.get(i).index == i) {
				continue;
			}

			int j = i;
			int cycleSize = 0;

			while (!visited[j]) {

				// mark that index as visited
				visited[j] = true;
				// get the next index in the cycle
				j = list.get(j).index;
				cycleSize++;
			}

			if (cycleSize > 0) {
				ans += cycleSize - 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 9, 16, 15 }; //{ 1, 5, 4, 3, 2 };
		System.out.println("Min swaps: " + MinimumSwapsToSort(arr));

	}

}
