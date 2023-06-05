package dailyMorningProblems;

import org.junit.Test;

public class ValidPalindromeII {
	/*
	 * https://leetcode.com/problems/valid-palindrome-ii/description/
	 */
	
	@Test
	public void example() {
		String s ="aba";
		System.out.println(validPalindrome(s));
	}

	public boolean validPalindrome(String s) {
		 int left = 0;
	        int right = s.length() - 1;
	        
	        while (left < right) {
	            if (s.charAt(left) != s.charAt(right)) {
	                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
	            }
	            
	            left++;
	            right--;
	        }
	        
	        return true;
	}

	private boolean isPalindrome(String s, int left, int right) {
		
		while(left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}

	// approach
	private boolean validPalindrome1(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length()-1; i >=0; i--) {
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
		if (s.equals(sb.toString())) {
			return true;
		}
		return false;
	}
	

}
