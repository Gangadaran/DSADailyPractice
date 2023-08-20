package extraPracticeSums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class TwoOutofThree {
	
	/*
	 * https://leetcode.com/problems/two-out-of-three/
	 */
	@Test
	public void example() {
		int[] nums1 = {1,1,3,2}, nums2 = {2,3}, nums3= {3};
        System.out.println(find(nums1,nums2,nums3));
	}

	private List<Integer> find(int[] nums1, int[] nums2, int[] nums3) {
	     Map<Integer, Integer> map = new HashMap<>();
	     countOfOccurrence(map, nums3);
	     countOfOccurrence(map, nums1);
	     countOfOccurrence(map, nums2);
	     
	     List<Integer> list = new ArrayList<>();
	     
	     Set<Entry<Integer,Integer>> entry = map.entrySet();
	     for (Entry<Integer, Integer> entry2 : entry) {
			if (entry2.getValue() >= 2) {
				list.add(entry2.getKey());
			}
		}
	     
		return list;
	}
	
	public void countOfOccurrence(Map<Integer,Integer> map, int[] nums) {
		for(int num:nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}

	}
	


}
