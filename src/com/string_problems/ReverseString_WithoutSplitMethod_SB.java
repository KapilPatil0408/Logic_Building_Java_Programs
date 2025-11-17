package com.string_problems;

public class ReverseString_WithoutSplitMethod_SB {

	public static void main(String[] args) {

		String input = "Kapil Vilas Patil";

		StringBuilder result = new StringBuilder();
		StringBuilder word = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch != ' ') {
				word.append(ch);
			} else {
				result.append(word.reverse());
				result.append(" ");
				word.setLength(0);
			}
		}
		
		result.append(word.reverse());
		System.out.println(result.toString());
	}

}
