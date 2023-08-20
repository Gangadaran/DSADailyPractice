package reworkproblems;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class SortingtheSentence {
	/*
	 * https://leetcode.com/problems/sorting-the-sentence/
	 */
	@Test
	public void example() {
		String s = "is2 sentence4 This1 a3";
		find(s);

	}

	private void find(String s) {
	String[] words =s.split(" ");
	Map<Integer, String> map = new HashMap<>();
	for(String word : words ) {
		String subString = word.substring(0, word.length()-1);
		int num = Integer.parseInt(word.substring(word.length()-1));
		map.put(num, subString);
	}
	StringBuilder sb = new StringBuilder();
	
	for (int i = 1; i <= words.length; i++) {
		sb.append(map.get(i));
		sb.append(" ");
	}
	
	System.out.println(sb);
	
	}

}
