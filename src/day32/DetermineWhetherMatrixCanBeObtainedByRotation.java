package day32;

import java.util.Arrays;

import org.junit.Test;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
	/*
	 * https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-
	 * rotation/
	 */

	@Test
	public void example() {
		int[][] mat = { { 0,1}, { 1,0 }};

		int[][] target = { {1,0}, { 0,1 } };

	System.out.println(find(mat, target));

	}

	private boolean find(int[][] mat, int[][] target) {
		   int n = mat.length;
	        
	        // Check if mat and target are already equal
	        if (Arrays.deepEquals(mat, target)) {
	            return true;
	        }
	        
	        // Rotate mat up to 3 times and check if it matches target
	        for (int i = 0; i < 3; i++) {
	            mat = rotateMatrix(mat, n);
	            
	            if (Arrays.deepEquals(mat, target)) {
	                return true;
	            }
	        }
	        
	        return false;
       
       
	}
	
	private int[][] rotateMatrix(int[][] mat, int n) {
		 int[][] rotated = new int[n][n];
	        
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                rotated[j][n - 1 - i] = mat[i][j];
	            }
	        }
	        
	        return rotated;
	}

}
