package extraPracticeSums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class InterviewQuestion1 {

	@Test
	public void example() {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Gangadara Sarangam");
		map.put(2, "Anu Mohan");
		map.put(3, "Arun Kumar");

		find(map);

	}

	private LinkedHashMap<Integer, String> find(HashMap<Integer, String> map) {
		int[] arr = new int[26];

		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			String temp = entry.getValue();
			String[] temp1 = temp.split(" ");
			String temp2 = temp1[1];
			char temp3 = temp2.charAt(0);

			arr[temp3 - 'A'] = entry.getKey();
		

		}
		
		LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				map1.put(arr[i], map.get(arr[i]));
			}
		}

		

		return map1;
	}

}
