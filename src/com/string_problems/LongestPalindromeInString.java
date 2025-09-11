package com.string_problems;

public class LongestPalindromeInString {

	public static void main(String[] args) {
		String input = "my name is kapil patil. i am an automation tester and my level is high. i have learnt multiple langauges but i struggle in malayalam";

		String inputArray[] = input.split(" ");
		String longestPalindrome = "";

		for (String s : inputArray) {
			String originalString = s.replace("[^a-zA-Z0-9]", "");
			String reverse = "";
			for (int i = originalString.length() - 1; i >= 0; i--) {
				reverse = reverse + s.charAt(i);
			}

//			if (reverse.equals(originalString)) {
//				System.out.println("String is palindrome:-  " + originalString);
//			}
			if (reverse.equals(originalString) && originalString.length() > longestPalindrome.length()) {
				System.out.println("String is palindrome:-  " + originalString);
				longestPalindrome = originalString;
			}
		}

		if (!longestPalindrome.isEmpty()) {
			System.out.println("Longest palindrome is:- " + longestPalindrome);
		} else {
			System.out.println("No palindrome found");
		}
	}

}
