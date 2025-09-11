package com.string_problems;

public class FirstAndLastOccurenceOfCharacter {

	public static void main(String[] args) {

		String input = "Hello world";
		int firstIndex = -1;
		int lastIndex = -1;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'j') {
				firstIndex = i;
				break;
			}
		}

		for (int i = input.length() - 1; i >= 0; i--) {
			if (input.charAt(i) == 'j') {
				lastIndex = i;
				break;
			}
		}

		if (firstIndex < 0) {
			System.out.println("Character is not present in string");
		} else {
			System.out.println("First occurance of character:- " + firstIndex);
			System.out.println("Last occurance of character:- " + lastIndex);
		}

	}

}
