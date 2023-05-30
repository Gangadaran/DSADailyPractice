package day8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RomanToInteger {
	
	/*
	 * 13. Roman to Integer
	 * https://leetcode.com/problems/roman-to-integer/
	 */
	public static void main(String[] args) {
		String s = "LVIII";
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int total = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int currentValue = s.charAt(i);
			if (currentValue ) {
				
			}
					
		}
		
		
	}
	
	
	
}
