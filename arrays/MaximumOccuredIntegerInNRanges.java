/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * https://www.youtube.com/watch?v=czJe_yO1ruI&feature=youtu.be
 * 
 * By marking only the start and end element in a range with [1 and -1], 
 * all the frequencies between the ranges are considered as 1 for that particular range. 
 * i.e when you take a prefix sum(for 1 range), 
 * the element's frequency between the the min and max of a range is 1.
 *  
 *  Now for the next range, when you mark the range's start and end element as 1 and -1(1+max-range numnber)
 *  and if it overlaps with the previous range at some point, 
 *  say [1-5] 1 2 3 4 5 and [4-8] 4 5 6 7 8, the overlapped frequencies look like:
 *  
 *   [0 1 1 1 1 1 0 0 0 0]----for(1-5)
 *   [0 0 0 0 1 1 1 1 1 0]----for(4-8)
 * 	  0 1 2 3 4 5 6 7 8 9
 * If we add the frequencies:
 *   [0 1 1 1 2 2 1 1 1 0]-----------(1)
 *    
 *   OR
 *   
 *  other way of seeing it is: 
 *   0 1 2 3 4 5   6 7 8  9
 *  [  1     1    -1     -1]
 *   4 and 5 overlap above.
 *  If we take a prefix sum
 *   0 1 2 3 4 5  6 7 8  9
 *  [0 1 1 1 2 2  1 1 1  0]-----------(2)
 *     
 *    As we can see, (1) and (2) yield same result  
 *     
 * if you mark the range in the array with [1 and 1] for starting and ending number, then
 * when you take the prefix sum, the frequency of the numbesr after the max-range number
 * will also be positive.
 * That is why to avoid this, we use a -1 on the next number after max-range number, 
 * to mark the end of the range, so that it cancels out the prefix sum to a 0 for all the numbers after the 
 * max-range number.
 */
public class MaximumOccuredIntegerInNRanges {

	public static int maximumOccuredIntegerInNRanges(int[] low, int[] high) {
		if (low == null || low.length == 0) {
			return -1;
		}

		// get the max element in the high[] for max size of result array
		int max = Integer.MIN_VALUE;

		for (Integer i : high) {
			if (i > max) {
				max = i;
			}
		}

		int[] result = new int[max + 2];

		int n = low.length;

		// mark each low and high+1 range as 1 and -1 in the result array
		for (int i = 0; i < n; i++) {
			int left = low[i];
			int right = high[i];

			result[left] += 1;
			result[right + 1] += -1;
		}

		/* //log
		 * System.out.print("indexes array: ");
		 * for (int i = 0; i < result.length; i++) {
		 * System.out.print(i + " ");
		 * }
		 * System.out.println();
		 * 
		 * //log
		 * System.out.print("Result array: ");
		 * for (int i = 0; i < result.length; i++) {
		 * System.out.print(result[i] + " ");
		 * }
		 * System.out.println(); */

		//get prefix sum of result array
		for (int i = 1; i < result.length; i++) {
			result[i] += result[i - 1];
		}

		/* //log
		 * System.out.print("Prefix sum result array: ");
		 * for (int i = 0; i < result.length; i++) {
		 * 
		 * System.out.print(result[i] + " ");
		 * }
		 * System.out.println(); */

		int mostOccuring = result[0];
		int indexHoldingTheMaxFrequency = -1;

		//get the max (frequency) number(here it will be the index of the result array)
		for (int i = 0; i < result.length; i++) {
			if (result[i] > mostOccuring) {
				mostOccuring = result[i];
				indexHoldingTheMaxFrequency = i;
			}
		}

		return indexHoldingTheMaxFrequency;

	}

	public static void main(String[] args) {
		int[] low = { 1, 4, 3, 1 };//{ 1, 5, 9, 13, 21 };
		int[] high = { 15, 8, 5, 4 };//{ 15, 8, 12, 20, 30 };

		System.out.println("Max occuring number: " + maximumOccuredIntegerInNRanges(low, high));

	}

}
