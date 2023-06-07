package extraPracticeSums;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FindtheDuplicateNumber {
	/*
	 * https://leetcode.com/problems/find-the-duplicate-number/
	 */
	@Test
	public void example() {
		int[] nums = {1,3,4,2,2};
		find1(nums);

	}

	private void find1(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int num:nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		System.out.println(map);
		
	}

	// using brute force
	private int find(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					return nums[i];
				}
			}
		}
		return -1;
	}

}
