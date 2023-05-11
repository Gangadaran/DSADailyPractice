package day16;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ContainsDuplicateII {
	/*
	 * 219. Contains Duplicate II
	 * https://leetcode.com/problems/contains-duplicate-ii/
	 */
	/*
	 * Sure, here is the pseudo code for the method `containsDuplicate(int[] nums, int k)`:


**containsDuplicate(nums, k)**

**Input:**

* nums: An array of integers.
* k: An integer.

**Output:**

* True if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k, False otherwise.

**Algorithm:**

1. Create a map to store the values in the array.
2. Iterate over the array.
3. If the current value is in the map and the distance between the current index and the index of the current value in the map is less than or equal to k, return true.
4. Add the current value to the map.
5. Repeat steps 3 and 4 until the end of the array is reached.
6. Return false.

	 */
	
	@Test
	public void example() {
		int[] nums = {1,0,1,1};
	    int k = 1;
        System.out.println(containsDuplicate(nums, k));
	}

	
	private boolean containsDuplicate(int[] nums, int k) {
		   Map<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		        if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k) {
		            return true;
		        }
		        map.put(nums[i], i);
		    }
		    return false;
		
		
	}


	//1,0,1,1
	private boolean containsDuplicate1(int[] nums, int k) {
		int j = nums.length-1, i =0;
		
		int sum =0;
		while(i < j) {
			
			if (nums[i]==nums[j]) {
				sum = Math.abs(i-j);
				i++;
				j--;
				
			}else {
				i++;
				j--;
			}
			
			if (sum!=0 && sum <=k) {
				return true;
			}
		}
		
		
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1,0,1,1};
		int i =1;
		Map<Integer, Integer> map = new HashMap<>();
	    
		System.out.println(map.containsKey(nums[i]));
		
	}

}
