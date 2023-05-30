 package day5;



import org.junit.Test;

public class MaximumNumber {

	@Test
	public void example() {
	int num = 9669;
	System.out.println(findMaximumNumber1(num));
	
}

	
	
	// Using String
	
	public int findMaximumNumber1(int num) {
	    String num_str = Integer.toString(num);
	    for (int i = 0; i < num_str.length(); i++) {
	        if (num_str.charAt(i) == '6') {
	            return Integer.parseInt(num_str.substring(0, i) + '9' + num_str.substring(i+1));
	        }
	    }

	    return num;
	}
	
	// Using String
	
	public int maximum69Number (int num) {

        String s = String.valueOf(num);
        char[] ch = s.toCharArray();
        
        for(int i = 0 ; i<ch.length;i++) {
        	if(ch[i]=='6') {
        		ch[i]='9';
        		break;
        	}
        }
        
       return Integer.parseInt(String.valueOf(ch));
       
       
    }

}
