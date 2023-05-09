package day13;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MinimumAbsoluteDifference {
	/*
	 * 1200. Minimum Absolute Difference
	 * https://leetcode.com/problems/minimum-absolute-difference/
	 */
	@Test
	public void example() {
		int[] arr = {4,2,1,3}; // 1,2   2,3  3,4
		System.out.println(minimumAbsolute(arr));
		

	}

	public List<List<Integer>> minimumAbsolute(int[] arr) {
	    List<List<Integer>> output = new ArrayList<>();
	    Arrays.sort(arr);
	    int n = arr.length;
	    int minDiff = arr[1] - arr[0]; // 2 - 4 = 2
	    for (int i = 2; i < n; i++) {
	        minDiff = Math.min(minDiff, arr[i] - arr[i-1]); // 1 - 2 = 1, 3
	    }
	    for (int i = 1; i < n; i++) {
	        if (arr[i] - arr[i-1] == minDiff) {
	            List<Integer> pair = new ArrayList<>();
	            pair.add(arr[i-1]);
	            pair.add(arr[i]);
	            output.add(pair);
	        }
	    }
	    return output;
	}


}
