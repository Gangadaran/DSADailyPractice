package extraPracticeSums;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class ClassSum {
	
	/*
	 * Given an array arr[] of size n, find the first repeating element. 
	 * The element should occur more than once and the index of its first occurrence should be the smallest.
Note:- The position you return should be according to 1-based indexing. 
Input:     arr[] = {1, 5, 3, 4, 3, 5, 6}
Output:   2
	 */
	
	@Test
	public void example() {
	 int[] arr  = {1, 5, 3, 4, 3, 5, 6};
	 System.out.println(find1(arr));

	}

	private int find1(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int c:arr) {
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		int small = Integer.MAX_VALUE;
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for(Entry<Integer,Integer> c: entrySet) {
			if (c.getValue() > 1) {
				small = Math.min(small, c.getKey());
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==small) {
				return i;
			}
		}
		return -1;
	}

	private int find(int[] arr) {
		int small = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					small = Math.min(small, arr[i]);
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==small) {
				return i;
			}
		}
		
		return -1;
	}

}
