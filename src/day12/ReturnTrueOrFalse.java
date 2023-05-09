package day12;







import org.junit.Test; 

public class ReturnTrueOrFalse {
	
	/*
	 * Given two strings s1 & s2, return true if s1 is an anagram of s2

example: 
String s1="abb";
String s2="eidbdooobab";
Output => true since s2 contains s1 (bab is => abb)

Example 2: 
String s1="ab";
String s2="eidboaoo";
Output => false => since ab is not part of any combination in s2
	 */
	
	
	@Test
	public void example() {
	    String s1 = "abb";
	    String s2 = "eidbdooobab";
	    findAnagram(s1, s2);
	}

	private void findAnagram(String s1, String s2) {
	    char[] array = s2.toCharArray();
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < array.length; i++) {
	        sb.append(array[i]);
	 
	}
	}

}
