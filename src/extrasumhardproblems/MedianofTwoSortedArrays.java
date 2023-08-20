package extrasumhardproblems;

import org.junit.Test;

public class MedianofTwoSortedArrays {

	/*
	 * https://leetcode.com/problems/median-of-two-sorted-arrays/
	 */

	@Test
	public void example() {
		int[] nums1 = { 1,2 }, nums2 = { 3,4 };
		System.out.println(find(nums1, nums2));

	}



	private double find(int[] nums1, int[] nums2) {
		int[] temp = new int[nums1.length + nums2.length];
		int i = 0, j = 0, k=0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] <= nums2[j]) {
				temp[k] = nums1[i++];
				
			} else {
				temp[k] = nums2[j++];
				
			}
			k++;
		}

		while (i < nums1.length) {
			temp[k++] = nums1[i++];
		}
		while (j < nums2.length) {
			temp[k++] = nums2[j++];
		}
        int count=0;
		for (int k2 = 1; k2 < temp.length-1; k2++) {
			count += temp[k2];
		}
		double count1 = (double) count;
		double f = count1/2;
		return  f;
	}

}
