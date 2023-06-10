package day32;

import java.util.Arrays;

import org.junit.Test;

public class FlippinganImage {
	/*
	 * https://leetcode.com/problems/flipping-an-image/
	 */
	
	@Test
	public void example() {
		int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
		find(image);

	}

	private int[][] find(int[][] image) {
		int n = image.length;
		int[][] temp = new int[n][n];
		  for (int i = 0; i < n; i++) {
		        for (int j = 0; j < n; j++) {
		        	temp[i][j] = (image[i][n - 1 - j] == 1) ? 0 : 1;
		        }
		    
		}
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				System.out.print(temp[i][j] +" ");
			}
			System.out.println();
		}
		
		
		return temp;
	}

}
