package reworkproblems;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class MaximumProductofTwoElementsinanArray {
	
	/*
	 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
	 */
	
	@Test
	public void example() {
		int[] nums = {3,4,5,2};
		find1(nums);

	}

	private void find1(int[] nums) {
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			max1 = Math.max(max1, nums[i]);
		
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (max1==nums[i]) {
				continue;
			}
			
			max2 = Math.max(max2, nums[i]);
		}
	  
		int max = (max1-1)*(max2-1);
		System.out.println(max);
		
	}

	private void find(int[] nums) {
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length-1; i++) {
			int temp = (nums[i]-1)*(nums[i+1]-1);
			max = Math.max(max, temp);
		}
		System.out.println(max);
	}

}
