package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SortingtheSentence {
	/*
	 * 1859. Sorting the Sentence
	 * https://leetcode.com/problems/sorting-the-sentence/
	 */
    @Test
	public void example() {
		String s = "is2 sentence4 This1 a3";
		System.out.println(sortingSentence(s));

	}

	private String sortingSentence(String s) {
		String[] words= s.split(" ");
		Map<Integer,String> map = new HashMap<>();
		for(String word:words) {
			String substring = word.substring(0, word.length()-1);
			int num = Integer.parseInt(word.substring(word.length()-1));
			map.put(num, substring);
		}
		
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= words.length; i++) {
			list.add(map.get(i));
		}
     return String.join(" ", list);		
	}

	
}
