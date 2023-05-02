package week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class Day1_PlusOne {
	/*
	 * You are given a large integer represented as an integer array digits, 
	 * where each digits[i] is the ith digit of the integer. 
	 * The digits are ordered from most significant to least significant in left-to-right order. 
	 * The large integer does not contain any leading 0's.

        Increment the large integer by one and return the resulting array of digits.
	 */
	
	
	@Test
	public void example() {
		int [] nums = {1,2,3};
		plusOne(nums);
		System.out.println(Arrays.toString(nums));
		
	}
	
	@Test
	public void example1() {
		int [] nums = {9};
		
		System.out.println(Arrays.toString(plusOne(nums)));
		
		
	}
	
	
	
	private int[] plusOne(int[] nums) {
	    for (int i = nums.length - 1; i >= 0; i--) {
	        if (nums[i] != 9) {
	            nums[i]++;
	            return nums;
	                              
	            
	        }
	        nums[i] = 0;
	    }
	    System.out.println(nums);
	     nums = new int[nums.length + 1];
	     System.out.println(nums);
	    nums[0] = 1;
	    return nums;
	}


}
