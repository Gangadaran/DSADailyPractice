package reworkproblems;

import org.junit.jupiter.api.Test;

public class MinimumDifferenceBetweenHighestandLowestofKScores {
	/*
	 * https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
	 */
	
	@Test
	public void example() {
		int[] nums = {9,4,1,7};
		int k =2;
		find(nums,k);

	}

	private void find(int[] nums,int k) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1+i; j < nums.length; j++) {
				min = Math.min(min, Math.abs(nums[i]- nums[j]));
			}
		}
		System.out.println(min);
	}

}
