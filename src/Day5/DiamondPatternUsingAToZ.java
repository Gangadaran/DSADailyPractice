package day5;

import org.junit.Test;

public class DiamondPatternUsingAToZ {
	/*
	     A
	    B B
	   C   C
	  D     D
	 E       E
	F         F
	 E       E
	  D     D
	   C   C
	    B B
	     A
*/
	public static void main(String[] args) {
		int n = 6;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			System.out.print((char) ('A' + i));
			if (i > 0) {
				for (int k = 0; k < 2 * i - 1; k++) {
					System.out.print(" ");
				}

				System.out.print((char) ('A' + i));
			}
			System.out.println();
		}

		for (int i = n - 2; i >= 0; i--) {

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			System.out.print((char) ('A' + i));
			if (i > 0) {

				for (int k = 0; k < 2 * i - 1; k++) {
					System.out.print(" ");
				}

				System.out.print((char) ('A' + i));
			}
			System.out.println();
		}
	}

	

}
