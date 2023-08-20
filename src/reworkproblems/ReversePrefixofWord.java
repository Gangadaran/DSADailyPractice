package reworkproblems;

import org.junit.jupiter.api.Test;

public class ReversePrefixofWord {
	/*
	 * https://leetcode.com/problems/reverse-prefix-of-word/
	 */
	
	@Test
	public void example() {
		String s = "abcdefd";
		char ch ='d';
		find(s,ch);

	}

	private String find(String s, char ch) {
		char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		boolean status = true;
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			if (arr[i]==ch && status) {
				status = false;
				sb.reverse();
				
			}
			
		
			
		}
		return sb.toString();
				
	}

}
