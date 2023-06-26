package extraPracticeSums;


import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class IsomorphicStrings {
	/*
	 * https://leetcode.com/problems/isomorphic-strings/
	 */
	@Test
	public void example() {
		String s = "badc", t = "baba"; 
        System.out.println(findIso(s,t));
	}
	/*
	 * 1) traverse through s, s[i] = t[i];
	 */

	private boolean findIso(String s, String t) {
		
		if(s.length()!=t.length()) {
			return false;
		}
		Map<Character,Character> map = new HashMap<>();
	
		for(int i=0; i<s.length();i++) {
			if (!map.containsKey(s.charAt(i))) {
				if(map.containsValue(t.charAt(i))) {
					return false;
				}
				map.put(s.charAt(i), t.charAt(i));
			}else {
				if (map.get(s.charAt(i))!=t.charAt(i)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	

}
