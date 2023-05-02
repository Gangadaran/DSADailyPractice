package day6;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {
    /*
     * 283. Move Zeroes
     * https://leetcode.com/problems/move-zeroes/
     */
	@Test
	public void example() {
		
		int[] nums = {0,1,0,3,12};		
		//moveTheZeros(nums);
		moveTheZero(nums);
	}
/*
 * Pseudo code for brute force:
 * Define a function called "moveTheZeros" that takes an integer array "nums" as input.
 * Create a new integer array called "nums1" with the same length as "nums".
 * Create a variable "j" and set it to zero.
 * For each element "num" in "nums":
    If "num" is not equal to zero:
        Add "num" to "nums1" at index "j".
        Increment "j" by one.
 * Return "nums1".

 * 
 */
	
	
	/*
	 * 
	 */
	
	
	
	// using for loop
	private int[] moveTheZero(int[] nums) {
		int left =0, right =0;
		int temp=0;
		for (int i = right; i < nums.length;i++) {
			if (nums[right]==0) {
				right++;
			} else {
               temp = nums[left];
               nums[left] =nums[right];
               nums[right] = temp;
               left++;
               right++;
			}
		}
    return nums;
	}
	// using while loop
	private int[] moveTheZero3(int[] nums) {
		int left =0, right =0;
		int temp =0;
		while(right <nums.length) {
			if(nums[right]==0) {
				right++;
			}else {
				temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
				right++;
			}
		}
		return nums;
		
		}
  
	
	
	
	
	
	
	// brute force using for loop
	private int[] moveTheZeros1(int[] nums) {
		int[] nums1 = new int[nums.length];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				nums1[j]=nums[i];
				j++;
			}
		}
		
		return nums1;
	}
	// brute force using while loop
	private int[] moveTheZeros2(int[] nums) {
		int[] nums2 = new int[nums.length];
		int i =0;
		int j =0;
		while(i<nums2.length) {
			if(nums[i]!=0) {
				nums2[j]=nums[i];
				j++;
			}
			i++;
		}
      return nums2;
	}
	
}
