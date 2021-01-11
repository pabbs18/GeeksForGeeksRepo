/**
 * 
 */
package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * https://www.youtube.com/watch?v=E5WSILx1q0Q
 * 
 * 
 */
public class MergeKSortedArrays {

	private static class Pair implements Comparable<Pair> {
		int listIndex;
		int dataIndex;
		int data;

		public Pair(int listIndex, int dataIndex, int data) {
			this.listIndex = listIndex;
			this.dataIndex = dataIndex;
			this.data = data;
		}

		public int compareTo(Pair o) {
			return this.data - o.data;
		}
	}

	public static List<Integer> mergeKSortedArrays(List<List<Integer>> lists) {
		if (lists == null || lists.size() == 0) {
			return null;
		}
		//priorityQueue to get the min of one element from each list
		Queue<Pair> priorityQueue = new PriorityQueue<>();
		List<Integer> result = new ArrayList<>();

		//First add the 0th index elements of all the arrays to the priority queue
		for (int i = 0; i < lists.size(); i++) {
			Pair pairObject = new Pair(i, 0, lists.get(i).get(0));
			priorityQueue.add(pairObject);
		}

		//By the time you exit for loop, priorityQueue would have decided the smallest object

		//Whichever element you remove from the priorityQueue, get the next element from the 
		//same list and add it to the priorityQueue.
		while (priorityQueue.size() > 0) {
			Pair pairObject = priorityQueue.remove();
			result.add(pairObject.data);

			// increment the index of this object
			pairObject.dataIndex++;

			//check if there are other elements from this particular list. If yes, then add to priority queue
			if (pairObject.dataIndex < lists.get(pairObject.listIndex).size()) {

				Pair pairObjectToAdd = new Pair(pairObject.listIndex, pairObject.dataIndex,

						lists.get(pairObject.listIndex).get(pairObject.dataIndex));

				priorityQueue.add(pairObjectToAdd);
			}

		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 1, 2, 3, 4, 5 };
		int[] c = { 4, 5, 6, 7 };

		List<List<Integer>> lists = new ArrayList<>();
		List<Integer> listA = new ArrayList<Integer>();
		List<Integer> listB = new ArrayList<Integer>();
		List<Integer> listC = new ArrayList<Integer>();

		for (Integer i : a) {
			listA.add(i);
		}

		for (Integer i : b) {
			listB.add(i);
		}

		for (Integer i : c) {
			listC.add(i);
		}

		lists.add(listA);
		lists.add(listB);
		lists.add(listC);

		List<Integer> list = mergeKSortedArrays(lists);

		for (Integer i : list) {
			System.out.print(list.get(i) + " ");
		}
	}

}
