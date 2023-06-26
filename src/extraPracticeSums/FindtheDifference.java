package extraPracticeSums;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class FindtheDifference {
	/*
	 * https://leetcode.com/problems/find-the-difference/
	 */
	@Test
	public void example() {
		String s = "a", t = "aa";
		System.out.println(find1(s,t));

	}
    
	// using map 
	private char find1(String s, String t) {
		Map<Character,Integer> map = new HashMap<>();
	    for(char c:s.toCharArray()) {
	    	map.put(c, map.getOrDefault(c, 0)+1);
	    }
	    for (char c : t.toCharArray()) {
			int index = map.getOrDefault(c, 0);
			if (index==0) {
				return c;
			}
			map.put(c, index - 1);
		}
	    
		
		return ' ';
	}







	// Using array
	private char find(String s, String t) {
		int[] temp = new int[26];
		for (int c : s.toCharArray()) {
			temp[c-'a']++;
		}
		for (char c : t.toCharArray()) {
			  if (temp[c-'a']==1) {
				temp[c-'a']--;
			}else {
				return c;
			}
		}
		return ' ';
		
	}

}
