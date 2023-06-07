package extraPracticeSums;

import org.junit.Test;

public class MissingNumber {
	/*
	 * https://leetcode.com/problems/missing-number/
	 */
	
	@Test
	public void example() {
		int[] nums = {3,0,1};
		System.out.println(findMissingNumber(nums));

	}
    // using brute force
	private int findMissingNumber(int[] nums) {
		int n = nums.length;
		
		for (int i = 0; i <=n; i++) {
			boolean found = false;
			
			for (int j : nums) {
				if (i==j) {
					found = true;
					break;
				}
			}
			
			if (!found) {
				return i;
			}
			
			
		}
		return -1;
	}

}
