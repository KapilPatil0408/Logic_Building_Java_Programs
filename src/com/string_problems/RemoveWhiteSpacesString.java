package com.string_problems;

import java.util.Arrays;

public class RemoveWhiteSpacesString {

	public static void main(String[] args) {

		String input = "   Hello    World    ";
		input = input.trim();
		input = input.replaceAll("\\s+", " ");
		System.out.println(input);
	}
}
