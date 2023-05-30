package day3;

import org.junit.Test;

public class RightPascalTriangle
 {

	@Test
	public void example1() {
		int n = 5;
		printDiamond(n);

	}
	/*
	 * Pseudocode:
	 * 
	 * Print the upper half of the diamond
	 * Print asterisks
	 * Move to next line
	 * Print the lower half of the diamond
	 * Print asterisks
	 * Move to next line
	 * 
	 */
	
	
	
	private void printDiamond(int n) {
		for (int i = 0; i < n; i++) {
             for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = n - 1; i > 0; i--) {

			for (int j = 0; j < i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}


}
