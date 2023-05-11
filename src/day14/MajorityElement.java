package day14;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MajorityElement {
	/*
	 * 169. Majority Element
	 * https://leetcode.com/problems/majority-element/
	 */
	
	@Test
	public void example() {
		int[] nums = {2,2,1,1,1};
		
		System.out.println(findMajority1(nums));
		System.out.println(findMajority(nums));

	}

	private int findMajority(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int majorityElement =0;
		int majorityCount = 0;
		for (int num : nums) {
			if (!map.containsKey(num)) {
				map.put(num, 1);
			}else {
				map.put(num, map.get(num)+1);
			}
			
			if (map.get(num) > majorityCount) {
				majorityCount = map.get(num);
				majorityElement =num;
			}
		}
		
		return majorityElement;
		// time O(n^2) space O(1)
	}

	// Using brute force
	private int findMajority1(int[] nums) {
		int majorityCount = nums.length / 2;
        
	    for (int num : nums) {
	        int count = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] == num) {
	                count++;
	            }
	        }
	        if (count > majorityCount) {
	            return num;
	        }
	    }

	    
	    return -1;
	    
	    // time O(n^2) space O(1)

	}

	
	
}
