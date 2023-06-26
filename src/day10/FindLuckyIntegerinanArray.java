package day10;


import org.junit.Test;

public class FindLuckyIntegerinanArray {

	/*
	 * 1394. Find Lucky Integer in an Array
	 * https://leetcode.com/problems/find-lucky-integer-in-an-array/
	 */
	@Test 
	public void example() {
		int[] nums = {2,2,3,4};
		System.out.println(findLuckyInteger(nums));

	}
	@Test
	public void example1() {
		int[] nums = {1,2,2,3,3,3};
		System.out.println(findLuckyInteger(nums));

	}
	@Test
	public void example2() {
		int[] nums = {2,2,2,3,3};
		System.out.println(findLuckyInteger(nums));

	}
	

	private int findLuckyInteger(int[] nums) {
		int[] temp = new int[501];

		for (int val : nums) {
			temp[val]++;
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i <= 500; i++) {

			if (temp[i] == i) {
				max = i;

			}
		}

		return max == 0 ? -1 : max;
	}
}
