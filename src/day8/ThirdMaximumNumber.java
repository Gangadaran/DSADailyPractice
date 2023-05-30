package day8;

import org.junit.Test;

public class ThirdMaximumNumber {
	@Test
	public void example() {
		int[] nums = {3,2,1};
		System.out.println(findThirdMaximumNumber(nums));

	}
	
	@Test
	public void example1() {
		int[] nums = {2,2,3,1};
		System.out.println(findThirdMaximumNumber(nums));

	}
	@Test
	public void example2() {
		int[] nums = {1,2};
		System.out.println(findThirdMaximumNumber(nums));

	}

	private int findThirdMaximumNumber(int[] nums) {
		if(nums.length<=2) {
			System.out.println("The third distinct maximum does not exist");
			return 0;
		}
		
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		for(int num:nums) {
			if(num > max1) {
				max2 = max1;
				max3 = max2;
				max1 = num;
			}else if(num > max2) {
				max3 =max2;
				max2 = num;
			}else if(num > max3) {
				max3 =num;
			}
		}
		return max3;
	}

}
