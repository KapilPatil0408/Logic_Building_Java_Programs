package com.problem5;

import java.util.Arrays;

public class CheckStringAnagram {

	public static void main(String[] args) {

		String input = "nikhil";
		String input1 = "silent";
		checkAnagram(input, input1);
	}

	private static void checkAnagram(String input, String input1) {

		if (input.length() == input.length()) {
			char ch[] = input.toCharArray();
			char ch1[] = input1.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch);
			if(Arrays.equals(ch, ch1)) {
				System.out.println("Strings are anagrams");
			}else {
				System.out.println("Strings are not anagrams");
			}
		} else {
			System.out.println("Strings are not anagrams");
		}
	}
}
