package extraPracticeSums;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class RansomNote {
	/*
	 * https://leetcode.com/problems/ransom-note/
	 */
	
	@Test
	public void example() {
		String a = "a", b = "ab";    //  1
		System.out.println(find1(a,b));

	}

	
	
	
	private boolean find1(String a, String b) {
		Map<Character,Integer> map = new HashMap<>();
		for (char c : b.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue()==1) {
				return true;
			}
		}
		
		return false;
	}




	// Using array
	private boolean find(String a, String b) {
	int[] temp = new int[26];
	for (char c : b.toCharArray()) {
		temp[c-'a']++;
	}
	for (char c : a.toCharArray()) {
		if (temp[c-'a']==0) {
			return false;
		}
		temp[c-'a']--;
	}
		
		return true;
	}

}
