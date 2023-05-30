package day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class MinimumCommnValue {
	/*
	 * https://leetcode.com/problems/minimum-common-value/
	 */
	
	@Test
	public void example() {
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,4};
		System.out.println(getCommon1(nums1, nums2));

	}
	
	
	

	private int getCommon1(int[] nums1, int[] nums2) {
	     int pointer1 = 0;
	     int pointer2 =0;
	     while (pointer1 < nums1.length && pointer2 < nums2.length) {
			if (nums1[pointer1] == nums2[pointer2]) {
				return nums1[pointer1];
			}else if(nums1[pointer1] < nums2[pointer2]) {
				pointer1++;
			} else if(nums1[pointer1] > nums2[pointer2]) {
				pointer2++;
			}
		}
	     return -1;
		
	}




	//Using list and set
	private int getCommon(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
		for(int c: nums1) {
			set.add(c);
		}
		
		for(int c:nums2) {
			if (set.contains(c)) {
				list.add(c);
			}
		}
		 if (list.isEmpty()) {
		        throw new IllegalArgumentException("No common elements found.");
		    }

		
		int result = list.get(0);
		return result;
		
	}

}
