package extraPracticeSums;

public class LongestSubStringWithAtMostTwoDistinctCharacter {
	/*
	 *  It's premium problem, not able to access it
	 */
	
	public void example() {
		String s = "eceba";
		find(s);
		

	}

	private void find(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0));
		
		for (char c : s.toCharArray()) {
			if () {
				
			}
		}
		
	}
	
	private boolean isAvailable(StringBuilder sb, char c) {
		if (sb.toString().indexOf(c)==-1) {
			return false;
		}
      return true;
	}

}
