package extraPracticeSums;

import org.junit.Test;

public class RemoveVowelsfromaString {
	/*
	 * This is premium question
	 */
	
	@Test
	public void example() {
		String s = "leetcode";
		System.out.println(find(s));

	}

	private String find(String s) {
	   StringBuilder sb = new StringBuilder();
	   for(char c:s.toCharArray()) {
		   if (!isVowel(c)) {
			sb.append(c);
		}
	   }
	   
		return sb.toString();
	}
	
	private boolean isVowel(char c) {
		if (c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
			return true;
		}
     return false;
	}

}
