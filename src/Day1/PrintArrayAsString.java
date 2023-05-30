package day1;



import org.junit.Test;

public class PrintArrayAsString {
	@Test  // Positive
	public void example1() {
		int[] nums = {1,2,3,4,5,6,7};
		printArrayAsString(nums);

	}
	@Test  // Edge
	public void example2() {
		int[] nums = {1,2,3,4,5,6,7};
		printArrayAsString(nums);

	}
	@Test  // Negative
	public void example3() {
		int[] nums = null;
		printArrayAsString(nums);

	}

	private void printArrayAsString(int[] nums) {
		
		if(nums == null) {
			System.out.println(" Array is null");
			return;
		}
		
		
		String temp="";
		for (int i = 0; i < nums.length-1; i++) {
			temp += nums[i];
			
		}
		
		System.out.println(temp);
	}
    
}
