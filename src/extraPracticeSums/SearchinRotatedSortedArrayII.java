package extraPracticeSums;

import org.junit.Test;

public class SearchinRotatedSortedArrayII {
	/*
	 * https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
	 */
	
	@Test
	public void example() {
		int[] nums = {2,5,6,0,0,1,2};
		int target = 3;
		System.out.println(find1(nums, target));

	}
    private boolean find1(int[] nums, int target) {
		int left =0, right = nums.length-1;
		while(left <=right) {
			int mid = (left+right)/2;
			if (nums[mid]==target) {
				return true;
			}
			
		}
		return false;
	}
	// using brute force
	private boolean find(int[] nums, int target) {
		for (int i : nums) {
			if (i==target) {
				return true;
			}
		}
		
		return false;
	}

}
