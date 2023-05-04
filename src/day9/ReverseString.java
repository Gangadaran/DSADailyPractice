package day9;



public class ReverseString {
	/*
	 * 344. Reverse String
	 * https://leetcode.com/problems/reverse-string/
	 */


	private void reverseString1(char[] s) {
		
		int i =0, j = s.length-1;
		while (i<j) {
			char temp = s[i];
			s[i]=s[j];
			s[j] = temp;
			i++;
			j--;
		}
		
	}

}
