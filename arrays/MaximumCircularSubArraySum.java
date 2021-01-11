/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *  Case 1: All Positive Numbers

		arr = [1,2,3,4]

The answer is 10, since the whole array makes upto Maximum sub array

Case 2: All Negative Numbers

		arr = [-1,-2,-3,-4]

The answer is the smallest number in the array which is -1

Case 3: Mix of Positive and Negative Numbers

The solution can be at two places

    [1,-2,3,-2] The answer is 3 which is in the middle----(1)
    [5,-3,5] The answer is 10 which is part of starting sub array and ending sub array--------(2)

Now: for (1) just use Kadane's algo.
for(2)... Take the total sum of array. And subtract the maximum negative portion taken from the array.
totalSum - maxNegativeSum. (For taking out the most minimum.. change elements sign, apply kadane's and get the maxSum. 
Now the maxSum is the most minimum. )

Now take max of the above two results.


https://leetcode.com/problems/maximum-sum-circular-subarray/discuss/178422/One-Pass
https://www.techiedelight.com/maximum-sum-circular-subarray/
https://dev.to/chakrihacker/maximum-sum-circular-subarray-6bk
https://medium.com/@saurav.agg19/maximum-sum-circular-subarray-437e6decd538

 */
public class MaximumCircularSubArraySum {

	public static int maximumCircularSubArraySum(int[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}

		//The maxSum can occur  between the ends or at the ends

		// if the maxSum lies between ends
		int maxSumInTheMiddle = maximumSubArraySum(a);

		/* //log
		 * System.out.println("maxSumInTheMiddle: " + maxSumInTheMiddle); */

		//if all numbers are -ve, then maxSum has least -ve number, which is the highest number
		if (maxSumInTheMiddle < 0) {
			return maxSumInTheMiddle;
		}

		int totalSum = 0;

		for (int i = 0; i < a.length; i++) {
			totalSum += a[i];
		}

		/* //log
		 * System.out.println("totalSum: " + totalSum); */

		//if maxSum lies at two ends:

		//first make all elements -ve
		for (int i = 0; i < a.length; i++) {
			a[i] = -a[i];

			/* //log
			 * System.out.print(a[i] + " "); */
		}

		/* //log
		 * System.out.println(); */

		//apply kadane's on the modified array
		int mostMin = maximumSubArraySum(a);

		/* //log
		 * System.out.println("mostMin: " + mostMin); */

		/* now mostMin is the maxSum of the modified array. Since it's taken from
		 * reversed array,
		 * change its sign to negative.
		 * Subtract mostMin from the total */
		int maxSumAtTheEnds = totalSum - (-mostMin);

		/* //log
		 * System.out.println("maxSumAtTheEnds: " + maxSumAtTheEnds); */

		/* Since there is no way of knowing if the maxSum lies between the ends
		 * Or at the ends, take max of the two cases */
		int maxSumOfCircularSubArray = Math.max(maxSumInTheMiddle, maxSumAtTheEnds);

		/* //log
		 * System.out.println("maxSumOfCircularSubArray: " +
		 * maxSumOfCircularSubArray); */

		return maxSumOfCircularSubArray;
	}

	/* This is Kadane's maxSubarraySum */
	public static int maximumSubArraySum(int[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}

		int currBest = a[0];
		int overAllBest = a[0];

		for (int i = 1; i < a.length; i++) {
			if (currBest >= 0) {
				currBest += a[i];
			} else {
				currBest = a[i];
			}
			if (currBest > overAllBest) {
				overAllBest = currBest;
			}
		}
		return overAllBest;
	}

	public static void main(String[] args) {
		int a[] = { 8, -8, 9, -9, 10, -11, 12 };
		System.out.println(maximumCircularSubArraySum(a));

	}

}
