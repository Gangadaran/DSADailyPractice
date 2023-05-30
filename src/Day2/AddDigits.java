package day2;

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
		if (digits < 10) {
			return digits;
		}

		int sumDigits = 0;
		int rem = 0;
		int quo = 0;

		while (digits > 9) {
			rem = digits % 10;
			quo = digits / 10;
			sumDigits = rem + quo;
			digits = sumDigits;
		}
		return sumDigits;
	}
	public int some(int sum) {
		int ans = addDigits(sum);
		while (ans > 9) {
			ans = addDigits(ans);
		}

		return ans;
	}
	
}
