package extraPracticeSums;

import org.junit.Test;

public class SumMultiples {
	/*
	 * https://leetcode.com/problems/sum-multiples/
	 */
	@Test
	public void example() {
		int n =7;
		System.out.println(find(n));

	}

	private int find(int n) {
		int count =0;
		for (int i = 1; i <= n; i++) {
			if (i%3==0 || i%5==0 || i%7==0) {
				count +=i;
			}
		}
		return count;
	}

}
