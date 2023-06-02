package dailyMorningProblems;

import org.junit.Test;

public class FindMinimuminRotatedSortedArray {
	/*
	 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
	 */
	
	@Test
	public void example() {
		int[] nums = {3,4,5,1,2};
		System.out.println(findMin(nums));

	}

	private int findMin(int[] nums) {
	    int left = 0;
        int right = nums.length - 1;
        
        if (nums[left] < nums[right]) {
            return nums[left];
        }
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return nums[left];
	}

}
