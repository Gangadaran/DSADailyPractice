package day17;

import java.util.Arrays;

import org.junit.Test;

public class ProductofArrayExceptSelf {
	/*
	 * 238. Product of Array Except Self
	 * https://leetcode.com/problems/product-of-array-except-self/

	 */
	
	@Test
	public void example() {
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(exceptSelf(nums)));

	}

	private int[] exceptSelf(int[] nums) {
        int[] temp = new int[nums.length];
        
        for(int i=0; i < nums.length; i++){
             

        }
        for(int j=0; j < nums.length; j++){
            int multi =1;
            if(i!=j){
                multi *= nums[j];
                temp[i] = multi;
            }
        }
      
        return temp;
		
	}

}
