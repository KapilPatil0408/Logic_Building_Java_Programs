package com.string_problems;

public class StringManuplication1 {

	public static void main(String[] args) {
		String input="programming is fun";    // output: - Prgrmmng S Fn
		StringBuilder result= new StringBuilder();
		
		String inputArray[]= input.split(" ");
		
		for(String str: inputArray) {
			String noVowels = str.replaceAll("[aeiouAEIOU]", "");
			
			
			if(!noVowels.isEmpty()) {
				noVowels = Character.toUpperCase(noVowels.charAt(0)) + noVowels.substring(1);  
				//In Java, when you use + between: a char and a String, → Java promotes the char to a String automatically.
				//	If both sides were chars, e.g. 'A' + 'B', Java would add their ASCII values (resulting in an int).
				//	But if one side is a String, Java automatically treats it as String concatenation.
			}
			
			result.append(noVowels).append(" ");
		}
		
		System.out.println(result.toString());
		

	}

}
