package patternSums;

public class PyramidProgram {
	/*
	 * https://www.edureka.co/blog/30-pattern-programs-in-java/
	 */
	static int row = 5;
	public static void main(String[] args) {
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < row-i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

}
