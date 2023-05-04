package day8_03_05_23;

import org.junit.Test;

public class DIStringMatch {
	/*
	 * 942. DI String Match
	 * https://leetcode.com/problems/di-string-match/description/
	 */
	
	@Test
	public void eaxmple() {
		String s ="IDID";
		stringMatch(s);

	}

	private void stringMatch(String s) {
		int[] temp = new int[s.length()+1];
		int start =0;
		int end = s.length();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='I') {
				temp[i] = start++;
			} else if(s.charAt(i)=='D') {
				temp[i] = end--;
			}
		}
		
	}
	
	
	

}
