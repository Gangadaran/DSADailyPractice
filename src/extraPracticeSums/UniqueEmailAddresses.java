package extraPracticeSums;

import org.junit.Test;

public class UniqueEmailAddresses {
	/*
	 * https://leetcode.com/problems/unique-email-addresses/
	 */
	
	@Test
	public void example() {
		String[] emails = {"test.email+alex@leetcode.com",
				"test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com"};
		find(emails);

	}

	private void find(String[] emails) {
		
		
	    String tempE ="";
		for(String email:emails) {
	    	
			
					
	    	
	    	StringBuilder sb = new StringBuilder();
			for (char c : email.toCharArray()) {
				
				sb.append(c);
			}
	    	
	    	
			StringBuilder tempSb = new StringBuilder();
	    	for (int i = 0; i < sb.length(); i++) {
				if(sb.charAt(i)=='+' || sb.charAt(i)=='@') {
					int indexPlus= sb.indexOf("+");
					int indexat = sb.indexOf("@");
				}
				
				
	    		if (sb.charAt(i)=='.') {
					continue;
				}
				tempSb.append(sb.charAt(i));
			}
	    	}
	    	
	    	
	    }
		
	}


