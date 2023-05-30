package day25;

import org.junit.Test;

public class FinalValueofVariableAfterPerforming {
	/*
	 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
	 */
	@Test
	public void example() {
		String[] operations = {"--X","X++","X++"};
		System.out.println(finalValueAfterOperations1(operations));

	}

	
	
	private int finalValueAfterOperations1(String[] operations) {
		int x=0;
		for(String c:operations) {
			if (c.equals("++X") || c.equals("X++")) {
				x++;
			}else if (c.equals("--X") || c.equals("X--")) {
				x--;
			}
		}
		return x;
	}



	private int finalValueAfterOperations(String[] operations) {
		int sum =0;
		for (int i = 0; i < operations.length; i++) {
			if (operations[i]=="--X") {  // shouldn't use == when you handle strings
				
				sum -=1;
			}else if ((operations[i]=="X++")) {
				sum +=1;
			}
		}
		return sum;
	}

}
