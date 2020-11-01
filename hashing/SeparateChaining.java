/**
 * 
 */
package hashing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * here we are manually specifying hashSize
 * 
 */
public class SeparateChaining {

	public static void separateChainingImplementation(int[] arr, int hashSize, List<List<Integer>> hashTable) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int tempIndex = arr[i] % hashSize;
			hashTable.get(tempIndex).add(arr[i]);
		}

		for (List<Integer> list : hashTable) {
			for (Integer i : list) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] arr = { 92, 4, 14, 24, 44, 91 };
		List<List<Integer>> hashTable = new ArrayList<>();
		int hashSize = 10;
		for (int i = 0; i < hashSize; i++) {
			hashTable.add(new ArrayList<Integer>());
		}
		separateChainingImplementation(arr, hashSize, hashTable);

	}

}
