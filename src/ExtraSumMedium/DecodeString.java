package ExtraSumMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class DecodeString {
	
	/*
	 * https://leetcode.com/problems/decode-string/description/
	 */
	

	
	
	
	public static void main(String[] args) {
		Map<Integer, String> solution = find("3[a]2[bc]");
		StringBuilder sb = new StringBuilder();

		Iterator<Map.Entry<Integer, String>> entries = solution.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<Integer, String> entry = entries.next();
			for (int i = 0; i < entry.getKey(); i++) {
				sb.append(entry.getValue());
			}
		}

		System.out.println(sb);

	}

	private static Map<Integer, String> find(String type) {

		List<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		int[] count = new int[type.length()];
		int i = 0;

		for (char c : type.toCharArray()) {
			if (c == '[') {
				continue;
			}
			if (Character.isAlphabetic(c)) {
				sb.append(c);
			} else if (Character.isDigit(c)) {
				count[i++] = Integer.parseInt(Character.toString(c));
			} else {
				list.add(sb.toString());
				sb.setLength(0);
			}
		}

		Map<Integer, String> map = new LinkedHashMap<>();
		for (int j = 0; j < count.length; j++) {
			if (count[j] == 0) {
				break;
			}
			map.put(count[j], list.get(j));
		}

		return map;
	}

}
