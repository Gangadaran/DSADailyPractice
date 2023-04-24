package Day1;

import org.junit.jupiter.api.Test;

public class Pyramid {
	
	@Test // Positive
	public void example1() {
		int n = 5;
		printPyramid(n);

	}
	@Test // Edge 
	public void example2() {
		int n = 5/2;
		printPyramid(n);

	}
	@Test // Negative 
	public void example3() {
		int n = -10;
		printPyramid(n);

	}

	private void printPyramid(int n) {
		
		if(n<1) {
			System.err.println("Given value is negative : "+ n);
		}
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}



}
	    
	



	

