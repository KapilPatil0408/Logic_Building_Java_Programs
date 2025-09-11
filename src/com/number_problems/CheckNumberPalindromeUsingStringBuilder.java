package com.number_problems;

public class CheckNumberPalindromeUsingStringBuilder {

	public static void main(String[] args) {

		int number = 1298;

		// Convert it to String
		String originalNumberInString = Integer.toString(number);
		String originalNumberInString2 = number + "";
		
		// Reverse String using string builder
		StringBuilder reverseStringBuilder= new StringBuilder(originalNumberInString);
		String reverseString= reverseStringBuilder.reverse().toString();
		
		//compare two Strings
		
		if(originalNumberInString.equals(reverseString)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		

	}

}
