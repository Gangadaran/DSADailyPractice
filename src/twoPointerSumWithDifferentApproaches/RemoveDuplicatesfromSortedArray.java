package twoPointerSumWithDifferentApproaches;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class RemoveDuplicatesfromSortedArray {
	/*
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	 */

	@Test
	public void example() {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicate3(nums));		

	}

	
	
	// using two pointer
	private int removeDuplicate3(int[] nums) {
		if (nums.length==0) {
			return 0;
		}
		
		int i =1, j=1;
		while(j < nums.length) {
			if(nums[j] !=nums[j-1]) {
				nums[i++] = nums[j];
				
			}
			j++;
		}
		return i;

	}
	
	
	// HashSet approache
		private int removeDuplicate2(int[] nums) {
			if (nums.length==0) {
				return 0;
			}
			
			Set<Integer> set = new HashSet<>();
			for(int num : nums) {
				set.add(num);
			}
			
			int[] result = new int[set.size()];
			int index =0;
			for(int num: set) {
				result[index++] = num;
			}
			
			return set.size();

		}
	
	
	
	
	// first approach
	private int removeDuplicate(int[] nums) {
		if (nums.length==0) {
			return 0;
		}
		int index = 1;
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] < nums[i + 1]) {
				nums[index++] = nums[i + 1];
                
			}
		}

		return index;

	}
	
	// second approach
	private int removeDuplicate1(int[] nums) {
		if (nums.length==0) {
			return 0;
		}
		int index =1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] !=nums[i-1]) {
				nums[index++] = nums[i];
			}
		}
		
		return index;

	}
	
	
}
