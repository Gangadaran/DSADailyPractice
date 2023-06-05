package dailyMorningProblems;

import java.util.Arrays;


import org.junit.Test;

public class ProductofArrayExceptSelf {
	/*
	 * https://leetcode.com/problems/product-of-array-except-self/description/
	 */
	@Test
	public void example() {
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
		

	}

	//Brute force
	private int[] productExceptSelf(int[] nums) {
		int[] temp = new int[nums.length];
		int k =0;
		
			for (int i = 0; i < nums.length; i++) {
				int multi = 1;
				for (int j = 0; j < nums.length; j++) {
					if (nums[i]==nums[j]) {
						continue;
					}
					multi *=nums[j];
				}
				temp[k++] = multi;
			}
			
		
		
		return temp;
	}

}
