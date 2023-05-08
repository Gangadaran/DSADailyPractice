package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class KeyboardRow {
	/*
	 * 500. Keyboard Row
	 * https://leetcode.com/problems/keyboard-row/
	 */
   @Test
	public void example() {
		String[] words = {"Hello","Alaska","Dad","Peace"};
		System.out.println(Arrays.toString(findWords(words)));

	}
	
	
	public String[] findWords(String[] words) {
		String s = "qwertyuiop";
		String h = "asdfghjkl";
		String d = "zxcvbnm";
		int c = 0, c1 = 0, c2 = 0;
		ArrayList<String> l = new ArrayList<>();
		for (String o : words) {
			String g = o.toLowerCase();
			c = 0;
			c1 = 0;
			c2 = 0;
			for (int i = 0; i < g.length(); i++) {
				for (int j = 0; j < s.length(); j++) {
					if (g.charAt(i) == s.charAt(j)) {
						c++;
					}
				
				}
			}
			for (int i = 0; i < g.length(); i++) {
				for (int j = 0; j < h.length(); j++) {
					if (g.charAt(i) == h.charAt(j)) {
						c1++;
					}
				}
			}
			for (int i = 0; i < g.length(); i++) {
				for (int j = 0; j < d.length(); j++) {
					if (g.charAt(i) == d.charAt(j)) {
						c2++;
					}
				}
			}

			if (c == g.length()) {
				l.add(o);
			} else if (c1 == g.length()) {
				l.add(o);
			} else if (c2 == g.length()) {
				l.add(o);
			}
		}
		String h1[] = new String[l.size()];
		int y = 0;
		for (String p : l) {
			h1[y++] = p;
		}
		return h1;
	}
	
	
	// Using HashSet
	public List<String> findWords1(String[] words) {
	    Set<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
	    Set<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
	    Set<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
	    List<String> validWords = new ArrayList<>();
	    for (String word : words) {
	        boolean valid = true;
	        Set<Character> row = null;
	        for (char c : word.toLowerCase().toCharArray()) {
	            if (row1.contains(c)) {
	                row = row1;
	            } else if (row2.contains(c)) {
	                row = row2;
	            } else if (row3.contains(c)) {
	                row = row3;
	            }
	            if (row != null && !row.contains(c)) {
	                valid = false;
	                break;
	            }
	        }
	        if (valid) {
	            validWords.add(word);
	        }
	    }
	    return validWords;
	}

}
