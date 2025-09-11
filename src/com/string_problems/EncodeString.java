package com.string_problems;

public class EncodeString {

	public static void main(String[] args) {

		String input = "ddmmmmtta";
		StringBuilder result = new StringBuilder();
		int count = 1;

		for (int i = 1; i < input.length(); i++) {
			if ((input.charAt(i)) == (input.charAt(i - 1))) {
				count++;
			} else {
				result.append(input.charAt(i - 1)).append(count);
				count = 1;
			}
		}
		result.append(input.charAt(input.length()-1)).append(count);
		System.out.println(result);
	}
}
