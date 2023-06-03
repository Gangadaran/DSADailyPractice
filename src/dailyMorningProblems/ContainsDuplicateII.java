package dailyMorningProblems;

import java.util.HashMap;
import java.util.Iterator;

import org.junit.Test;

public class ContainsDuplicateII {
	/*
	 * https://leetcode.com/problems/contains-duplicate-ii/description/
	 */
	@Test
	public void example() {
		int[] nums = { 1,2,3,1,2,3 };
		int k = 2;
		System.out.println(containsNearbyDuplicate1(nums, k));

	}

	private boolean containsNearbyDuplicate1(int[] nums, int k) {
		   HashMap<Integer, Integer> numIndices = new HashMap<>();

		    for (int i = 0; i < nums.length; i++) {
		        if (numIndices.containsKey(nums[i])) {
		            int prevIndex = numIndices.get(nums[i]);
		            if (Math.abs(prevIndex - i) <= k) {
		                return true;
		            }
		        }

		        numIndices.put(nums[i], i);
		    }

		    return false;
	}

	private boolean containsNearbyDuplicate(int[] nums, int k) {
         for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if ((nums[i]==nums[j]) && Math.abs(i-j) <=k) {
					return true;
				}
			}
		}
         return false;
	}
}
