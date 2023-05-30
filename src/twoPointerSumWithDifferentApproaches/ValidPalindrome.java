package twoPointerSumWithDifferentApproaches;

import org.junit.Test;

public class ValidPalindrome {
/*
 * https://leetcode.com/problems/valid-palindrome/
 */
	
	@Test
	public void example() {
		String s = "race a car";
	   System.out.println(palindrome(s));

	}
	
	
	
	
	
	
	
	
	
	
	
// second approaches
 private boolean palindrome(String s) {
	s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
	String reversed = new StringBuilder(s).reverse().toString();
	return s.equals(reversed);
	
}












// Using two pointer
	private boolean palindrome1(String s) {
	 if (s.isEmpty()) {
			return true;
		}
	 s = s.toLowerCase();
	 int start = 0, end = s.length()-1;
	 while (start < end) {
		 char c1 = s.charAt(start);
		 char c2 = s.charAt(end);
		if (!Character.isLetterOrDigit(c1)) {
			start++;
			continue;
		}else if(!Character.isLetterOrDigit(c2)) {
			end++;
			continue;
		}
		
		if (c1!=c2) {
			return false;
		}
		start++;
		end--;
	}
	 
	 
	return false;
	
}
}
