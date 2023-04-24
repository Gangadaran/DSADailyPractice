package Day1;

import org.junit.Test;



public class RemoveAValue {
	@Test // Positive
	public void example1() {
		int[] nums= {1,2,4};
		int removeIndex = 2;
		removeValue(nums, removeIndex);


	}
	
	

	@Test // Edge
	public void example2() {
		int[] nums= {1,2,4};
		int removeIndex = 3;
		removeValue(nums,removeIndex);


	}
	
	@Test // Negative
	public void example3() {
		int[] nums= {};
		int removeIndex = 1;
		removeValue(nums,removeIndex);


	}
  
	private void removeValue(int[] nums, int removeIndex) {
		
		
		
		int [] op = new int [nums.length-1];
		int i = 0;
		for (; i <=nums.length-1; i++) {
			if (i==removeIndex) {
				
				continue;
			} 
			op[i] = nums[i];
		}
		
		for (int i1 = 0; i1 <= op.length-1; i1++) {
			System.out.println(op[i1]);
		}
		
	}
		
		
		
	}
	
	
	



		
	

	

	
		
	


