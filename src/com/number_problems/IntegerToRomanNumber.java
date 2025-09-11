package com.number_problems;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRomanNumber {

	public static void main(String[] args) {
		int number = 23;
		StringBuilder sb = new StringBuilder();

		int values[] = { 50, 10, 5, 1 };
		String symbols[] = { "L", "X", "V", "I" };

		for (int i = 0; i < values.length; i++) {
			while (number >= values[i]) {
				number = number - values[i];
				sb.append(symbols[i]);
			}
		}
		System.out.println(sb);
	}
}
