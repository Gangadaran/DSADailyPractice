package dailyMorningProblems;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordPattern {
 
	
	
	
	@Test
	public void example() {
		String pattern = "abba", s = "dog cat cat dog";
       System.out.println( find1(pattern, s));
}
	
	
	
	
	
	
	
	
	
	private boolean find1(String pattern, String s) {
		String[] words = s.split(" ");
		if (pattern.length() !=s.length()) {
			return false;
		}
		
		Map<Character, String> charToWord = new HashMap<>();
		Map<String, Character> wordToChar = new HashMap<>();
		  for (int i = 0; i < pattern.length(); i++) {
	            char c = pattern.charAt(i);
	            String word = words[i];

	            if (charToWord.containsKey(c)) {
	                if (!charToWord.get(c).equals(word)) {
	                    return false;
	                }
	            } else {
	                charToWord.put(c, word);
	            }

	            if (wordToChar.containsKey(word)) {
	                if (wordToChar.get(word) != c) {
	                    return false;
	                }
	            } else {
	                wordToChar.put(word, c);
	            }
	        }

	        return true;
		
		
		
	}









	private boolean find(String pattern, String s) {
		String[] split = s.split(" ");
		
		int i =0,j=0;
		int a =0, b=0, d= 0, c=0;
		while(i < pattern.length() || j < split.length) {
			if (split[j]=="dog") {
				d++;
				j++;
			}else {
				c++;
				j++;
			}
			
			if (pattern.charAt(i)=='a') {
				a++;
				i++;
			}else {
				b++;
				i++;
			}
			
			
			
		}
		
		if (a==d&&b==c) {
			return true;
		}
		return false;
	}









	public  boolean main1() {
		String pattern = "abba";
		String s ="dog cat cat dog";
		
		 String[] split = s.split(" ");
		
		int dcount =0;
		int ccount =0;
		 for (int i = 0; i < split.length; i++) {
			if (split[i].equals("dog")) {
				dcount++;
			}else {
				ccount++;
			}
			
		}
		 int a =0;
			int b =0;
		 
		 for (char string : pattern.toCharArray()) {
			if (string == 'a') {
				a++;
			}else {
				b++;
			}
		}
		 
		 if (a==dcount && b==ccount) {
			return true;
		}
		return false;
	}
	
	private void main2() {
		

	}
	

}
