package reworkproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesfromSortedArray {
	/*
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	 */
	
	@Test
	public void example() {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(find1(nums));

	}

	private int find1(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i : nums) {
			if (map.containsKey(i)) {
				continue;
			}else {
				map.put(i, map.getOrDefault(i, 0)+1);
			}
		}
		
		return map.size();
		
	}

	private int find(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int c:nums) {
			set.add(c);
		}
		return set.size();
	}
	
	

}
