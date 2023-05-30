package stacksProblems;

import java.util.Stack;

import org.junit.Test;

public class RemoveAllAdjacentDuplicatesInString {

	/*
	 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
	 */
	@Test
	public void example() {
		String s ="abbaca";
		System.out.println(removeDuplicate1(s));
		

	}
    // bruteforce
	private String removeDuplicate1(String s) {
		   StringBuilder result = new StringBuilder();
	        int i = 0;

	        for (char c : s.toCharArray()) {
	            if (i > 0 && c == result.charAt(i - 1)) {
	                i--;
	            } else {
	                result.append(c);
	                i++;
	            }
	        }

	        return result.toString();
	}

	// using stack
	private String removeDuplicate(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c:s.toCharArray()) {
			if (!stack.isEmpty() && stack.peek()==c) {
				stack.pop();
			}else {
				stack.push(c);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.reverse().toString();
	}
}
