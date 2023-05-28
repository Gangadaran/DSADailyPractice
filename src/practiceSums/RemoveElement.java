package practiceSums;

import org.junit.Test;

public class RemoveElement {
	/*
	 * https://leetcode.com/problems/remove-element/
	 */
	
	@Test
	public  void example() {
		int[] nums = {3,2,2,3};
		int k = 3;
		System.out.println(removeTargetElement1(nums, k));

	}
	@Test
	public  void example1() {
		int[] nums = {};
		int k = 3;
		System.out.println(removeTargetElement(nums, k));

	}
	@Test
	public  void example2() {
		int[] nums = null;
		int k = 3;
		System.out.println(removeTargetElement(nums, k));

	}
	
	//Using two pointer   // 3,2,2,3
	private int removeTargetElement1(int[] nums, int k) {
		if(nums == null) {
			return 0;
		}
		 int i = 0; // pointer for the updated array
		    int j = 0; // pointer for iterating over the array

		    while (j < nums.length) {
		        if (nums[j] != k) {
		            nums[i] = nums[j];
		            i++;
		        }
		        j++;
		    }

		    return i;
	}
	
    // using bruteforce
	private int removeTargetElement(int[] nums, int k) {
		if(nums == null) {
			return 0;
		}
		int count =0;
		for(int i = 0;  i < nums.length; i++) {
			if (nums[i] != k) {
				count++;
			}
		}
		
		
		return count;
	}
	

	

}
