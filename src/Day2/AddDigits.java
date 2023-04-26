package Day2;

import org.junit.Test;

public class AddDigits {
	
	/*
	 * Given an integer num, 
	 * repeatedly add all its digits until the result has only one digit, and return it.
	 */
    @Test
	public void example() {
		int digits = 0;
		addDigits(digits);
		System.out.println(addDigits(digits));

	}
    /*Pseudocode:
     * 
     * If digits is 0, return 0
     * If digits is divisible by 9, return 9
     * Otherwise, return digits modulo 9
     * 
     */

	private int addDigits(int digits) {
		if(digits==0) {
			return digits;
		}
		if (digits % 9 == 0) {
	        return 9;
	    }
		
		return digits%9;
	}
	
	
}
