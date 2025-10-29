package com.string_problems;

import java.util.Arrays;

public class StringManuplication {

	public static void main(String[] args) {

		String input = "Java is good Python is better";
		String inputArray[] = input.split(" ");
		StringBuilder sb = new StringBuilder();

		int indexOfGood = -1;
		int indexOfBetter = -1;
		String temp = "";

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].equalsIgnoreCase("good")) {
				indexOfGood = i;
			}

			if (inputArray[i].equalsIgnoreCase("better")) {
				indexOfBetter = i;
			}

			if (indexOfGood != -1 && indexOfBetter != -1) {
				break;
			}
		}
		temp = inputArray[indexOfGood];
		inputArray[indexOfGood] = inputArray[indexOfBetter];
		inputArray[indexOfBetter] = temp;

		for (int i = 0; i < inputArray.length; i++) {
			sb.append(inputArray[i]);
			if (i < inputArray.length - 1) {
				sb.append(" ");
			}
		}

		System.out.println(indexOfGood);
		System.out.println(indexOfBetter);
		System.out.println(Arrays.toString(inputArray));
		System.out.println(sb.toString());
	}
}
