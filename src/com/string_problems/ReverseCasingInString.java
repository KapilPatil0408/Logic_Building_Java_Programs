package com.string_problems;

public class ReverseCasingInString {

	public static void main(String[] args) {

		String input = "Hello World";
		char inputArray[] = input.toCharArray();
		StringBuilder result = new StringBuilder();

		for (char c : inputArray) {
			if (Character.isUpperCase(c)) {
				result.append(Character.toLowerCase(c));
			} else if (Character.isLowerCase(c)) {
				result.append(Character.toUpperCase(c));
			} else {
				result.append(c);
			}
		}
		System.out.println("Old String: "+input);
		System.out.println("Result:  "+result.toString());
	}
}
