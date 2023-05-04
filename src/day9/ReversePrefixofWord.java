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
       System.out.println(reverseString(word,ch));
       
	}
	
	/* pseudo code;
	 * 1) Find the index of the first occurrence of the character ch
	 * 2) Character ch does not exist in word, return the original string
	 * 3) Reverse the substring from index 0 to chIndex (inclusive)
	 * 4) Append the rest of the string
	 * 
	 */
	
	
    
	
	//using inbuild methods
	public String reverseString(String word, char ch) {

		int chIndex = word.indexOf(ch);

		if (chIndex == -1) {

			return word;
		}

		StringBuilder sb = new StringBuilder(word.substring(0, chIndex + 1));
		sb.reverse();

		sb.append(word.substring(chIndex + 1));

		return sb.toString();
	}
	
	// Not using inbuild methods
	public static String reversePrefix(String word, char ch) {
	    int chIndex = -1;
	    for (int i = 0; i < word.length(); i++) {
	        if (word.charAt(i) == ch) {
	            chIndex = i;
	            break;
	        }
	    }
	    
	    if (chIndex == -1) {
	        return word;
	    }
	    
	    char[] chars = word.toCharArray();
	    int i = 0, j = chIndex;
	    while (i < j) {
	        char temp = chars[i];
	        chars[i] = chars[j];
	        chars[j] = temp;
	        i++;
	        j--;
	    }
	    
	    return new String(chars);
	}



}
