package day14;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ContainsDuplicate {
	/*
	 * 217. Contains Duplicate
	 * https://leetcode.com/problems/contains-duplicate/
	 */
	@Test
	public void example() {
		int[] nums = {1,2,3,1};
		System.out.println(findDuplicate(nums));

	}

	private boolean findDuplicate(int[] nums) {
	Map<Integer, Integer> map = new HashMap<>();
	int maxOccurence = 2;
	for (int num : nums) {
		if (!map.containsKey(num)) {
			map.put(num, 1);
		}else {
			map.put(num, map.get(num)+1);
		}
		
		
		
		if (map.get(num) >= maxOccurence) {
			return true;
		}
	}
	
	return false;
	}

}
