package day3;

import java.util.Arrays;

import org.junit.Test;

public class IndexToRemove {
    @Test //Positive
	public void example() {
		int[] nums = {1,2,3,4,5,1};
		int indexToRemove = 5;
		System.out.println(Arrays.toString(removeAtIndex(nums, indexToRemove)));

	}
    @Test //Edge
   	public void example1() {
   		int[] nums = {1,2,3,4,5,6};
   		int indexToRemove = 5;
   		System.out.println(Arrays.toString(removeAtIndex(nums, indexToRemove)));

   	}
    
    @Test //Negative
   	public void example2() {
   		int[] nums = {1,2,3,4};
   		int indexToRemove = 5;
   		System.out.println(Arrays.toString(removeAtIndex(nums, indexToRemove)));

   	}

	private int[] removeAtIndex(int[] nums, int indexToRemove) {
		
		if(nums.length < 5) {
		 System.err.println("The given array doesn't have index 5");
		}
		
		int numToRemove = nums[indexToRemove];
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==numToRemove) {
				count++;
			}
		}
	   int[] result = new int [nums.length-count];
	    int j =0;
	    for (int i = 0; i < nums.length; i++) {
			if (nums[i] != numToRemove ) {
				result[j]= nums[i];
				j++;
			}
		}
	   return result;
	}
}
