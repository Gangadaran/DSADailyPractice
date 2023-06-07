package extraPracticeSums;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FindAllAnagramsinaString {
	/*
	 * 438. Find All Anagrams in a String
	 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
	 */
	
	@Test
	public void example() {
		String s ="cbaebabacd";
		String p ="abc";
       findAnagrams(s,p);
	}

	private void findAnagrams(String s, String p) {
		boolean[] temp1 = new boolean[26];
		boolean[] temp2 = new boolean[26];
		
		for (char c : s.toCharArray()) {
			temp1[c-'a'] = true;
		}
		
		List<Integer> list = new ArrayList<>();
		
		
	}

}
