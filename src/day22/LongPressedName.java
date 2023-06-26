package day22;

import org.junit.Test;

public class LongPressedName {
	/*
	 * https://leetcode.com/problems/long-pressed-name/
	 */
	
	@Test
	public void example() {
		String name = "alex", typed = "aaleex";
		System.out.println(isLongPressedName(name, typed));

	}

	private boolean isLongPressedName(String name, String typed) {
		int i =0;
		int j =0;
		int n = name.length();
		int m = typed.length();
		if (name.charAt(0) != typed.charAt(0)) {
			return false;
		}
		if (n>m) {
			return false;
		}
		
		while (i <n && j < m) {
			if (name.charAt(i)==typed.charAt(j)) {
				i++;
				j++;
			} else if (name.charAt(i-1)==typed.charAt(j)) {
				j++;
			}else {
				return false;
			}
			
		}
		
		while (j<m) {
			if (name.charAt(i-1)==typed.charAt(j)) {
				j++;
			}else {
				return false;
			}
		}
		 if(i<n){      // step 6
	            return false;
	        }
	        return true;  
	}

}
