package dailyMorningProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class IntersectionofTwoArrays {
	/*
	 * https://leetcode.com/problems/intersection-of-two-arrays/description/
	 */
	
	@Test
	public void example() {
		int[]nums1 = {1,2,2,1}, nums2 = {2,2};
		System.out.println(Arrays.toString(find2(nums1,nums2)));

	}

	private int[] find2(int[] nums1, int[] nums2) {
		 Set<Integer> set = new HashSet<>();
		    Set<Integer> set1 = new HashSet<>();
		    int i = 0, j = 0;
		    while (i < nums1.length && j < nums2.length) {
		        set.add(nums1[i++]);
		        set1.add(nums2[j++]);
		    }
		    while (i < nums1.length) {
		        set.add(nums1[i++]);
		    }
		    while (j < nums2.length) {
		        set1.add(nums2[j++]);
		    }
		    set.retainAll(set1);

		    int[] result = new int[set.size()];
		    int k = 0;
		    for (int num : set) {
		        result[k++] = num;
		    }
		    return result;
	}

	private int[] find1(int[] nums1, int[] nums2) {
		int[] temp = new int[nums1.length];
		for (int i : nums1) {
			temp[i]++;
		}
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>(set);
		
		for (int i : nums2) {
			if (nums2[i]==temp[i]) {
				set.add(nums2[i]);
			}
		}
		int[] temp1 = new int[nums1.length];
		for (int i = 0; i < set.size(); i++) {
			temp1[i] = list.get(i);
		}
		return temp1;
		
	}

	private int[] find(int[] nums1, int[] nums2) {
	     List<Integer> list = new ArrayList<>();
	        Set<Integer> set = new HashSet<>();
	       for (int num : nums1) {
	        set.add(num);
	    }

	    for (int num : nums2) {
	        if (set.contains(num)) {
	            list.add(num);
	            set.remove(num); 
	        }
	    }
	    
	    int[] temp = new int[list.size()];
	    
	    for (int i = 0; i < list.size(); i++) {
	        temp[i] = list.get(i);
	    }



	    return temp;
		
	}

}
