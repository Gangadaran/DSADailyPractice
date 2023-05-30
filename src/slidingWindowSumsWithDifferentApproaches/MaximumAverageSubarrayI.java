package slidingWindowSumsWithDifferentApproaches;

import org.junit.Test;

public class MaximumAverageSubarrayI {
	/*
	 * https://leetcode.com/problems/maximum-average-subarray-i/
	 */

	@Test
	public void example() {
		int[] nums = {5};
		int k = 4;

		System.out.println(findMaximum(nums, k));

	}

	private double findMaximum(int[] nums, int k) {
        if (nums.length <= 1) {
			return (double)nums[0];
		}
		int max = Integer.MIN_VALUE;
        int sum =0;
		for (int i = 0; i < k; i++) {
		sum += nums[i]; 
		max = Math.max(max, sum);
		
	}
		return (double)max;
	}
}
