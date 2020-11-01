/**
 * 
 */
package hashing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class SortingElementsOfArrayByFrequency {
	public static void sortByFrequency(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}

		Map<Integer, Integer> map = new HashMap<>();

		// put all the entries with their frequencies in the map
		for (Integer i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		int size = map.size();

		// create an object array whose each entry is (key, value) pair.
		//This object array is used to sort the entries by their frequencies 
		Ob[] obArray = new Ob[size];

		int i = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Ob ob = new Ob(entry.getKey(), entry.getValue());
			obArray[i++] = ob;
		}

		//sort the entries in the descending order of their frequencies 
		Arrays.sort(obArray, new SortByValue());

		//print the sorted entries' key
		for (Ob obj : obArray) {
			int count = obj.y;
			while (count > 0) {
				System.out.print(obj.x + " ");
				count--;
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 9, 9, 9, 5, 2 };//{ 5, 5, 4, 6, 4 };
		sortByFrequency(arr);
	}

}

class Ob {
	int x;
	int y;

	public Ob(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class SortByValue implements Comparator<Ob> {
	@Override
	public int compare(Ob ob1, Ob ob2) {
		return ob2.y - ob1.y;// descending order
	}
}
