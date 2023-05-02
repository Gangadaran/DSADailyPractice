package day6;

import org.junit.Test;

public class ExcelSheetColumnTitle {
	/*
	 * 168. Excel Sheet Column Title 
	 * https://leetcode.com/problems/excel-sheet-column-title/description/
	 * 
	 */
	
	@Test
	public void example() {
		int columnNumber = 1000;
		System.out.println(convertToTitle(columnNumber));
	}

	private String convertToTitle(int columnNumber) {
		StringBuilder title = new StringBuilder();
	  
	    while (columnNumber > 0) {
	        int remainder = (columnNumber - 1) % 26;   //Subtract 1 from columnNumber, since Excel column numbers are 1-indexed
	        char letter = (char) ('A' + remainder);
	        title.insert(0, letter);
	        columnNumber = (columnNumber - 1) / 26;
	    }
	    
	    return title.toString();
		
	}
	
	private void convertToTitle1() {
		StringBuilder sb = new StringBuilder();
		

	}
	
	
	

}
