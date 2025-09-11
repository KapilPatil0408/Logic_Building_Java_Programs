package com.number_problems;

public class CheckNumberPalindrome {

	public static void main(String[] args) {

		int number = 121;
		int lastDigit;
		int reverseNumber = 0;

		int originalNumber = number;

		while (number != 0) {
			lastDigit = number % 10;
			reverseNumber = reverseNumber * 10 + lastDigit;
			number = number / 10;
		}

		if (originalNumber-reverseNumber == 0) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}

}
