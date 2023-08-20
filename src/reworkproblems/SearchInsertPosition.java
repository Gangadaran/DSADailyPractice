package reworkproblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class SearchInsertPosition {
	
	/*
	 * https://leetcode.com/problems/search-insert-position/
	 */
	
	@Test
	public void example() {
		int[] nums = {1,3,5,6};
		int target = 5;
		System.out.println(find1(nums,target));

	}
	
	

	private int find1(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int i =0;
		for(int num:nums) {
			map.put(num, i++);
		}
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		
		Iterator<Integer> iterator = map.values().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
		return -1;
	}

	private int find(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
