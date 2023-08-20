package extraPracticeSums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;



public class findSum {
	@Test
	public void  example() {
		String s = "anagram", t = "nagaram";
		System.out.println(find2(s,t));
		
	}

	private boolean find2(String s, String t) {
		int[] temp = new int[26];
		for (int c : s.toCharArray()) {
			temp[c-'a']++;
		}
		
		for (int i = 0; i < t.length(); i++) {
			if (temp[]==t.charAt(i)) {
				
			}
		}
	}

	private boolean find1(String s, String t) {
		char[] arr = t.toCharArray();
		char[] arr1 = s.toCharArray();
		
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		for(char c:arr) {
			sb.append(c);
		}
		for(char c1:arr1) {
			sb1.append(c1);
		}
		System.out.println(sb);
		
		String string = sb.toString();
		String string1 = sb1.toString();
		
		return string.equals(string1);
		
	}

	private boolean find(String s, String t) {
		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> map1 = new HashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c:t.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0)+1);
		}
		
		System.out.println(map +" "+ map1);
		
		return map.equals(map1);
		
		
	}

	
	

}
