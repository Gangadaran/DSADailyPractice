package extraPracticeSums;

import java.util.Arrays;

import org.junit.Test;

public class ShuffletheArray {
	/*
	 * https://leetcode.com/problems/shuffle-the-array/
	 */

	@Test
	public void example() {
		int[] nums = {2,5,1,3,4,7};
		int n =3;
		System.out.println(Arrays.toString(find(nums,n)));

	}

	private int[] find(int[] nums, int n) {
		int[] result = new int[2*n];
		int j=0;
		for (int i = 0; i < result.length-1; i +=2) {
			result[i] = nums[j++];
			result[i+1] = nums[n++];
			
		}
		
		return result;
		
	}
}
