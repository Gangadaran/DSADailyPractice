package day19;

import java.util.Stack;

import org.junit.Test;

public class MakeTheStringGreat {
	/*
	 * https://leetcode.com/problems/make-the-string-great/
	 */
	
	@Test
	public void example() {
		String s1 = "leEeetcode"; 
		System.out.println(makeGood1(s1));

	}

	private String makeGood1(String s1) {
		Stack<Character> stack = new Stack<>();
		for(char c : s1.toCharArray()) {
			if (!stack.isEmpty() && Math.abs(stack.peek()-c) == 32) {
				stack.pop();
			}else {
				stack.push(c);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		while (!stack.isEmpty()){
			sb.append(stack.pop());
		}
		
		return sb.reverse().toString();
	}

	private String makeGood(String s1) {
		StringBuilder sb = new StringBuilder(s1);
		int i =0;
		while(i < sb.length()-1) {
			char curr = sb.charAt(i);
			char next = sb.charAt(i+1);
			if (Character.toLowerCase(curr)==Character.toLowerCase(next) && curr != next) {
				sb.delete(i, i+2);
				if (i > 0) {
					i--;
				}
			}else {
				i++;
			}
		}
		
		
		
		return sb.toString();
		
	}


	

}
