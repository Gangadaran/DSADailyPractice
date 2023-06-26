package day11;

import java.math.BigInteger;

import org.junit.Test;

public class AddStrings {
	/*
	 * 415. Add Strings
	 * https://leetcode.com/problems/add-strings/
	 */
	
	@Test
	public void example() {
		String num1 ="11";
		String num2 = "123";
		System.out.println(addingTwoStrings1(num1,num2));
		}

	private String addingTwoStrings1(String num1, String num2) {
		StringBuilder sum = new StringBuilder();
		int carry =0;
		int i = num1.length()-1;
		int j = num2.length()-1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int currentSum = digit1 + digit2 + carry;
            sum.insert(0, currentSum % 10);
            carry = currentSum / 10;
            i--;
            j--;
        }

        return sum.toString();
	}

	private String addingTwoStrings(String num1, String num2) {
		BigInteger bigint1 = new BigInteger(num1);
		BigInteger bigint2 = new BigInteger(num2);
		BigInteger sum = bigint1.add(bigint2);
		return sum.toString();
		
	}
	

}