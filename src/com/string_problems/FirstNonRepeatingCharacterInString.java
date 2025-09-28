package com.string_problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterInString {

	public static void main(String[] args) {

		String input = "aabbeedc";
		char result = getFirstNonRepeatingChar(input);

		if (result != 0) {
			System.out.println("First non repeating character: " + result);
		} else {
			System.out.println("no non repeating character is present");
		}

	}

	private static char getFirstNonRepeatingChar(String input) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (char ch : input.toCharArray()) {
			if (map.get(ch) == 1) {
				return ch;
			}
		}
		return 0;
	}
}
