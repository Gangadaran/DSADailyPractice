package extraPracticeSums;

import java.util.Iterator;

import org.junit.Test;

public class RichestCustomerWealth {
	/*
	 * https://leetcode.com/problems/richest-customer-wealth/
	 */
	
	@Test
	public void example() {
		int[][] accounts = {{1,2,3},{3,2,1}};
		System.out.println(find1(accounts));

	}

	private int find1(int[][] accounts) {
		int max = Integer.MIN_VALUE;
		
		for(int[] row : accounts) {
			int rowSum =0;
			for (int num : row) {
				rowSum +=num;
			}
			max = Math.max(max, rowSum);
		}
		
		return max;
	}

	private int find(int[][] accounts) {
		int length = accounts.length;
		int max = Integer.MIN_VALUE;
		
		
		for (int i = 0; i <length; i++) {
			int rC =0;
			for (int j = 0; j < accounts[i].length; j++) {
				rC += accounts[i][j];
			}
			if (rC > max) {
				max = rC;
			}
		}
		return max;
	}

}
