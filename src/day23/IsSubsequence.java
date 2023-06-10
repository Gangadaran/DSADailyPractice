package day23;

import org.junit.Test;

public class IsSubsequence {
	/*
	 * https://leetcode.com/problems/is-subsequence/
	 */

	@Test
	public void example() {
		String s ="abc";
		String t = "ahbgdc";
		System.out.println(find(s,t));

	}

	private boolean find(String s, String t) {
		int i =0, j=0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i)==t.charAt(j)) {
				i++;
			}
			j++;
		}
		return i==s.length();
	}
	
}
