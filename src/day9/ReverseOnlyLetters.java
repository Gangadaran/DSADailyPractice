package day9;



import org.junit.Test;

public class ReverseOnlyLetters {
	/*
	 * 917. Reverse Only Letters
	 * https://leetcode.com/problems/reverse-only-letters/
	 */
    @Test
	public void example() {
		String s ="a-bC-dEf-ghIj";
		System.out.println(reverseString(s));

	}

	
	
	private String reverseString(String s) {
	    char[] arr = s.toCharArray();
	    int j = arr.length-1, i=0;
	    while (i < j) {
	        if (!Character.isLetter(arr[i])) {
	            i++;
	        } else if (!Character.isLetter(arr[j])) {
	            j--;
	        } else {
	            char temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	            j--;
	        } 
	    }
	    return new String(arr);    
	}
	
	
}
