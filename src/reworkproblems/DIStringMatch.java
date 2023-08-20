package reworkproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class DIStringMatch {
	/*
	 * https://leetcode.com/problems/di-string-match/
	 */
	
	@Test
	public void example() {
		String s = "IDID";
		find(s);

	}

	private void find(String s) {
	   List<Character> list = new ArrayList<>();
	   
	   int start = 0, end = s.length();
	   for(char c:s.toCharArray()) {
		   list.add(c);
		   
	   }
	   int[] temp = new int[s.length()+1];
	   for (int i = 0; i < list.size(); i++) {
		if (list.get(i)=='I') {
			temp[i] = start++;
		}else {
			temp[i] = end--;
		}
	}
	   
	   System.out.println(Arrays.toString(temp));
		
	}

}
