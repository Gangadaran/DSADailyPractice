package day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class SubstringsofSizeThreewithDistinctCharacters {
	/*
	 * 1876. Substrings of Size Three with Distinct Characters
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
	 */
    @Test
	public void example() {
		String s = "xyzzaz";
		
		System.out.println(findSubString(s));

	}

    public int findSubString(String s) {
        int count = 0;
        Set<Character> set;

        for (int i = 0; i < s.length() - 2; i++) {
            set = new HashSet<>();

            set.add(s.charAt(i));
            set.add(s.charAt(i + 1));
            set.add(s.charAt(i + 2));
            

            if (set.size() == 3) count++;
        }

        return count;
    }
    
  
}
