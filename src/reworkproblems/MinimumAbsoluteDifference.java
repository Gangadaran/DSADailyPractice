package reworkproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MinimumAbsoluteDifference {
	
	/*
	 * https://leetcode.com/problems/minimum-absolute-difference/
	 */
	
	@Test
	public void example() {
		int[] arr = {4,2,1,3};
		find(arr);

	}

	private void find(int[] arr) {
		List<List<Integer>> result = new ArrayList<>();
		
		Arrays.sort(arr);
		int minDif = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			minDif = Math.min(minDif, Math.abs(arr[i]-arr[i-1]));
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (Math.abs(arr[i]-arr[i-1])==minDif) {
				List<Integer> list = new ArrayList<>();
				list.add(arr[i-1]);
				list.add(arr[i]);
				result.add(list);
				
			}
		}
		System.out.println(result);
	}

}
