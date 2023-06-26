package extraPracticeSums;

import java.util.Iterator;

import org.junit.Test;

public class NumberofGoodPairs {
	/*
	 * https://leetcode.com/problems/number-of-good-pairs/
	 */
	
	@Test
	public void example() {
		int[] nums = {1,2,3,1,1,3};
		System.out.println(find(nums));

	}

	private int find(int[] nums) {
		int length = nums.length-1;
		int count=0;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i]==nums[j] && i < j) {
					count++;
				}
			}
		}
		return count;
	}

}
