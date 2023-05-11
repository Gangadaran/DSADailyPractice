package day14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class SortthePeople {
	/*
	 * 2418. Sort the People
	 * https://leetcode.com/problems/sort-the-people/
	 */
	@Test
	public void example() {
		String[] names =  {"Mary","John","Emma"};
		int[] heights = {180,165,170};
        //System.out.println(Arrays.toString(sortThePeopleByHeights(names, heights)));
		sortThePeopleByHeights1(names, heights);
	}

	private String[] sortThePeopleByHeights(String[] names, int[] heights) {
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			map.put(heights[i], names[i]);
		}
		Arrays.sort(heights);
		int index =0;
		String[] result = new String[names.length];
		for (int i = heights.length-1; i >=0; i--) {
			result[index] = map.get(heights[i]);
			index++;
		}
		
		return result;
	}
	
	private void sortThePeopleByHeights1(String[] names, int[] heights) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < heights.length; i++) {
		     
		      max = Math.max(max, heights[i]);
		}
		String[] name = new String[max+1];
		
		
		int index = 0;
		for (int i = 0; i <= max; i++) {
			if (i == heights[index]) {
				name[i] = name[index++];
			}
		}
		
		
		for (String string : name) {
			System.out.println(string);
		}
		
		
		
		}
		

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

