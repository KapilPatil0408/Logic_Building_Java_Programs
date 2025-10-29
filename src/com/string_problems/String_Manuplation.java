package com.string_problems;

public class String_Manuplation {

	public static void main(String[] args) {

		String input = "my3 is2 1st4 round5 This1";
		String[] words = input.split(" ");
		String[] sorted = new String[words.length];

		for (String word : words) {
			for (int i = word.length() - 1; i >= 0; i--) {
				char c = word.charAt(i);
				if (Character.isDigit(c)) {
					int pos = Character.getNumericValue(c) - 1;
					sorted[pos] = word;
					System.out.println("Placing '" + word + "' at position " + pos);
					break;
				}
			}
		}

		System.out.println("\nFinal Output:");
		System.out.println(String.join(" ", sorted));

	}

}
