package day7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class SingleNumber {
	/*
	 * 136. Single Number
	 * https://leetcode.com/problems/single-number/
	 * 
	 */
	@Test
	public void example() {
		int[] nums = {2,2,1};
		System.out.println(findSingleNumb(nums));
	}
	@Test
	public void example1() {
		int[] nums = {4,1,2,1,2};
		System.out.println(findSingleNumb(nums));
	}

	private int findSingleNumb(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					count++;
				}
			}
			
			if(count==1) {
				return nums[i];
			}
		}
      return -1;
	}
	
	
	private int findSingleNumber1(int[] nums) {
		Map<Integer, Integer> hm = new HashMap<>();
		for (int num : nums) {
			if (hm.containsKey(num)) {
				hm.put(num, hm.get(num)+1);
			}else {
				hm.put(num, 1);
			}
		}
		
		for (int num : hm.keySet()) {
			if (hm.get(num)==1) {
				return num;
			}
		}
		return -1;
	}

}
