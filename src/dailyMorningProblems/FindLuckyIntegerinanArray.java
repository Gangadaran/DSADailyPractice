package dailyMorningProblems;

import org.junit.Test;

public class FindLuckyIntegerinanArray {
	/*
	 * https://leetcode.com/problems/find-lucky-integer-in-an-array/
	 */
	@Test
	public void example() {
		int[] arr = { 2, 2, 3, 4 };
		System.out.println(findLucky(arr));

	}

	private int findLucky(int[] arr) {
		int[] temp = new int[501];
		for (int val : arr) {
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
