package day30;

import org.junit.Test;

public class ReverseOnlyLetters {
	/*
	 * https://leetcode.com/problems/reverse-only-letters/
	 */
	
	@Test
	public void example() {
		String s = "ab-cd";
		System.out.println(reverseString(s));

	}

	private String reverseString(String s) {
		char[] arr = s.toCharArray();
		int left =0, right = s.length()-1;
		while(left < right) {
			if (!Character.isLetter(arr[left])) {
				left++;
			}else if(!Character.isLetter(arr[right])) {
				right--;
			}else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
				
			}
			
		}
		
		return new String(arr);
		
	}

}
