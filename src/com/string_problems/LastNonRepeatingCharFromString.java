package com.string_problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class LastNonRepeatingCharFromString {

	public static void main(String[] args) {
		String input = "aabbccde";

		char result = getLastNonRepeatingChar(input);

		if (result != 0) {
			System.out.println("Last non repeating character: " + result);
		} else {
			System.out.println("No non repeating character: " + result);
		}
	}

	public static char getLastNonRepeatingChar(String input) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			if (map.get(ch) == 1) {
				// System.out.println("Last non repeating character: "+ ch);
				return ch;
			}
		}
		return 0;
	}
}
