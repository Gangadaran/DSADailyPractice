package extraPracticeSums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class FindAllNumbersDisappearedinanArray {
	/*
	 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
	 */
	
	@Test
	public void example() {
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(find(nums));

	}

	

	private List<Integer> find(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<>();
		for(int num:nums) {
			set.add(num);
		}
		int n = nums.length;
		for (int i = 1; i <= n; i++) {
			if (!set.contains(i)) {
				list.add(i);
			}
		}
		
		return list;
	}

}
