package practiceSums;

import java.util.Arrays;


import org.junit.Test;

public class ReverseString {
	/*
	 * https://leetcode.com/problems/reverse-string/
	 */
	@Test
	public void example() {
		String[] s = {"h","e","l","l","o"};
		System.out.println(Arrays.toString(reverse1(s)));

	}
	
	// using string
	private String[] reverse1(String[] s) {
		String[] reversed = new String[s.length];
		int j =0;
		for (int i = s.length-1; i >= 0 ; i--) {
			reversed[j++] = s[i];
			
		}
		return reversed;
		
	}
	// using stringBuilder
		private String[] reverse2(String[] s) {
			String[] reversed = new String[s.length];
			int j =0;
			for (int i = s.length-1; i >= 0 ; i--) {
				reversed[j++] = s[i];
				
			}
			return reversed;
			
		}

	// using two pointer
	private String[] reverse(String[] s) {
		int i = 0, j = s.length-1;
		while(i < j) {
			String temp = s[i];
			s[i++] = s[j];
			s[j--] = temp;
			
		}
		return s;
		
	}

}
