package Day3;

import org.junit.Test;

public class Diamond {
// Print diamond	
//	    *
//	   ***
//	  *****
//	 *******
//	*********
//	 *******
//	  *****
//	   ***
//	    *
	@Test
	public void example1() {
		int n = 5;
		printDiamond(n);

	}
	/*
	 * Pseudocode:
	 * 
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
