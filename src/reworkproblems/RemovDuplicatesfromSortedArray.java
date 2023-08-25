package reworkproblems;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.Set;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class RemovDuplicatesfromSortedArray {
	/*
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	 */
	
	@Test
	public void example() {
		int[] nums = {1,1,2};
		System.out.println(Arrays.toString(find3(nums)));

	}

	private int[] find3(int[] nums) {
		int[] result = Arrays.stream(nums)
		.distinct()
		.toArray();
		return result;
	}

	private int find2(int[] nums) {
//		Map<Integer,Integer> map = new HashMap<>();
//		for (int i = 1; i < 100; i++) {
//			map.put(i, i+5);
//		}
		
		
		
		
		
//		Consumer<Entry<Integer,Integer>> con =  entry -> {
//				int a = entry.getKey();
//				int b = entry.getValue();
//			};
		
		
		
//		map.entrySet().stream().forEach(entry -> {
//			int a = entry.getKey();
//			int b = entry.getValue();
//		});

		
		
		
		
		
		
		
		//		Collection<Integer> values = map.values();
//		for(int value:values) {
//			System.out.println(value);
//		}
//
//		Set<Entry<Integer, Integer>> entries = map.entrySet();
//		
//		for(Entry<Integer,Integer> entry:entries) {
//			
//		  int a =	entry.getKey();
//		  int b = entry.getValue();
//		}
//	 
		
		
		
		
		//		Iterator<Map.Entry<Integer,Integer>> entries =map.entrySet().iterator();
//        int count =0;
//		while(entries.hasNext()) {
//                Entry<Integer,Integer> entry =entries.next();
//                if (entry.getValue()==1) {
//					count++;
//				}
//        }	
		
		return 0;
	}

//	int index =0;
//	private int find1(int[] nums) {
//		for(int i =0; i< nums.length-1; i++) {
//			if (nums[i] < nums[i+1]) {
//				index++;
//			}
//		}
//		return index+1;
//	}
//
//	private int find(int[] nums) {
//		Set<Integer> set = new HashSet<>();
//		
//		for(int num : nums) {
//			set.add(num);
//		}
//		
//		return set.size();
//		
//	}

}
