package extraPracticeSums;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GoalParserInterpretation {
	/*
	 * 1678. Goal Parser Interpretation
	 * https://leetcode.com/problems/goal-parser-interpretation/
	 */
	@Test
	public void example() {
		String command = "G()(al)";
		System.out.println(interpret(command));
	}

	private String interpret(String command) {
		StringBuilder sb = new StringBuilder();
		Map<String, String> map = new HashMap<>(); 
		map.put("G", "G");
		map.put("()", "o");
		map.put("(al)", "al");
		
		for(String key: map.keySet()) {
			command = command.replace(key, map.get(key));
		}
		
		return command;
	}

}
