package com.number_problems;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberToInteger {

	public static void main(String[] args) {

		String input = "IX";
		int result = 0;
		int previousValue = 0;
		Map<Character, Integer> hm = new HashMap<>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);

		for (int i = input.length() - 1; i >= 0; i--) {
			char currentCharacter = input.charAt(i);
			int currentValue = hm.get(currentCharacter);

			if (currentValue >= previousValue) {
				result = result + currentValue;
			} else {
				result = result - currentValue;
			}
			previousValue = currentValue;
		}
		System.out.println("Integer number format for "+input+" = "+ result);
	}
	
}
