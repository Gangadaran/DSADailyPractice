package reworkproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class TwoSum {
	
	/*
	 * https://leetcode.com/problems/two-sum/
	 */
	
	@Test
	public void example() {
		int[] nums = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(findTwoSum1(nums, target)));

	}

	private int[] findTwoSum1(int[] nums, int target) {
		Map<Integer, Integer>  map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	
		 for (int j = 0; j < nums.length; j++) {
		        for (int j2 = j + 1; j2 < nums.length; j2++) {
		            if (nums[j] + nums[j2] == target) {
		                return new int[] { j, j2 };
		            }
		        }
		    }

		
		return new int[] {};
	}

	private int[] findTwoSum(int[] nums, int target) {
		int i = 0; 
		int j = nums.length-1;
		
		while(i < j) {
			if (nums[i]+nums[j] == target) {
				return new int[] {i, j};
			}else if(nums[i]+nums[j] < target) {
				i++;
			}else {
				j--;
			}
		}
		
		return new int[] {};
		
	}
	
	

}
