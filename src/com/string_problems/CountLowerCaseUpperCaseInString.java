package com.string_problems;

public class CountLowerCaseUpperCaseInString {

	public static void main(String[] args) {

		String input="aAbBcCdD";
		char charArray[]=input.toCharArray();
		int lowercaseCount=0;
		int uppercaseCount=0;
		
		for(char c: charArray) {
			if(Character.isLowerCase(c)) {
				lowercaseCount++;
			}else if(Character.isUpperCase(c)) {
				uppercaseCount++;
			}
		}
		System.out.println("Count of lower case characters: "+lowercaseCount);
		System.out.println("Count of upper case characters: "+uppercaseCount);

	}

}
