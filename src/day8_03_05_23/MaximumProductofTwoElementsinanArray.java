package day8_03_05_23;



import java.util.Iterator;

import org.junit.Test;

public class MaximumProductofTwoElementsinanArray {
	
	/*
	 * 1464. Maximum Product of Two Elements in an Array
	 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
	 */
	
	
	@Test
	public void example() {
		int[] nums = {3,4,5,2};
		System.out.println(findMaximumProduct(nums));

	}

	private int findMaximumProduct(int[] nums) {
		
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int num : nums) {
			if(num > max1) {
				max2=max1;
				max1=num;
			} else if(num > max2) {
				max2=num;
			}
		}
        return (max1-1)*(max2-1);	
	}
	
	private int findMaximumProduct1(int[] nums) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				int temp = (nums[i]-1)*(nums[i]-1);
				max = Math.max(max, temp);
			}
		}
      return max;
	}

}
  