package twoPointerSumWithDifferentApproaches;

import java.util.Stack;

import org.junit.Test;

public class BackspaceStringCompare {
	/*
	 * https://leetcode.com/problems/backspace-string-compare/
	 */
	@Test
	public void example() {
		String s = "ab#c";
		String t = "ad#c";
        System.out.println(compare(s,t));
	}

	private boolean compare(String s, String t) {
	return buildString(s).equals(buildString(t));
	
	}
	private String buildString(String str) {
		Stack<Character> stack = new Stack<>();
		for(char c:str.toCharArray()) {
			if (c!='#') {
				stack.push(c);
			}else if(!stack.isEmpty()) {
				stack.pop();
			}
		}
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();

	}

	// brute force
	private boolean compare1(String s, String t) {
		
		if (s.isEmpty() || t.isEmpty()) {
			return true;
		}
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i+1)!='#' && s.charAt(i)!= '#') {
				sb.append(s.charAt(i));
			}
			if (t.charAt(i+1)!='#' && t.charAt(i)!= '#') {
				sb1.append(t.charAt(i));
			}
			
		}
		
		sb.append(s.charAt(s.length()-1));
		sb1.append(s.charAt(t.length()-1));
		
	
		
		String string = sb.toString();
		String string2 = sb1.toString();
		if (string.equals(string2)) {
			return true;
		}
		return false;
	}

}
