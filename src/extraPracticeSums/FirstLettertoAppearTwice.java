package extraPracticeSums;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class FirstLettertoAppearTwice {
	
	/*
	 * https://leetcode.com/problems/first-letter-to-appear-twice/
	 */
	
	@Test
	public void example() {
		String s = "abccbaacz";
		System.out.println(find1(s));

	}

	private char find1(String s) {
		Map<Character, Integer> map = new HashMap<>();
		
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0+1));
		}
		
		return ' ';
		
	}

	private char find(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==s.charAt(i+1)) {
				return s.charAt(i);
			}
		}
		return ' ';
	}

}
