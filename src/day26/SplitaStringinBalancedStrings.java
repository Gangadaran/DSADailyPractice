package day26;

import org.junit.Test;

public class SplitaStringinBalancedStrings {
	/*
	 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
	 */
	
	@Test
	public void example() {
		String s = "RLRRLLRLRL";
		System.out.println(balancedStringSplit(s));

	}

	private int balancedStringSplit(String s) {
		int r=0,l=0,count=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)== 'R') {
				r++;
			}
			if (s.charAt(i)=='L') {
				l++;
			}
			
			if (l==r) {
				count++;
			}
		}
		return count;
	}

}
