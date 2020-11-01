/**
 * 
 */
package hashing;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * Here we use an array as a hashTable
 * 
 */
public class LinearProbing {

	public static void linearProbingImplementation(int[] hashTable, int[] arr) {
		int n = arr.length;
		int hashSize = hashTable.length;
		//get the hashTable index from the arr element

		for (int i = 0; i < n; i++) {
			int tempIndex = arr[i] % hashSize;

			if (hashTable[tempIndex] == -1) {
				hashTable[tempIndex] = arr[i];
			} else {
				//we need counter, so that when we have checked all the slots in the hashTable
				//we should stop looking. Else we loop infinitely.
				int counter = 0;
				int k = (1 + arr[i]);
				while (counter < hashSize && hashTable[k % hashSize] != -1) {
					k = (1 + k);
					counter++;
				}
				//if counter<hashSize, it means that we exited the while loop as we have found an empty slot
				//before we finished searching all the slots of hashTable array.
				//if we exit the while loop for the condition (counter >= hashSize) then we searched all the 
				//slots and found none empty
				if (counter < hashSize) {
					hashTable[k % hashSize] = arr[i];
				}
			}
		}

		print(hashTable);
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void linearProbingImplementation(int[] arr) {
		final int hashSize = 10;
		int[] hashTable = new int[hashSize];

		for (int i = 0; i < hashSize; i++) {
			hashTable[i] = -1;
		}

		linearProbingImplementation(hashTable, arr);

	}

	public static void main(String[] args) {
		//int[] arr = { 4, 14, 24, 44 };
		int[] arr = { 9, 99, 999, 9999 };
		linearProbingImplementation(arr);
	}

}
