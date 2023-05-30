package day1;

import org.junit.Test;



public class AddToTheSpecific {
	@Test // Positive
	public void example1() {
		int[] nums= {1,2,4};
		int addNumber = 3;
		int index = 2;
		addToTheSpecificIndex(nums, addNumber, index);


	}
	
	@Test // Edge
	public void example2() {
		int[] nums= {1,2,4};
		int addNumber = 2;
		int index = 5;
		addToTheSpecificIndex(nums, addNumber, index);


	}
	
	@Test // Negative
	public void example3() {
		int[] nums= {};
		int addNumber = 2;
		int index = 2;
		addToTheSpecificIndex(nums, addNumber, index);


	}
  
	private void addToTheSpecificIndex(int[] nums, int addNumber, int index) {
		if(index > nums.length) {
			System.err.println("Array out of bound exception");
			return;
		}
		if (nums.length <1) {
			System.err.println("Array is empty");
			return;
		}
		
		
		int[] op = new int [nums.length+1];
		int length =nums.length-1;
		int i=0;
		for ( ; i <=length ; i++) {
			if (i <index) {
				op[i] = nums[i];
			} else {
				op[i] = addNumber;
				op[i+1] = nums[i];
			}
			
		}
		for (int i1 = 0; i1 < op.length; i1++) {
			System.out.println(op[i1]);
		}
		
		
		
	}
	
	
	


}
		
	

	

	
		
	


