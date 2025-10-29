package com.string_problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class NthLastNonRepCharInString {

	public static void main(String[] args) {
		String input = "abcddecbfe";
		int n = 2;
		char result = getNthLastNonRepChar(input, n);

		if (result != 0) {
			System.out.println(n + "th last non repeating character: " + result);
		} else {
			System.out.println("Less than " + n + " non-repeating chacaters found.");
		}

	}

	private static char getNthLastNonRepChar(String input, int number) {

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		int count = 0;
		for (int i = input.length() - 1; i >= 0; i--) {
			char c = input.charAt(i);
			if (map.get(c) == 1) {
				count++;
				if (count == number)
					return c;
			}
		}
		return 0;
	}

}
