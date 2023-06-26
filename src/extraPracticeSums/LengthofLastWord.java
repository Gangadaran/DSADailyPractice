package extraPracticeSums;

import org.junit.Test;

public class LengthofLastWord {
	/*
	 * https://leetcode.com/problems/length-of-last-word/description/
	 * 
	 */
	@Test
	public void example() {
		String s = "Hello World";
		System.out.println(find(s));

	}

	private int find(String s) {
		String[] arr = s.split(" ");
		String last = arr[arr.length-1];
		return last.length();
		
	}

}
