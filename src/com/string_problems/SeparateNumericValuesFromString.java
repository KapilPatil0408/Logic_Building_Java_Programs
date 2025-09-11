package com.string_problems;

public class SeparateNumericValuesFromString {

	public static void main(String[] args) {
		String input="Raj1234k";    // output: -RajK and 1234
		StringBuilder number= new StringBuilder();
		StringBuilder alphabates= new StringBuilder();
		
		for(char currentChar:input.toCharArray()) {
			if(Character.isDigit(currentChar)) {
				alphabates.append(currentChar);
			}else if(Character.isAlphabetic(currentChar)) {
				number.append(currentChar);
			}
		}
		System.out.println(number.toString());
		System.out.println(alphabates.toString());
	}

}
