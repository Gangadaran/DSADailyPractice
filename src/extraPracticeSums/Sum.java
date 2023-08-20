package extraPracticeSums;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Sum {
	
	@Test
	public void example() {
		String input ="gayathri";
		find(input);

	}
	//output          : 1a121111

	private void find(String input) {
	  Map<Character, Integer> map = new HashMap();
	  int[] arr = new int[26];
	  for(char c:input.toCharArray()) {
		  arr[c-'a']++;
	  }
	  
	  for(char c:input.toCharArray()) {
		  map.getOrDefault(c, map.getOrDefault(c, 0)+1);
		  
	  }
	 StringBuilder sb = new StringBuilder();
	 int i =0;
	  for(char c: input.toCharArray()) {
		  if (map.get(c)==1) {
			sb.append("1");
		}else if(map.get(c) > 1) {
			sb.append();
		
		}else if(map.get(c)== arr[c-'a']){
			arr[i++] = map.get(c);
		 
	  }
		
	}
	

}
