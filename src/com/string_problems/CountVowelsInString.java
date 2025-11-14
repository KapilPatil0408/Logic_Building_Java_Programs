package com.string_problems;

public class CountVowelsInString {

	public static void main(String[] args) {

		String input = "Hello world";
		String vowels = "aeiouAEIOU";
		int vowelsCount = 0;

		for (int i = 0; i < input.length(); i++) {
			if ((vowels.indexOf(input.charAt(i)) != -1)) {
				vowelsCount++;
			}
		}
		System.out.println(vowelsCount);

	}

}
