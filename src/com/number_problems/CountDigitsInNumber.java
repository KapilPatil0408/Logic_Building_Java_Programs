package com.number_problems;

public class CountDigitsInNumber {

	public static void main(String[] args) {

		int number = 4567;
		int digitCount = 0;
		// String length= Integer.toString(number);
		// System.out.println(length.length());

		while (number != 0) {
			int reminder = number % 10;
			digitCount++;
			number = number / 10;
		}
		System.out.println("Total digit counts in number: " + digitCount);
	}

}
