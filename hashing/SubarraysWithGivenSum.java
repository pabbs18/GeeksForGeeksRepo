/**
 * 
 */
package hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * https://www.youtube.com/watch?v=HbbYPQc-Oo4
 * 
 * 
 * Create a currSum array(in a hashmap for O(1) access). 
 * If the currsum at an index == k, then increment the count by 1.
 * Else if it is not equal to k, then subtract k from currsum. If the difference value is present in the hashmap,
 * then..(it means that from the currsum if we subtract k and find a value equal to k, 
 * then we are able to move down an amount equal to k, i.e sum of that particular subArray is equal to k ) 
 * ..increase the count.
 * 
 * Also every currSum value needs to ve added to the hashMap, 
 * so that we can use them while finding the difference(currSum - k)
 */
public class SubarraysWithGivenSum {

	public static int subarraysWithGivenSum(int[] arr, int k) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;// to count all the subarrays
		int i = 0;//index
		int currSum = 0;
		int n = arr.length;

		while (i < n) {
			currSum = currSum + arr[i];
			// every currSum is put in hashMap
			map.put(currSum, map.getOrDefault(currSum, 0) + 1);

			//if that currSum is same as given sum(k), then a subarray of size at least 1 exists
			if (currSum == k) {
				count++;
			}

			// if not, then the diff of currSum - k may exist. i.e a subarray of sum, k exists.
			else if (map.containsKey(currSum - k)) {
				count++;
			}
			// move on to the next index in the array
			i++;
		}

		//logger statement
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		System.out.println();

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 7, 2, -3, 1, 4, 2 };

		System.out.println(subarraysWithGivenSum(arr, 0));
	}

}
