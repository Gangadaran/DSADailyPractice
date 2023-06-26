package extraPracticeSums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
	/*
	 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
	 */
	
	@Test
	public void example() {
		int[] nums = {8,1,2,2,3};
		System.out.println(Arrays.toString(find1(nums)));

	}

	private int[] find1(int[] nums) {
		int[] temp = new int[nums.length];
		int[] count = new int[101];
		
		for (int i : nums) {
			count[i]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (nums[i] <) {
				
			}
		}
		
		
		
		
		
		
		return null;
	}

	private int[] find(int[] nums) {
	    
	    int[] temp = new int[nums.length];
	    int j =0;
		for(int c:nums) {
			int count =0;
	    	for (int i = 0; i < nums.length; i++) {
				if (nums[i] < c ) {
					count++;
				}
			}
	    	temp[j++]=count;
	    }
		return temp;
	}

}
