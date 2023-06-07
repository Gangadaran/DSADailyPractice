package dailyMorningProblems;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
	/*
	 * https://leetcode.com/problems/keyboard-row/
	 */
	
	public void example() {
		String[] words = {"Hello","Alaska","Dad","Peace"};
		findWords(words);

	}

	private void findWords(String[] words) {
	    List<String> list = new ArrayList<>();
	    
	    String[] rows = {"qwertyuiop","asdfghjkl","zxcvbnm"};
	    
	    for (String word : words) {
	    	String lowerCaseWord = word.toLowerCase();
	    	
			
		}
		
	}
	
	
	private boolean isWordInRow(String word, String row) {
		for(char c:word.toCharArray()) {
			if (row.indexOf(c)==-1) {
				return false;
			}
		}
		return true;

	}
	
	

}
