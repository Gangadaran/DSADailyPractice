package day9;

import org.junit.Test;

public class SplitaStringinBalancedStrings {
/*
 * 1221. Split a String in Balanced Strings
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
	@Test
	public void example() {
		String s = "RLRRLLRLRL";
		splitString(s);

	}

private int splitString(String s) {
	int count = 0;
	int r = 0;
	int l = 0;
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)=='R') {
			r++;
		}else if(s.charAt(i)=='L') {
			l++;
			
		}
		if (l==r) {
			count++;
		}
		
		
	}
	return count;
}
	
}
