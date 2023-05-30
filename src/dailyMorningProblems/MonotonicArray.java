package dailyMorningProblems;

import org.junit.Test;

public class MonotonicArray {
	
	/*
	 * https://leetcode.com/problems/monotonic-array/
	 */
	
	@Test
	public void example() {
		int[] nums = {1,2,2,3};
        System.out.println(isMonotonic(nums));
	}

	private boolean isMonotonic(int[] nums) {
		boolean increase = true;
		boolean decrease = true;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < nums[i + 1]) {
				decrease = false;
			}
			if (nums[i] > nums[i + 1]) {
				increase = false;
			}
		}
		return (increase || decrease);

	}

}
