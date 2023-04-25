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

	private int addDigits(int digits) {
		if(digits==0) {
			return digits;
		}
		return (digits%9==0) ? 9:digits%9;
	}
	
	
}
