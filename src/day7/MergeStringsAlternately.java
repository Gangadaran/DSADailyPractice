package day7;

import org.junit.Test;

public class MergeStringsAlternately {
	/*
	 * 1768. Merge Strings Alternately
	 * https://leetcode.com/problems/merge-strings-alternately/description/
	 */
	
	
	
	
	@Test
	public void example() {
		String word1 = "abc";
		String word2 = "pqrfsadfsafd";
		System.out.println(merge(word1, word2));

	}

	private String merge(String word1, String word2) {
		StringBuilder sb = new StringBuilder();
		int i =0;
		int j =0;
		while (i<word1.length() && j< word2.length()) {
			sb.append(word1.charAt(i));
			sb.append(word2.charAt(j));
			i++;
			j++;
		}
		
		while (i<word1.length()) {
			sb.append(word1.charAt(i));
			i++;
		}
		while (j<word2.length()) {
			sb.append(word2.charAt(j));
			j++;
		}
		return sb.toString();
	}
	
	
	
	
	

}
