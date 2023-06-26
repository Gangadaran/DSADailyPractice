package extraPracticeSums;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordPattern {
	/*
	 * https://leetcode.com/problems/word-pattern/
	 */
	
	public void example() {
		String p = "abba";
		String s = "dog cat cat dog";
		find(p,s);

	}

	private boolean find(String p, String s) {
		String[] arr = s.split(" ");
		if(p.length()!=s.length()) {
			return false;
		}
		Map<Character, String> map = new HashMap<>();
		for (int i = 0; i < p.length(); i++) {
			if (!map.containsKey(p.charAt(i))) {
				map.put(p.charAt(i), arr[i]);
			}else {
				
			}
		}
		
		return false;
	}
	

}
