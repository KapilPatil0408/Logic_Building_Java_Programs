package com.string_problems;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfCharacterInString {

	public static void main(String[] args) {

		String input = "madam";
		char inputArray[] = input.toCharArray();
		int frequecy[] = new int[256];

		for (char c : inputArray) {
			frequecy[c] = frequecy[c] + 1;
		}

		for (int i = 0; i < frequecy.length; i++) {
			if (frequecy[i] > 0) {
				System.out.println((char) i + " " + frequecy[i]);
			}
		}
	}
}
	