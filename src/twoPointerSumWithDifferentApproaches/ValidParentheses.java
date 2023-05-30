package twoPointerSumWithDifferentApproaches;

import java.util.Stack;

import org.junit.Test;

public class ValidParentheses {
	/*
	 * https://leetcode.com/problems/valid-parentheses/
	 */
	
	@Test
	public void example() {
		String s = "(]";
        System.out.println(checkParentheses(s));
	}

	private boolean checkParentheses(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (check(c) && !stack.isEmpty()) {
				Character top = stack.peek();
				if (isMatchingPair(top, c)) {
					stack.pop();
				}else {
					stack.push(c);
				}
			}else {
				stack.push(c);
			}
			
			
		}

		if (stack.isEmpty()) {
			return true;
		}
		return false;

	}
	
	private boolean check(char c) {
		 return (c==')' || c==']' || c=='}'); 
		}
	private boolean isMatchingPair(char open, char close) {
	    return ((open == '(' && close == ')') ||
	            (open == '[' && close == ']') ||
	            (open == '{' && close == '}'));
	}

}
