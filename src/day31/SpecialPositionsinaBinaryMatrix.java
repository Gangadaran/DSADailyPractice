package day31;

import org.junit.Test;

public class SpecialPositionsinaBinaryMatrix {
	/*
	 * https://leetcode.com/problems/special-positions-in-a-binary-matrix/
	 */
	
	@Test
	public void example() {
		int[][] mat = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(find(mat));
	}

	private int find(int[][] mat) {
		int count =0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]==1) {
					count++;
					break;
				}
			}
		}
	return count;	
	}

}
