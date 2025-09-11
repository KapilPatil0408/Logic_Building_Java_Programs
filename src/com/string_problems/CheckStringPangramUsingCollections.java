package com.string_problems;

import java.util.HashSet;

public class CheckStringPangramUsingCollections {

    public static void main(String[] args) {
    	
    	 String input = "The quick brown fox jumps over the lazy dog";
    	 
    	 boolean result = checkPangram(input);
    	 
    	 if(result) {
    		 System.out.println("String is palindrome");
    	 }else {
    		 System.out.println("String is not palindrome");
    	 }
        
    }

	private static boolean checkPangram(String input) {
		
		HashSet<Character> charaterSet = new HashSet<Character>();
		char inputArray[]=input.toLowerCase().toCharArray();
		
		for(char character : inputArray) {
			if(Character.isLetter(character)) {
				charaterSet.add(character);
			}
		}
		
		if(charaterSet.size() == 26) {
			return true;
		}
		return false;
	}
}