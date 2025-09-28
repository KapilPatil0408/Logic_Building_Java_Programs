package com.string_problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringInStringUsingMaps {

	public static void main(String[] args) {
		String input;

		input = "abcabcbb";
		longestSubString(input);
		input = "bbbbb";
		longestSubString(input);
		input = "pwwkew";
		longestSubString(input);

	}

	public static void longestSubString(String input) {

		int left = 0, start = 0, maxLength = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int right = 0; right < input.length(); right++) {

			char c = input.charAt(right);
			if (map.containsKey(c) && map.get(c) >= left) {
				left = map.get(c) + 1;
			}
			map.put(c, right);

			if (right - left + 1 > maxLength) {
				maxLength = (right - left + 1);
				start = left;
			}

		}
		String longestSubstring = input.substring(start, start + maxLength);
		System.out.println("Longest substring:- " + longestSubstring + " with length:- " + maxLength);

	}
}
