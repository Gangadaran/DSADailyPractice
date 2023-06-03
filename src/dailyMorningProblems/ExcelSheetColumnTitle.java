package dailyMorningProblems;

import org.junit.Test;

public class ExcelSheetColumnTitle {
	/*
	 * https://leetcode.com/problems/excel-sheet-column-title/
	 */
	@Test
	public void example() {
		int columnNumber = 1;
		System.out.println(convertToTitle(columnNumber));

	}

	private String convertToTitle(int columnNumber) {
		String s ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		while (columnNumber > 0) {
			int remainder = (columnNumber -1) % 26;
			sb.append(s.charAt(remainder));
			columnNumber = (columnNumber -1) / 26;
		}
		
		return sb.reverse().toString();
		
	}

}
