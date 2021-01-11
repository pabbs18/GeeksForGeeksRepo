/**
 * 
 */
package searching;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * https://www.youtube.com/watch?v=X8hMbzW1DGU
 * 
 * Assume that the elements are exactly where they are supposed to be.
 * Eg: {1,2,3,4,5,6,7} at index 0,1,2,3,4,5,6
 * If a number in the above array is missing, then it is easy to tell which one is missing.
 * Here we saw that, array size is 7 and elements present are from 1 to 7. 
 * So if the given array is {0, -10, 1, 3, -20}, 
 * Put all the numbers where they are supposed to be. i.e if a number is a negative number 
 * or it is greater than the size of array(is length is 7, we expect max element as 7 ideally).
 * i.e 1 at first position, 3 at 3rd position and so on. 
 * In the second pass, check if an element is not at its rightful position. And return that element. 
 * 
 */
public class SmallestPositiveMissingNumber {

	public static int smallestPositiveMissingNumber(int[] a) {
		if (a == null || a.length == 0) {
			return 1;// since 1 is the smallest positive integer
		}

		int i = 0;
		while (i < a.length) {
			// if non -ve && if number is less than arr length+1
			// and the element is not in its rightful position
			if (a[i] > 0 && a[i] < a.length + 1 && a[i] != a[a[i] - 1]) {
				//put a[i] in its rightful position
				int otherIndex = a[i] - 1;

				int temp = a[i];
				a[i] = a[otherIndex];
				a[otherIndex] = temp;

				//don't ever do this
				/* int temp = a[i];
				 * a[i] = a[a[i] - 1];
				 * a[a[i] - 1] = temp; */
			} else {
				i++;
			}
		}

		//log

		for (Integer k : a) {
			System.out.print(k + " ");
		}

		// elements are now in their rightful position
		for (i = 0; i < a.length; i++) {
			if (a[i] != i + 1) {
				return i + 1;
			}
		}

		//if you reached end of array and no luck yet, then all the elements are in their ideal position
		//return next possible positive integer
		return a.length + 1;
	}

	public static void main(String[] args) {
		int[] a = { 2, 2, -2, 3 };//{ -2, 11, 1, 3, 2, 10, 4 };
		System.out.println("Missing: " + smallestPositiveMissingNumber(a));
	}

}
