package dailyMorningProblems;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SingleNumber {
	/*
	 * https://leetcode.com/problems/single-number/
	 */
	@Test
	public void example() {
		int[] nums = {4,1,2,1,2};
		System.out.println(findSingleNumber1(nums));

	}

	private int findSingleNumber1(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int num:nums) {
			if (set.contains(num)) {
				set.remove(num);
			}else {
				set.add(num);
			}
		}
		
		if (!set.isEmpty()) {
			return set.iterator().next();
		}
		return -1;
		
	}

	private int findSingleNumber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					count++;
				}
				
			}
			
			if (count==1) {
				return nums[i];
			}
		}
		return -1;
	}

}
