/**
 * 
 */
package arrays;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * https://leetcode.com/problems/trapping-rain-water/discuss/17357/Sharing-my-simple-c%2B%2B-code%3A-O(n)-time-O(1)-space
 * 
 * Check at the end for explanation
 */
public class TrappingRainWater {

	public static int trapWater(int[] height) {
		if (height == null || height.length == 0) {
			return 0;
		}
		int n = height.length;
		if (n < 3) {
			return 0;
		}
		int left = 0;
		int right = n - 1;

		int maxLeft = 0;
		int maxRight = 0;

		int amount = 0;

		while (left <= right) {
			if (height[left] <= height[right]) {
				if (height[left] >= maxLeft) {
					maxLeft = height[left];
				} else {
					amount += maxLeft - height[left];
				}
				left++;
			} else {//right wall boundary <left wall boundary
				if (height[right] >= maxRight) {
					maxRight = height[right];
				} else {
					amount += maxRight - height[right];
				}
				right--;
			}
		}
		return amount;
	}

	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };//{ 2, 0, 2 };//{ 3, 0, 2, 0, 4 };
		System.out.println(trapWater(a));

	}

}

/* class Solution {
 * public:
 * int trap(vector<int>& heights) {
 * int n = heights.size();
 * if(n < 3) return 0; // To trap the water, we need at least three heights
 * int left = 0, right = n-1;
 * int maxleft = 0, maxright = 0;
 * int amt = 0;
 * 
 * // Note: Throughout out the loop, these properties must hold
 * // 1. if heights[left] <= heights[right],
 * // for every i <= left, heights[i] <= heights[right]
 * // 2. if heights[left] > heights[right],
 * // for every j >= right, heights[left] > heights[j]
 * // ---------------------------------------
 * // Intuitively, you might think that you must know truemaxleft, truemaxright
 * // in order to compute (min(truemaxleft, truemaxright) - height)
 * // However, by the properties we maintain during the course of the procedure
 * // it can be show that we actually do not need to know the truemaxleft and
 * truemaxright.
 * // ---------------------------------------
 * // When we encounter a heights[left] <= heights[right]
 * // Due to the property 1., we know:
 * // min(truemaxleft, truemaxright) = min(maxleft <= heights[right],
 * truemaxright >= heights[right])
 * // Thus, we do NOT need to know the truemaxright!
 * while(left < right){
 * // Property 1.
 * if(heights[left] <= heights[right]){
 * if(heights[left] > maxleft) maxleft = heights[left];
 * else amt += maxleft - heights[left];
 * left++;
 * }
 * // Property 2.
 * else{
 * if(heights[right] > maxright) maxright = heights[right];
 * else amt += maxright - heights[right];
 * right--;
 * }
 * }
 * return amt;
 * }
 * }; */