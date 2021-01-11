/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * Explanation:  Sneha Herle 
 * 10 20 30 40 50
Index: 1
Rotations: {0,2} {1,4} {0,3}
Answer: Index 1 will have 30 after all the 3 rotations in the order {0,2} {1,4} {0,3}.

We performed {0,2} on A and now we have a new array A1.
We performed {1,4} on A1 and now we have a new array A2.
We performed {0,3} on A2 and now we have a new array A3.
Now we are looking for the value at index 1 in A3.
But A3 is {0,3} done on A2. -- 20 30 50 10 40
So index 1 in A3 is index 0 in A2.
But A2 is {1,4} done on A1.  30 50 10 20 40 
So index 0 in A2 is also index 0 in A1 as it does not lie in the range {1,4}.
But A1 is {0,2} done on A. 30 10 20 40 50
So index 0 in A1 is index 2 in A.

On observing it, we are going deeper into the previous rotations staring from the latest rotation.
{0,3}
|
{1,4}
|
{0,2}

This is the reason we are processing the rotations in reverse order.

Please note that we are not rotating the elements in the reverse order, just processing the index from reverse.
Because if we actually rotate in reverse order, we might get a completely different answer as in case of rotations the order matters.
 * 
 * 
 *   
 */
public class FindElementAtGivenIndexAfterNumberOfRotations {

	public static int find(int[] a, int[][] ranges, int index) {
		if (a == null || a.length == 0) {
			return 0;
		}

		//start from the last pair in the range array
		for (int i = ranges.length - 1; i >= 0; i--) {
			//if index falls within the range 
			if (ranges[i][0] <= index && index <= ranges[i][1]) {
				//now there are two cases possible
				//if index is at range beginning, then after a rotation index end will be in place of index beginning
				if (index == ranges[i][0]) {
					index = ranges[i][1];
				}
				//otherwise, before each rotation, the element at an index was one place behind
				else {
					index--;
				}
			}
		}

		return a[index];

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int[][] ranges = { { 0, 2 }, { 0, 3 } };
		int index = 1;

		System.out.println(find(arr, ranges, index));

	}

}
