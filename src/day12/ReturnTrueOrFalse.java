package day12;







import org.junit.Test; 

public class ReturnTrueOrFalse {
	
	/*
	 * 
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
