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
		int columnNumber = 28;
		System.out.println(convertToTitle(columnNumber));
	}

	
	
	
	
	
	
	
	
	
	
	
	private String convertToTitle(int columnNumber) {
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		while (columnNumber > 0) {
			
			int remainter = (columnNumber -1) % 26; // 1 
			sb.append(alpha.charAt(remainter)); //b
			columnNumber = (columnNumber -1) / 26;
		         
		}
		
		return sb.reverse().toString();
		
	}












	private String convertToTitle1(int columnNumber) {
		StringBuilder title = new StringBuilder();
	  
	    while (columnNumber > 0) {
	        int remainder = (columnNumber - 1) % 26;   //Subtract 1 from columnNumber, since Excel column numbers are 1-indexed
	        char letter = (char) ('A' + remainder);
	        title.insert(0, letter);
	        columnNumber = (columnNumber - 1) / 26;
	    }
	    
	    return title.toString();
		
	}
	
	
	
	
	

}
