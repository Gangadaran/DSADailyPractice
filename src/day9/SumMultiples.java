package day9;

import org.junit.Test;

public class SumMultiples {
	/*
	 * 2652. Sum Multiples
	 * https://leetcode.com/problems/sum-multiples/description/
	 */
	@Test
	public void example() {
		int n = 10;
		System.out.println(theSumMultiples(n));

	}

	private int theSumMultiples(int n) {
		int count =0;
		
		for (int i = 1; i <= n; i++) {
			if(i%3==0 || i%5==0||i%7==0) {
				count+=i;
			}
		}
		return count;
	}

	
	
}
