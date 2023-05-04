package day9;

import org.junit.Test;

public class ReversePrefixofWord {
	/*
	 * 2000. Reverse Prefix of Word
	 * https://leetcode.com/problems/reverse-prefix-of-word/
	 */
	@Test
	public void example() {
		String word = "abcdefd";
		char ch = 'd';
       reverseString(word,ch);
       
	}

	public void reverseString(String word, char ch) {
		
			
		int target = 0;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)==ch) {
				target = i;
				
				break;
			}
		}
		
		System.out.println(reverse(word, target));
		
		
	}
	
	public static String reverse(String word, int k) {
		char[] arr = word.toCharArray();
		char[] temp = new char[word.length()]; 
		for (int i = 0; i <=k; i++) {
			temp[i] = arr[i];
		}
		for (int i = k+1; i < word.length(); i++) {
			temp[i]=arr[i];
		}
		
		StringBuilder sb = new StringBuilder(new String(temp));
		return sb.reverse().toString();
	}

}
