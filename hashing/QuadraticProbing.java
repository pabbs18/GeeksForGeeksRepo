/**
 * 
 */
package hashing;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 */
public class QuadraticProbing {

	public static void quadraticProbingImplementation(int[] hashTable, int[] arr) {
		int n = arr.length;
		int hashSize = hashTable.length;

		for (int i = 0; i < n; i++) {
			int index = arr[i] % hashSize;
			if (hashTable[index] == -1) {
				hashTable[index] = arr[i];
			} else {
				for (int j = 1; j < hashSize; j++) {
					int k = arr[i] + j * j;
					index = k % hashSize;
					if (hashTable[index] == -1) {
						hashTable[index] = arr[i];
						break;
					}
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

	public static void quadraticProbingImplementation(int[] arr) {
		final int hashSize = 11;
		int[] hashTable = new int[hashSize];

		for (int i = 0; i < hashSize; i++) {
			hashTable[i] = -1;
		}

		quadraticProbingImplementation(hashTable, arr);

	}

	public static void main(String[] args) {
		int[] arr = { 21, 10, 32, 43 };
		quadraticProbingImplementation(arr);
	}

}
