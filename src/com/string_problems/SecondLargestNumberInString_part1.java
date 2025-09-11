package com.string_problems;

public class SecondLargestNumberInString_part1 {

	public static void main(String[] args) {

		String input = "abc123";
		int num;
		char charArray[] = input.toCharArray();
		int largestNumber = Integer.MIN_VALUE;
		int secondLargestNumber = Integer.MIN_VALUE;

		for (char c : charArray) {
			if (Character.isDigit(c)) {
				num = c - '0';
				if (num > largestNumber) { // Character.getNumericValue(c)
					secondLargestNumber = largestNumber;
					largestNumber = Character.getNumericValue(c);
				} else if (num > secondLargestNumber && num < largestNumber) {
					secondLargestNumber = num;
				}
			}
		}
		System.out.println("Second largest number in String is: " + secondLargestNumber);
	}
}
