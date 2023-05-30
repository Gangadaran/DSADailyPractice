package twoPointerSumWithDifferentApproaches;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

public class SquaresofaSortedArray {
	/*
	 * https://leetcode.com/problems/squares-of-a-sorted-array/
	 * 
	 */
	
	@Test
	public void example() {
		int[] nums = {-4,-1,0,3,10};
		System.out.println(Arrays.toString(square1(nums)));

	}
   
	   // using O(n)
		private int[] square1(int[] nums) {
		int[] temp = new int[nums.length];
		int left =0, right = nums.length-1;
		int length = temp.length-1;
		while(length > 0) {
			if (Math.abs(nums[left]) > Math.abs(nums[right])) {
				temp[length--] = nums[left]*nums[left];
				left++;
			}
			temp[length--] = nums[right]*nums[right];
			right--;
		}
		return temp;
			
		}
	// using brute force
	private int[] square(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= nums[i];
		}
		
		for (int i = 0; i < nums.length -1; i++) {
			for (int j = 0; j < nums.length-i -1; j++) {
				if (nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		
		// Arrays.sort(nums);
		return nums;
		
	}

}
