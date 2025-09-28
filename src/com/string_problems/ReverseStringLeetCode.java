package com.string_problems;

public class ReverseStringLeetCode {

	public static void main(String[] args) {
		String input;
		input = "the sky is blue";
		reverseWord(input);
		input =  "  hello world  ";
		reverseWord(input);
		input= "a good   example";
		reverseWord(input);
	}

	private static void reverseWord(String input) {

		input = input.trim();
		System.out.println(input);
		String inputArray[] = input.split("\\s+");
		int left = 0;
		int right = inputArray.length - 1;
		while (left < right) {
			String temp = inputArray[left];
			inputArray[left] = inputArray[right];
			inputArray[right] = temp;
			left++;
			right--;

		}

		String output= String.join(" ", inputArray);
		System.out.println("Reversed word: "+ output);

	}
}
