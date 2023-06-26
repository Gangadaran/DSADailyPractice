package dailyMorningProblems;

import java.util.Arrays;

import org.junit.Test;

public class RotateArray {
	/*
	 * https://leetcode.com/problems/rotate-array/
	 */
	
	@Test
	public void example() {
		int[] nums = {1,2,3,4,5,6,7}; 
		int k = 3;
		
		// output = [5,6,7,4,1,2,3];
		
		System.out.println(Arrays.toString(find1(nums,k)));

	}

	private int[] find1(int[] nums, int k) {
		k = k%nums.length;
		rotate(nums,0,nums.length-1);
		rotate(nums,0,k-1);
		rotate(nums,k, nums.length-1);
		return nums;
		
	}
	
	 private void rotate(int[] nums, int start, int end){
	        while(start < end){
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        }
	    }

	private int[] find(int[] nums, int k) {
		int i =0, j = nums.length-k;
		
		while(j < nums.length) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j++;
		}
		nums[nums.length-1] = nums[i];
		
		return nums;
	}

}
