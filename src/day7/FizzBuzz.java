package day7;

import java.util.Arrays;

import org.junit.Test;

public class FizzBuzz {
	/*
	 * 412. Fizz Buzz
	 * https://leetcode.com/problems/fizz-buzz/description/
	 */
	
	@Test
	public void example() {
		int n = 3;
		System.out.println(Arrays.toString(findFizzBizz(n)));

	}

	private String[] findFizzBizz(int n) {
		String[] ans = new String[n];
		for (int i = 1; i <=n; i++) {
			if (i%3==0 && i%5==0) {
				ans[i-1] = "FizzBuzz";
			}else if (i%3==0) {
				ans[i-1] = "Fizz";
				
			} else if (i%5==0) {
				ans[i-1] ="Buzz";
			}else {
				ans[i-1] = Integer.toString(i);
			}
		}
		
		return ans;
	}

}
