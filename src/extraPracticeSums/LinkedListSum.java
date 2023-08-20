package extraPracticeSums;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class LinkedListSum {

	/*
	 * Given a string s, find the first non-repeating character in it and return its
	 * index. If it does not exist, return -1.
	 * 
	 * Example 1: Input: s = "lets code" Output: 0 Example 2: Input: s =
	 * "love to code. lets code" Output: 2
	 */

	@Test
	public void example() {
		String s = "lets code";
		System.out.println(find(s));

	}

	private int find(String s) {
		LinkedHashMap<Character, Integer> lh = new LinkedHashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			lh.put(c, lh.getOrDefault(c, 0) + 1);
		}

		Iterator<Entry<Character, Integer>> iterator = lh.entrySet().iterator();
		char first = ' ';
		
		while (iterator.hasNext()) {
			Entry<Character, Integer> next = iterator.next();
			int temp = next.getValue();

			if (temp == 1) {
				first = next.getKey();
				break;
			}
		}

		
		for (int i = 0; i < s.length(); i++) {
			if (first == s.charAt(i)) {
				return i;
			}
		}

		return -1;
	}

}
