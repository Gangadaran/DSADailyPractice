package day31;

import org.junit.Test;

public class CheckifMatrixIsX_Matrix {
	/*
	 * https://leetcode.com/problems/check-if-matrix-is-x-matrix/
	 */

	@Test
	public void example() {
		int[][] grid = { { 1, 0, 0, 0 }, { 0, 2, 0, 0 }, { 0, 0, 3, 0 }, { 0, 0, 0, 4 } };
        System.out.println(find(grid));
	}

	private boolean find(int[][] grid) {
	     int n = grid.length;

	        // Check diagonals for non-zero elements
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                // If not a diagonal element
	                if (i != j && i != n - 1 - j) {
	                    // Check if element is non-zero
	                    if (grid[i][j] != 0) {
	                        return false; // Not an X-Matrix
	                    }
	                } else {
	                    // Check if diagonal element is zero
	                    if (grid[i][j] == 0) {
	                        return false; // Not an X-Matrix
	                    }
	                }
	            }
	        }

	        return true; // X-Matrix
	}
	
	
	private boolean isOne(int num) {
		return num !=0;

	}

}
