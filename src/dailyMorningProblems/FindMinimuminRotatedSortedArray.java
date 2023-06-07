package dailyMorningProblems;

import org.junit.Test;

public class FindMinimuminRotatedSortedArray {
	/*
	 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
	 */
	
	@Test
	public void example() {
		int[] nums = {3,4,5,1,2};
		System.out.println(findMin1(nums));

	}

	private int findMin1(int[] nums) {
		if (nums.length==0) return -1;
		if (nums.length==1 || nums[0] < nums[nums.length-1]) {
			return nums[0];
		}
		
		int left =0;
		int right = nums.length-1;
		
		while(left < right) {
			int mid = (left+right)/2;
			if (nums[mid] < nums[mid-1]) {
				return nums[mid];
			}
			
			if (nums[mid] > nums[mid+1]) {
				return nums[mid+1];
			}
			
			if (nums[left] < nums[mid]) {
				left = mid+1;
				
			}else {
				right=mid-1;
			}
			
			return -1;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return -1;
	}

	private int findMin(int[] nums) {
	    int left = 0;
        int right = nums.length - 1;
        
        if (nums[left] < nums[right]) {
            return nums[left];
        }
        
        while (left < right) {
            int mid = (left + right) / 2;
            
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return nums[left];
	}

}
