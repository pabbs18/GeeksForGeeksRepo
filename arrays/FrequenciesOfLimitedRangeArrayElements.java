/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * https://www.youtube.com/watch?v=B2hI-QPoisk
 * 
 * This is a Medium level problem. And you've to know this method before hand 
 * to come up with a soln in the interview
 * 
 */
public class FrequenciesOfLimitedRangeArrayElements {

	public static void getFrequency(int[] a) {
		if (a == null || a.length == 0) {
			return;
		}

		//since a[i] is between 1 and N

		//assume a[0] represents frequency of 1 , a[1] represents frequency of 2...

		//use the array element as 'index' to store the frequency at that 'index'
		//By making the element at that index as -1
		//(-1 cuz its safe to use as a 'count' since -ve numbers are not allowed)

		int i = 0;
		int n = a.length;
		while (i < n) {
			if (a[i] <= 0) {// already used for count
				i++;
				continue;
			}
			int index = a[i] - 1;// a[i]-1 and not just a[i] cuz 1 is represented by i=0; 2 is represented by i=1...
			// go to that index and mark it as a -1 inorder to count the frequency of a[i]
			if (a[index] < 0) {//i.e a[i] has been counted before, and this is another occurrence of a[i]
				a[index]--;// again reduce it by once to indicate that it has been counted once again
				a[i] = 0;// no need to save/store the already counted number. see next else part for better understanding
				i++;
			} else {
				//now you've to save the value of a[index] first, before replacing it with a -ve 1
				//This is done so that the frequency of a positive /untouched a[index] is not missed in the future
				a[i] = a[index];
				a[index] = -1;
				//i stays at a[i] 
			}
		}

		// now after processing, print the frequencies
		for (int j = 0; j < n; j++) {
			System.out.println("Frequency of " + (j + 1) + " is " + Math.abs(a[j]));
		}
	}

	public static void main(String[] args) {
		int[] a = { 3, 3, 3, 3 };//{ 2, 3, 2, 3, 5 };
		getFrequency(a);

	}

}
