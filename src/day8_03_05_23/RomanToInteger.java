package day8_03_05_23;

import java.util.HashMap;

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
			if(s.charAt(i)=='I') {
				total +=map.get('I');
			} else if(s.charAt(i)=='V') {
				total +=map.get('V');
			} else if(s.charAt(i)=='X') {
				total += map.get('X');
			}else if(s.charAt(i)=='L') {
				total += map.get('L');
			}else if(s.charAt(i)=='C') {
				total += map.get('C');
			}else if(s.charAt(i)=='D') {
				total += map.get('D');
			}else if(s.charAt(i)=='M') {
				total += map.get('M');
			}
		}
		
		System.out.println(total);
		
	}
	
	
	
}
