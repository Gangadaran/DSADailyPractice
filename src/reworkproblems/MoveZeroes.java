package reworkproblems;

import java.util.Arrays;


import org.junit.jupiter.api.Test;

public class MoveZeroes
 {
	
	/*
	 * https://leetcode.com/problems/move-zeroes/
	 */
	
	@Test
	public void example() {
		int[] nums = {0,1,0,3,12};
		find1(nums);

	}

	

	private int[] find1(int[] nums) {
		int[] temp = new int[nums.length];
		int i = 0;
		for(int c:nums) {
			if (c!=0) {
				temp[i] = c;
				i++;
			}
		}
		
		System.out.println(Arrays.toString(temp));
		
		return temp;
		
	}

	private void find(int[] nums) {
		int i = 0, j = nums.length-1;
		
		while(i <= j) {
			if (nums[i]==0 && nums[j] !=0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j--;
					
			}else {
				i++;
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
	}

}
