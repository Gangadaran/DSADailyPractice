package extraPracticeSums;

import org.junit.Test;

public class CheckIfTwoStringArraysareEquivalen {
	/*
	 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
	 */
	
	@Test
	public void example() {
		String[] word1 = {"ab", "c"}; 
		String[] word2 = {"a", "bc"};
		System.out.println(find(word1,word2));

	}

	private boolean find(String[] word1, String[] word2) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(String word:word1) {
			sb1.append(word);
		}
		for(String word:word2) {
			sb2.append(word);
		}
		String string = sb1.toString();
		String string1 = sb2.toString();
		
		return string.equals(string1);
		
	}

}
