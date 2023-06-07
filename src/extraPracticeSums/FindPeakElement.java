package extraPracticeSums;

import org.junit.Test;

public class FindPeakElement {
	/*
	 * https://leetcode.com/problems/find-peak-element/
	 */
	
	@Test
	public void example() {
		int[] nums = {1,2,3,1};
		System.out.println(find(nums));

	}

	private int find(int[] nums) {
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (max==nums[i]) {
				return i;
			}
		}
		return -1;
	}

}
