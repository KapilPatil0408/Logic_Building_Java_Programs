package com.string_problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringInString {

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
		Set<Character> set = new HashSet<Character>();

		for (int right = 0; right < input.length(); right++) {

			char c = input.charAt(right);
			while (set.contains(c)) {
				set.remove(input.charAt(left));
				left++;
			}
			set.add(c);

			if (right - left + 1 > maxLength) {
				maxLength = (right - left + 1);
				start = left;
			}

		}
		String longestSubstring = input.substring(start, start + maxLength);
		System.out.println("Longest substring:- " + longestSubstring + " with length:- " + maxLength);

	}
}
