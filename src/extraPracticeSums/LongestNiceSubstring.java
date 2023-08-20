package extraPracticeSums;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestNiceSubstring {
	/*
	 * https://leetcode.com/problems/longest-nice-substring/
	 */
	
	@Test
	public void example() {
		String s = "Yy";
		System.out.println(find(s));

	}

	private boolean find(String s) {
		Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            charSet.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (charSet.contains(Character.toUpperCase(s.charAt(i))) &&
                    charSet.contains(Character.toLowerCase(s.charAt(i)))) {
                continue;
            }
            String s1 = longestNiceSubstring(s.substring(0, i));
            String s2 = longestNiceSubstring(s.substring(i+1));
            return s1.length()>= s2.length() ? s1 : s2;
        }
        return s;
	}
	

}
