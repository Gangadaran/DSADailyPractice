package extraPracticeSums;

import org.junit.Test;

public class MininumSizeSubArraySum {
	/*
	 * https://leetcode.com/problems/minimum-size-subarray-sum/
	 */

	@Test
	public void example() {
		int[] nums = {2,3,1,2,4,3};
		int target = 7;
		System.out.println(find1(nums, target));

	}

	private int find1(int[] nums, int target) {
		int min = Integer.MAX_VALUE;
		  int sum = 0;
	        int left = 0;
	        
	        for (int right = 0; right < nums.length; right++) {
	            sum += nums[right];
	            
	            while (sum >= target) {
	                min = Math.min(min, right - left + 1);
	                sum -= nums[left];
	                left++;
	            }
	        }
	        
	        return (min == Integer.MAX_VALUE) ? 0 : min;
	}

	private int find(int[] nums, int target) {
		int min = Integer.MAX_VALUE;
		int count = 0 ;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				 count++;
				if (sum==target) {
					min = Math.min(min, count);
				}
				
			}
			count =0;
		}
		
		return min==2147483647 ? 0:min;
	}
}
