package com.string_problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondLastNonRepCharInString {

	public static void main(String[] args) {

		String input = "swissrocks";
		char result = getSecondLastNonRepeatingChar(input);

		if (result != 0) {
			System.out.println("Second last non repeating character is: " + result);
		} else {
			System.out.println("No second last non repeating character");
		}

	}

	private static char getSecondLastNonRepeatingChar(String input) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		int count = 0;
		System.out.println(map);

		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			if (map.get(ch) == 1) {
				count++;
				if (count == 2) {
					return ch;
				}
			}
		}

		return 0;
	}
}
