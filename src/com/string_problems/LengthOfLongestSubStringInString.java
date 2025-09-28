package com.string_problems;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubStringInString {

	public static void main(String[] args) {

		String input;
		input = "abcabcbb";
		System.out.println(longestSubstringLength(input));
		input = "bbbbb";
		System.out.println(longestSubstringLength(input));
		input = "pwwkew";
		System.out.println(longestSubstringLength(input));

	}

	public static int longestSubstringLength(String input) {

		Set<Character> set = new HashSet<Character>();
		int left = 0, maxLength = 0;

		for (int right = 0; right < input.length(); right++) {

			char c = input.charAt(right);

			while (set.contains(c)) {
				set.remove(input.charAt(left));
				left++;
			}
			set.add(c);
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;
	}

}
