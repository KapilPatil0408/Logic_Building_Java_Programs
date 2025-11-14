package com.string_problems;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfCharacterInString_UsingMap {

	public static void main(String[] args) {

		String input = "madam";
		char inputArray[] = input.toCharArray();

		Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

		for (char character : inputArray) {
			frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);

		}
		for (char c : frequencyMap.keySet()) {
			System.out.println(c + " " + frequencyMap.get(c));
		}
	}

}
