package pendingSums;

import org.junit.Test;

public class IsSubsequence {
	
	/*
	 * 392. Is Subsequence
	 * https://leetcode.com/problems/is-subsequence/
	 */
	@Test
	public void example() {
		String input1 = "abc";
		String input2 = "ahbgdc";
		System.out.println(findSubSequence(input1,input2));

	}

	private boolean findSubSequence(String input1, String input2) {
		int i = 0, j =0;
		while (i < input1.length() && j < input2.length()) {
			if (input1.charAt(i)== input2.charAt(j)) {
				i++;
				j++;
			}
			j++;
		}
		return i==input1.length();
	}

}
