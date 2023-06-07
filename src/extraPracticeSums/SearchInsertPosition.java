package extraPracticeSums;

import org.junit.Test;

public class SearchInsertPosition {
	/*
	 * https://leetcode.com/problems/search-insert-position/
	 */
	
	@Test
	public void example() {
		int[] nums = {1,3,5,6};
		int target = 2;
		System.out.println(find(nums,target));
        
	}

	private int find(int[] nums, int target) {
		int left =0, right = nums.length-1;
		
		while(left < right) {
			int mid = (left+right)/2;
			if (nums[mid]==target) {
				return mid;
			}
			
			if (nums[mid] > target) {
				right = mid-1;
			}else {
				left = mid+1;
			}
		}
		return left;
	}

}
