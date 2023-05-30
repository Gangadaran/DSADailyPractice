package day24;

import org.junit.Test;

public class DefanginganIPAddress {
	/*
	 * https://leetcode.com/problems/defanging-an-ip-address/
	 */
	
	@Test
	public void example() {
		String address = "1.1.1.1";
		System.out.println(defangIPaddr1(address));

	}

	
	
	
	
	private String defangIPaddr1(String address) {
	  StringBuilder sb = new StringBuilder();
	  
	  for (int i = 0; i < address.length(); i++) {
		     char c = address.charAt(i);
		     if(c=='.') {
		    	 sb.append("[.]");
		     }else {
		    	 sb.append(c);
		     }
	    	     
	}
		
		
		
	  return sb.toString();
	}





	// using inbuild methods
	private String defangIPaddr(String address) {
		return address.replaceAll("\\.", "[.]");
		
		
	}

}
