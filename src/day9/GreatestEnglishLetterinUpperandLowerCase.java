package day9;

import org.junit.Test;

public class GreatestEnglishLetterinUpperandLowerCase {

	/*
	 * 2309. Greatest English Letter in Upper and Lower Case
	 * https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/
	 */
	@Test
	public void example() {
		String s = "arRAzFif";
        findGreatestEnglishL(s);
        
	}

	private void findGreatestEnglishL(String s) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {
			if(max < s.charAt(i)) {
				max = s.charAt(i);
			}
		}
		
		System.out.println(max);
	}
	
}
