package ExtraSumMedium;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

public class Sample {
	
	public static void main(String[] args) {
		String name = "welcome to java";
		StringBuilder sb = new StringBuilder();
		
		String[] words = name.split(" ");
		for(String word:words) 
		{
		    char c = word.charAt(1);
			
			sb.append(changeFirstCharacterToCaptial(name, c));
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
	}
	
	
	private static String changeFirstCharacterToCaptial(String s, char a) {
	     
		return s.replace(a, Character.toUpperCase(a));

	}
}
