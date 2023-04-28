package Day4;

import org.junit.Test;

public class MissingNumber {
	
	/*
	 * https://leetcode.com/problems/missing-number/description/
	 * 
	 * Given an array nums containing n distinct numbers in the range [0, n], 
	 * return the only number in the range that is missing from the array.
	 * 
	 */
	@Test
	public void tc1() {
		int[] nums = {0,1,2,3,5};
		System.out.println(findTheMissingNumber(nums));

	}
	/*
	 * n*(n+1)/2
	 */

	private int findTheMissingNumber(int[] nums) {
		int n = nums.length;
		int sum =0;
		for (int i = 0; i <= nums.length-1; i++) {
			  sum += nums[i];
		}
		
		return n*(n+1)/2 - sum;
	}

	
}
