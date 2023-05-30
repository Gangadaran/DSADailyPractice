package day30;

import org.junit.Test;

public class MatrixDiagonalSum {
	/*
	 * Matrix Diagonal Sum
	 */
	
	@Test
	public void example() {
		int[][] mat = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		System.out.println(diagonalSum(mat));
	}

	private int diagonalSum(int[][] mat) {
	    int n = mat.length;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; // Add elements from primary diagonal
            sum += mat[i][n - i - 1]; // Add elements from secondary diagonal
        }
        
        // Subtract the duplicate element in the center (if the matrix size is odd)
        if (n % 2 == 1) {
            int center = n / 2;
            sum -= mat[center][center];
        }
        
        return sum;
	}

}
