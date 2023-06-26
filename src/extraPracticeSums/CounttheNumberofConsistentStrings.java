package extraPracticeSums;

import org.junit.Test;

public class CounttheNumberofConsistentStrings {
	/*
	 * https://leetcode.com/problems/count-the-number-of-consistent-strings/
	 */
	
	@Test
	public void example() {
	String allowed = "ab";
	String[] words = {"ad","bd","aaab","baa","badab"};
	System.out.println(find(allowed, words));

	}

	private int find(String allowed, String[] words) {
		boolean[] temp = new boolean[26];
		int count =0;
		for(char c: allowed.toCharArray()) {
			temp[c-'a'] = true;
		}
		for(String word:words) {
			boolean consistent = true;
			for(char c:word.toCharArray()) {
				  if (!temp[c-'a']) {
					consistent = false;
					break;
				}  
			}
			if (consistent) {
				count++;
			}
		}
		
		return count;
	}

}
