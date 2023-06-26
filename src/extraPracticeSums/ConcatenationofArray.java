package extraPracticeSums;

import java.util.Arrays;

import org.junit.Test;

public class ConcatenationofArray {
	/*
	 * https://leetcode.com/problems/concatenation-of-array/
	 */
	
	@Test
	public void example() {
		int[] nums = {1,2,1};
		System.out.println(Arrays.toString(find(nums)));

	}

	private int[] find(int[] nums) {
	    
		int[] temp = new int[2*nums.length];
		int k =0;
		for (int i = 0; i < temp.length; i++) {
			temp[i] = nums[k++];
			if (k==nums.length) {
				k=0;
			}
			
		}
		return temp;
	}

}
