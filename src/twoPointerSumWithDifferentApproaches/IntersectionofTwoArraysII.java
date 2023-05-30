package twoPointerSumWithDifferentApproaches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class IntersectionofTwoArraysII {
	/*
	 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
	 * 
	 */
	@Test
	public void example() {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		System.out.println(Arrays.toString(findIntersection(nums1, nums2)));

	}

	
	// using HashSet
	private int[] findIntersection1(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		
		for(int num:nums1) {
			set.add(num);
		}
		for(int num:nums2) {
			if (set.contains(num)) {
				list.add(num);
			}
		}
		
		int[] temp = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			temp[i] = list.get(i);
		}
		
		return temp;
		
	}



	// using two pointer 
	private int[] findIntersection(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<>();
		int left =0, right =0;
		while(left < nums1.length && right < nums2.length) {
			if (nums1[left] == nums2[right]) {
				list.add(nums1[left]);
				left++;
				right++;
			} else if(nums1[left] < nums2[right]){
				left++;
			}else {
				right++;
			}
			
			
		}
		
		int[] temp = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			temp[i] = list.get(i);
		}
		
		return temp;
		
	}

}
