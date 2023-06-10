package day21;

import java.util.Stack;

import org.junit.Test;

public class CrawlerLogFolder {
	/*
	 * https://leetcode.com/problems/crawler-log-folder/
	 */
	@Test
	public void example() {
		String[] logs = {"d1/","d2/","../","d21/","./"};  // d1 ->d21
		System.out.println(minOperations1(logs));

	}
	@Test
	public void example1() {
		String[] logs = {"./","../","./"};  
		System.out.println(minOperations1(logs));

	}

	private int minOperations1(String[] logs) {
		   int depth = 0;
	        
	        for (String log : logs) {
	            if (log.equals("../")) {
	                if (depth > 0) {
	                    depth--;
	                }
	            } else if (!log.equals("./")) {
	                depth++;
	            }
	        }
	        
	        return depth;
		
	}
	private int minOperations(String[] logs) {
	    Stack<String> stack = new Stack<>();

        for (String log : logs) {
            if (log.equals("../")  ) {
                
                    if (!stack.isEmpty()) {
						stack.pop();
					}
                
            } else if (!log.equals("./")) {
                stack.push(log);
            }
        }

        return stack.size();
	}

}
