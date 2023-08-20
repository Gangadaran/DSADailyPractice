package reworkproblems;

import org.junit.jupiter.api.Test;

public class MinimumRecolorstoGetKConsecutiveBlackBlocks {

	/*
	 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
	 * 
	 */
	
	@Test
	public void example() {
		String s = "WBWBBBW";
		int k=7;
		find(s,k);

	}

	private void find(String s,int k) {
		char[] arr =s.toCharArray();
		int count =0;
		for (int i = 0; i < k; i++) {
			if (arr[i]=='W') {
				count++;
			}
			if (count ==0 && i <arr.length) {
				i=0;
			}
		}
		
		System.out.println(count);
	}
}
