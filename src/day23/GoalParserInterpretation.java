package day23;

import org.junit.Test;

public class GoalParserInterpretation {
	/*
	 * https://leetcode.com/problems/goal-parser-interpretation/
	 */
	
	@Test
	public void example() {
		String arr = "G()(al)";
        System.out.println(find1(arr));
	}

	private String find1(String arr) {
		return arr.replace("()", "o").replace("(al)", "al");
		}

	private String find(String arr) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length(); i++) {
			if (arr.charAt(i)=='G') {
				sb.append('G');
			}else if(arr.charAt(i)=='(') {
				if(arr.charAt(i+1)==')') {
			     sb.append('o');
			     i++;
				}else if (arr.charAt(i+1)=='a' && arr.charAt(i+2)=='l') {
					sb.append("al");
					i +=2;
				}
				
			}
		}
		return sb.toString();
	}

}
