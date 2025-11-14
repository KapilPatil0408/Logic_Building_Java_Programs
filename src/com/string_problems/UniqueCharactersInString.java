package com.string_problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharactersInString {

	public static void main(String[] args) {

		String input = "Programming";
		char inputArray[] = input.toCharArray();

		LinkedHashMap<Character, Integer> hm = new LinkedHashMap();

		for (char c : inputArray) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : hm.entrySet())
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
	}
}
