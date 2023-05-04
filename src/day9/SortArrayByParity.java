package day9;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayByParity {
	/*
	 * 905. Sort Array By Parity
	 * https://leetcode.com/problems/sort-array-by-parity/
	 * 
	 */

	@Test
	public void example() {
		int[] nums = { 5,7,2,3, 1, 2, 4 };
		System.out.println(Arrays.toString(addEvenNumberFirst(nums)));

	}

	private int[] addEvenNumberFirst(int[] nums) {
		int i = 0, j = nums.length-1;
		while (i <= j) {
             if(nums[i]%2==1 && nums[j]%2==0) {
            	 int temp = nums[i];
            	 nums[i] = nums[j];
            	 nums[j] = temp;
            	 j--;
            	 i++;
             } else if(nums[i]%2==0) {
            	 i++;
             } else if(nums[j]%2==1) {
            	 j--;
             }
             
		}
   return nums;
	}
}
