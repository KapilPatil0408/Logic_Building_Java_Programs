package com.string_problems;

public class LastNonRepUsingString {

	public static void main(String[] args) {

		String input = "swissrocks";

		char result = getLastNonRepChar(input);

		if (result != 0) {
			System.out.println("Last non repeating character: " + result);
		} else {
			System.out.println("no non repeating character in string");
		}

	}

	private static char getLastNonRepChar(String input) {

		int freq[] = new int[256];

		for (char c : input.toCharArray()) {
			freq[c]++;
		}

		for (int i = input.length() - 1; i >= 0; i--) {
			char c = input.charAt(i);
			if (freq[c] == 1)
				return c;
		}
		return 0;
	}
}
