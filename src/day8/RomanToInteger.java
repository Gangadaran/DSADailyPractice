package day8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class RomanToInteger {

	/*
	 * 13. Roman to Integer https://leetcode.com/problems/roman-to-integer/
	 */
	@Test
	public void example() {
		String romanNumeral = "MCMXCIV";
		System.out.println(total1(romanNumeral));

	}

	private int total1(String romanNumeral) {
		 Map<Character, Integer> symbolValues = new HashMap<>();
	        symbolValues.put('I', 1);
	        symbolValues.put('V', 5);
	        symbolValues.put('X', 10);
	        symbolValues.put('L', 50);
	        symbolValues.put('C', 100);
	        symbolValues.put('D', 500);
	        symbolValues.put('M', 1000);

	        int result = 0;
	        int prevValue = 0;

	        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
	            char currentSymbol = romanNumeral.charAt(i);
	            int currentValue = symbolValues.get(currentSymbol);

	            if (currentValue >= prevValue) {
	                result += currentValue;
	            } else {
	                result -= currentValue;
	            }

	            prevValue = currentValue;
	        }

	        return result;
	}

	private int total(String romanNumeral) {

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int total = 0;

		for (int i = 0; i < romanNumeral.length(); i++) {
			int currentValue = romanNumeral.charAt(i);
			if (currentValue == 'I') {
				total += map.get('I');
			} else if (currentValue == 'V') {
				total += map.get('V');
			} else if (currentValue == 'X') {
				total += map.get('X');
			} else if (currentValue == 'L') {
				total += map.get('L');
			} else if (currentValue == 'C') {
				total += map.get('C');
			} else if (currentValue == 'D') {
				total += map.get('D');
			} else if (currentValue == 'M') {
				total += map.get('M');
			}

		}

		return total;
	}

}
