package extraPracticeSums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class NumberofSegmentsinaString {
	/*
	 * https://leetcode.com/problems/number-of-segments-in-a-string/
	 */
	@Test
	public void example() {
		String s = "Hello, my name is John";
		System.out.println(find1(s));

	}
    
	
	
	
	
	
	private int find1(String s) {
		List<String> list = new ArrayList<>();
		String[] arr = s.split(" ");
		for (String c : arr) {
			if (!c.isEmpty()) {
				list.add(c);
			}
		}
		return list.size();
	}






	// Using Array
	private int find(String s) {
		String[]arr = s.split(" ");
		boolean[] temp = new boolean[arr.length];
		int i =0;
		for (String c: arr) {
			if(!c.isEmpty()) {
				temp[i++]=true;
			}
		}
		int count =0;
		
		for(boolean c:temp) {
			if (c==true) {
				count++;
			}
		}
		return count;
	}

}
