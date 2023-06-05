package dailyMorningProblems;

import java.util.Arrays;

import org.junit.Test;

public class ThirdMaximumNumber {
	/*
	 * https://leetcode.com/problems/third-maximum-number/
	 */

	@Test
	public void example() {
		int[] nums = { 1, 2 };
		System.out.println(thirdMax1(nums));

	}

	private int thirdMax1(int[] nums) {
		Integer firstMax = null;
		Integer secondMax = null;
		Integer thirdMax = null;
		for (Integer num : nums) {
			if (num.equals(firstMax) || num.equals(secondMax) || num.equals(thirdMax)) {
				continue;
			}
			if (firstMax == null || num > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = num;
			} else if (secondMax == null || num > secondMax) {
				thirdMax = secondMax;
				secondMax = num;
			} else if (thirdMax == null || num > thirdMax) {
				thirdMax = num;
			}
		}

		return thirdMax != null ? thirdMax : firstMax;
	}

	// 1st approach
	private int thirdMax(int[] nums) {
		Arrays.sort(nums);
		int distinctCount = 1;
		int max = nums.length - 1;

		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] != nums[i + 1]) {
				distinctCount++;
				if (distinctCount == 3) {
					return nums[i];
				}
			}
		}

		return max;

	}

}
