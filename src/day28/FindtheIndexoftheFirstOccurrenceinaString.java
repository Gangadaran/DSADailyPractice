package day28;

import org.junit.Test;

public class FindtheIndexoftheFirstOccurrenceinaString {
	/*
	 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
	 */
	
	@Test
	public void example() {
		String haystack = "sadbutsad";
		String needle = "sad";
		System.out.println(find(haystack, needle));

	}

	

	private int find(String haystack, String needle) {
		return haystack.indexOf(needle);
		
	}

}
