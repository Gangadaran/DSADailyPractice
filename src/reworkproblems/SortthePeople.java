package reworkproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class SortthePeople {
	
	/*
	 * https://leetcode.com/problems/sort-the-people/
	 */
	
	@Test
	public void example() {
		String[] names = {"Mary","John","Emma"};
		int[] heights = {180,165,170};
		find(names, heights);

	}

	private void find(String[] names, int[] heights) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		int i=0;
		for(String name:names) {
		map.put(heights[i++], name);	
		}
		
		Arrays.sort(heights);
		int index =0;
		String[] result = new String[names.length];
		for (int j = heights.length-1; j >=0; j--) {
			result[index++] = map.get(heights[j]);
		}
		
		System.out.println(Arrays.toString(result));
		
		
		
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(93);
		list.add(54);
		list.add(15);
		list.add(86);
		
		Comparator<Integer> com = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if (i%10 >j%10) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		Collections.sort(list,com);
		System.out.println(list);
		
		
		
		
		
	}

}
