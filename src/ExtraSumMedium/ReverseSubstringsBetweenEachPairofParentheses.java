package ExtraSumMedium;

import org.junit.Test;

public class ReverseSubstringsBetweenEachPairofParentheses {
	/*
	 * https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/description/
	 */
	
	@Test
	public void example() {
		String s = "(abcd)";
		System.out.println(find(s));
	}

	private void find1(String s) {
		
	}

	private String find(String s) {
		char[] arr = s.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for(int i =arr.length-1; i >=0;i--) {
			if (Character.isAlphabetic(arr[i])) {
				sb.append(arr[i]);
			}
		}
		return sb.toString();
	}

}
