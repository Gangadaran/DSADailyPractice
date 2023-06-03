package dailyMorningProblems;

import org.junit.Test;

public class AddDigits {
	/*
	 * https://leetcode.com/problems/add-digits/
	 */
    @Test
	public void example() {
		int num = 38;
		System.out.println(add(num));

	}

	private int add(int num) {
		
		if (num==9) {
			return num;
		}
       
		while(num >= 9) {
			int remainder = num/10;
	         int quetiant = num%10;
	         
	         num = remainder+quetiant;
		}
		return num;
	}
}
