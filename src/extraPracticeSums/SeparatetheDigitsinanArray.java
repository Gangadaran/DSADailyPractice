package extraPracticeSums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class SeparatetheDigitsinanArray {
	/*
	 * https://leetcode.com/problems/separate-the-digits-in-an-array/
	 */

	@Test
	public void example() {
		int[] nums = { 13, 25, 83, 77 };
		System.out.println(Arrays.toString(find(nums)));

	}

	private int[] find(int[] nums) {
       List<Integer> list = new ArrayList<>();
       for(int c:nums) {
    	   if (c >= 10) {
			String valueOf = String.valueOf(c);
			
			char[] arr = valueOf.toCharArray();
			for (char ch : arr) {
				list.add(Character.getNumericValue(ch));
			}
		}else {
			list.add(c);
		}
       }
       int[] temp = new int[list.size()];
       for(int i=0;i<list.size();i++) {
    	   temp[i] = list.get(i);
       }
       
       return temp;
	}
	
	
}
