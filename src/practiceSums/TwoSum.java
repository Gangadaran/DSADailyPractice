package practiceSums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TwoSum {

	/*
	 * https://leetcode.com/problems/two-sum/
	 */

	@Test
	public void example() {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(Arrays.toString(findIndices3(nums, target)));

	}

	
	
	
	
	// Using Two pointers algo
	private int[] findIndices1(int[] nums, int target) {
		
		int left = 0, right = nums.length-1;
		while (left < right) {
			if (nums[left] + nums[right] == target) {
				return new int[] { left, right };
			} else if (nums[left] + nums[right] > target) {
				right--;
			} else {
				left++;
			}
		}

		return null;
	}
	// optimize code
	private int[] findIndices2(int[] nums, int target) {
		if(nums == null || nums.length < 2) {
			return null;
		}
		
		int left = 0, right = nums.length-1;
		while (left < right) {
			int sum = nums[left] + nums[right];
			if (sum == target) {
				return new int[] { left, right };
			} else if (sum > target) {
				right--;
			} else {
				left++;
			}
		}

		return null;
	}
	// using HashMap 
	private int[] findIndices3(int[] nums, int target) {
		if(nums == null || nums.length < 2) {
			return null;
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[]{map.get(complement), i};
	        }
	        map.put(nums[i], i);
	    }
		
		

		return null;
	}

//	 Using brute force
	private int[] findIndices(int[] nums, int target) {
		if (nums == null || nums.length < 2) {
			return null;
		}
		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {

					return new int[] { i, j };
				}
			}

		}

		
		return new int[] {};
	}

}
