package extraPracticeSums;

import org.junit.Test;

public class SubstringsofSizeThreewithDistinctCharacters {
	/*
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
	 */
	
	@Test
	public void example() {
		String s = "xyzzaz";
		System.out.println(find1(s));

	}

	private int find1(String s) {
		int count =0;
		for (int i = 0; i < s.length()-2; i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
			char c3 = s.charAt(i+2);
			
			if (c1!=c2 && c2!=c3 && c3!=c1) {
				count++;
			}
		}
		
		return count;
	}

	// using brute force
	private int find(String s) {
		StringBuilder sb = new StringBuilder();
		int count =0;
		for(char c :s.toCharArray()) {
			if (isAvailable(sb,c)) {
				break;
			}else {
				sb.append(c);
			}
			
		}
		
		int result = s.length()/sb.length();
		return result/2;
	}
	
	//internal method
	private boolean isAvailable(StringBuilder sb, char c) {
		
		if (sb.toString().indexOf(c)==-1) {
			return false;
		}
		
		
		return true;

	}

}
