package extraPracticeSums;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class FindCommonCharacters {
	/*
	 * https://leetcode.com/problems/find-common-characters/
	 */
	@Test
	public void example() {
	String[] words = {"bella","label","roller"};
	System.out.println(find(words));

	}

	private List<String> find(String[] words) {
		
		Map<Character,Integer> map = new HashMap<>();
		
		String firstWord = words[0];
		for (char c : firstWord.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		
		for (int i = 1; i < words.length; i++) {
			Map<Character, Integer> mab = new HashMap<Character, Integer>();
			for(char c: words[i].toCharArray()) {
				mab.put(c, mab.getOrDefault(c, 0)+1);
			}
			
			for (char key : map.keySet()) {
				int cC=mab.get(key);
				int minC = Math.min(cC, map.get(key));
				map.put(key, minC);
			}
			
		}
		List<String> commonChars = new ArrayList<>();
        for (char key : map.keySet()) {
            for (int i = 0; i < map.get(key); i++) {
                commonChars.add(String.valueOf(key));
            }
        }
        
        return commonChars;
		
		
		
		
		
	}

}
