package day18;

public class BackspaceStringCompare {
	/*
	 * 844. Backspace String Compare
	 * https://leetcode.com/problems/backspace-string-compare/
	 */

	public void example() {
		String s = "ab#c";
		String t = "ad#c";
        backSpace(s,t);
	}

	
	private void backSpace(String s, String t) {
		char[] array = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			if (array[i]!='#') {
				sb.append(array[i]);
			}
		}
		
	}
	
}
