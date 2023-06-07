package extraPracticeSums;

import org.junit.Test;

public class MinimumDifferenceBetweenHighestandLowestofKScores {
	/*
	 * https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
	 * 
	 */
	
	@Test
	public void example() {
		int[] nums = {87063,61094,44530,21297,95857,93551,9918};
		int k =6;
		System.out.println(find(nums, k));

	}

	private int find(int[] nums, int k) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				int diff = nums[i] - nums[j];
				min = Math.min(min, Math.abs(diff));
			}
		}
		return min;
	}

}
