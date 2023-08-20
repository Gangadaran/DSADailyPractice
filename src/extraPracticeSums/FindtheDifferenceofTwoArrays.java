package extraPracticeSums;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class FindtheDifferenceofTwoArrays {
	/*
	 * https://leetcode.com/problems/find-the-difference-of-two-arrays/
	 */
	
	@Test
	public void example() {
		int[] nums1 = {1,2,3}, nums2 = {2,4,6};
		System.out.println(find1(nums1,nums2));

	}

	private List<List<Integer>> find1(int[] nums1, int[] nums2) {
		boolean[] temp1 = new boolean[1001];
		boolean[] temp2 = new boolean[1001];
		for(int num:nums1) {
			temp1[num]= true;
		}
		for(int num:nums2) {
			temp2[num]= true;
		}
		
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int c:nums1) {
			if (temp1[c]!=temp2[c]) {
				list1.add(c);
			}
		}
		for(int c:nums2) {
			if (temp1[c]!=temp2[c]) {
				list2.add(c);
			}
		}
		list.add(list1);
		list.add(list2);
		return list;
	}

	private List<List<Integer>> find(int[] nums1, int[] nums2) {
	    Set<Integer> set1 = new HashSet<>();
	    Set<Integer> set2 = new HashSet<>();
	    for(int num:nums1) {
	    	set1.add(num);
	    }
	    for(int num:nums2) {
	    	set2.add(num);
	    }
	    
	    List<List<Integer>> list =new ArrayList<>();
	    List<Integer> list1 = new ArrayList<Integer>();
	    List<Integer> list2 = new ArrayList<Integer>();
	    for(int c:set2) {
	    	if (!set1.contains(c)) {
				list1.add(c);
			}
	    }
	    for(int c:set1) {
	    	if (!set2.contains(c)) {
				list2.add(c);
			}
	    }
	    
	    list.add(list1);
	    list.add(list2);
	    
	    return list;
	    
	}


}
