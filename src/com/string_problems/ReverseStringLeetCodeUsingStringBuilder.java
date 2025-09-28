package com.string_problems;

public class ReverseStringLeetCodeUsingStringBuilder {

	public static void main(String[] args) {
		String input;
		input = "the sky is blue";
		reverseWord(input);
		input = "  hello world  ";
		reverseWord(input);
		input = "a good   example";
		reverseWord(input);
	}

	private static void reverseWord(String input) {

		input = input.trim();
		System.out.println(input);
		String inputArray[] = input.split("\\s+");
		StringBuilder result= new StringBuilder();

		for (int i = inputArray.length - 1; i >= 0; i--) {
			result.append(inputArray[i]);
			if(i>0) {
				result.append(" ");
			}
		}
		
		System.out.println(result.toString());
	}
}
