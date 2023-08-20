package reworkproblems;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class MajorityElement {
	/*
	 * https://leetcode.com/problems/majority-element/
	 */
	
	@Test
	public void example() {
		int[] nums = {2,2,1,1,1,2,2};
		
		System.out.println(find(nums));

	}

	private int find(int[] nums) {
		// Create a HashMap to store the frequency of each number
	    Map<Integer, Integer> map = new HashMap<>();

	    // Count the frequency of each number in the 'nums' array
	    for (int num : nums) {
	        map.put(num, map.getOrDefault(num, 0) + 1);
	    }

	    // Initialize variables to find the maximum frequency and its associated key
	    Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
	    int max = Integer.MIN_VALUE;
	    Map.Entry<Integer, Integer> next = null;

	    // Iterate through the entries of the HashMap to find the maximum frequency and associated key
	    while (entries.hasNext()) {
	        next = entries.next();
	        max = Math.max(max, next.getValue());
	    }

	    // Check if the 'next' entry has the maximum frequency and return its key
	    if (next.getValue() == max) {
	        return next.getKey();
	    }

	    // If no entry has the maximum frequency, return -1
	    return -1;
		
	}

}
