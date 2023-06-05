package dailyMorningProblems;

import java.util.Arrays;

import org.junit.Test;

public class SquaresofaSortedArray {
	/*
	 * https://leetcode.com/problems/squares-of-a-sorted-array/
	 */
	
	@Test
	public void example() {
		int[] nums = {-4,-1,0,3,10};
		System.out.println(Arrays.toString(sortedSquares(nums)));

	}

	private int[] sortedSquares(int[] nums) {
		int[] temp = new int[nums.length];
		int left =0, right = nums.length-1;
		int length = temp.length-1;
		while(length >=0) {
			if (Math.abs(nums[left]) > Math.abs(nums[right])) {
				temp[length--] = nums[left]*nums[left];
				left++;
			}else {
				temp[length--] = nums[right]*nums[right];
				right--;
			}
		}
		
				
				
				return temp;
	}

}
