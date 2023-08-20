package extraPracticeSums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class IntersectionofTwoArraysII {
	/*
	 * https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
	 */
	
	@Test
	public void example() {
		int[] nums1 = {1,2,2,1}, nums2 = {2,2}; // 1,1,2,2     2,2
		System.out.println(find1(nums1,nums2));

	}

	private int[] find1(int[] nums1, int[] nums2) {
		List<Integer> list =new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i=0,j=0;
		while(i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				i++;
			}else if(nums1[i] > nums2[j] ) {
				j++;
			}else {
				list.add(nums1[i]);
				i++;
				j++;
			}
		}
		
		int[] temp = new int[list.size()];
		int k =0;
		for(int c:list) {
			temp[k++] =c;
		}
		return temp;
		
	}

	private List<Integer> find(int[] nums1, int[] nums2) {
		List<Integer> set = new ArrayList<>();
		List<Integer> set1 = new ArrayList<>();
		for(int num:nums1) {
			set.add(num);
		}
		for(int num:nums2) {
			set1.add(num);
		}
		List<Integer> list = new ArrayList<>();
		
		
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			if (!set1.contains(iterator.next())) {
				list.add(iterator.next());
			}
		}
		
		return list;
	}

}
