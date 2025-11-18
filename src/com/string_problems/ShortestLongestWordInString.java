package com.string_problems;

public class ShortestLongestWordInString {

	public static void main(String[] args) {

		String input = "I love cricket and football";

		String inputArray[] = input.split(" ");
		String longestWord = inputArray[0];
		String shortestWord = inputArray[0];

		for (String s : inputArray) {
			if (s.length() > longestWord.length()) {
				longestWord = s;
			}
			if (s.length() < shortestWord.length()) {
				shortestWord = s;
			}
		}
		System.out.println("longest word: " + longestWord);
		System.out.println("shortest word: " + shortestWord);
	}

}
