package day6;

import java.util.Iterator;

import org.junit.Test;

public class RemoveDuplicateInSortedArray {
	/*
	 * 26. Remove Duplicates from Sorted Array 
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	 */
	@Test
	public void example() {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicate(nums);
	}

	private int removeDuplicate(int[] nums) {
		int index = 1;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]!=nums[i+1]) {
				nums[index++]=nums[i+1];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		return index;
	}
	
	private int removeDuplicate1(int[] nums) {
		if (nums.length == 0) {
	        return 0;
	    }

	    // Pointer to track the position to which the next unique element should be copied
	    int pos = 1;

	    for (int i = 1; i < nums.length; i++) {
	        // If the current element is different from the previous one, copy it to the next position
	        if (nums[i] != nums[i-1]) {
	            nums[pos] = nums[i];
	            pos++;
	        }
	    }

	    return pos;
	}

}
