package day7;




import org.junit.Test;

public class RemoveElement {
	/*
	 * 
	 */
	
	@Test
	public void example() {
		int[] nums = {3,2,2,3};
		int val = 3;
		revElement(nums, val);

	}
    // brute force
	private int revElement(int[] nums, int val) {
		
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j]!= val) {
				 int temp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = temp;
				i++;
			}
		}
		System.out.println(i);
		return i;
	}
	

}
