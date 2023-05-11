package day16;

import org.junit.Test;

public class FindSmallestLetterGreaterThanTarget {
	/*
	 * 744. Find Smallest Letter Greater Than Target
	 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
	 * 
	 */

	@Test
	public void example() {
		char[] letters = {'c','f','j'};
		char target = 'a';
        System.out.println(findSmallestLetter(letters, target));
	}

	private char findSmallestLetter(char[] letters, char target) {
		  int start = 0;
		    int end = letters.length - 1;

		    while (start <= end) {
		      int mid = (start + end) / 2;

		      if (letters[mid] == target) {
		        start = mid + 1;
		      } else if (letters[mid] > target) {
		        end = mid - 1;
		      } else {
		        start = mid + 1;
		      }
		    }

		    return letters[start] == letters.length ? letters[0] : letters[start];
		
	}
	
	
}
