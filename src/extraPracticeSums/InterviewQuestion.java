package extraPracticeSums;

import org.junit.Test;

public class InterviewQuestion {
	
	@Test
	public void example() {
		String sentence  = "hello! welcome to java";
		System.out.println(find(sentence));

	}

	private String find(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String word: words) {
			for (int i = 0; i < word.length(); i++) {
				if (i==0) {
					char temp = word.charAt(i);
					sb.append(Character.toUpperCase(temp));
					continue;
				}
				
				sb.append(word.charAt(i));
			}
			
			sb.append(" ");
		}
		
		return sb.toString();
	}

}
