package twoPointerSumWithDifferentApproaches;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeroes {
	/*
	 * https://leetcode.com/problems/move-zeroes/
	 */
   @Test
	public void example() {
		int[] nums = {0,1,0,3,12};
		System.out.println(Arrays.toString(move2(nums)));

	}

	private int[] move2(int[] nums) {
		int zeroCount = 0;
		for(int num:nums) {
			if (num==0) {
				zeroCount++;
			}
		}
		int k =0;
		for (int i : nums) {
			if (i!=0) {
				nums[k++] = i;
			}
		}
		while(zeroCount > 0) {
			nums[k++] = 0;
			zeroCount--;
		}
		return nums;
	}

	// using brute force
   private int[] Move(int[] nums) {
		int[] temp = new int[nums.length];
		int k =0;
		for(int i =0; i < nums.length; i++) {
			if (nums[i]!=0) {
				temp[k++] = nums[i];
			}
		}
		
		return temp;
		
	}
   
   // using two pointer approache
   private int[] move1(int[] nums) {
	
	   int left = 0;
       int right = 0;

       while (right < nums.length) {
           if (nums[right] != 0) {
               int temp = nums[left];
               nums[left] = nums[right];
               nums[right] = temp;
               left++;
           }
           right++;
       }

	return nums;
}
}
