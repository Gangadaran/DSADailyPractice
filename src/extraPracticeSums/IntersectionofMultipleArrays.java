package extraPracticeSums;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class IntersectionofMultipleArrays {
	/*
	 * https://leetcode.com/problems/intersection-of-multiple-arrays/description/
	 */
	
	@Test
	public void example() {
		int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
		System.out.println(find(nums));

	}

	private List<Integer> find(int[][] nums) {
		
		for(int[] num:nums) {
			Set<Integer> set = new HashSet<Integer>();
			List<Integer> list = new ArrayList<Integer>();
			
			
		}
		
		
		return list;
	}

}
